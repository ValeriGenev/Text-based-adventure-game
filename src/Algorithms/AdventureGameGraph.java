package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import textadventureprototype.Player;

public class AdventureGameGraph {

    Player player = new Player();

    private Map<String, List<Neighbor>> graph;

    public AdventureGameGraph() {
        player.hp = 10;
        player.strength = 20;
        player.charisma = 15;
        player.intelligence = 20;
        player.dexterity = 5;
        graph = new HashMap<>();
        graph.put("home", new ArrayList<>(Arrays.asList(
                new Neighbor("wakeUpCallRecollection", 1, 5),
                new Neighbor("wakeUpCallWindow", 2, 10),
                new Neighbor("wakeUpCallKitchen", 3, 15),
                new Neighbor("wakeUpCallDrawer", 4, 20),
                new Neighbor("exitHut", 5, 25))));
        printGraph();
    }

    public void printGraph() {
        for (String vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");
            for (Neighbor neighbor : graph.get(vertex)) {
                System.out.print(neighbor.vertex + "(" + neighbor.distance + ", " + neighbor.time + ") ");
            }
            System.out.println();
        }
    }

    public String dijkstra(String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<VertexDistance> queue = new PriorityQueue<>();
        Map<String, Integer> timeSpent = new HashMap<>(); // new map to track time spent

        // Set initial distances and add starting vertex to queue
        for (String vertex : graph.keySet()) {
            if (vertex.equals(start)) {
                distances.put(vertex, 0);
                queue.add(new VertexDistance(vertex, 0));
            } else {
                distances.put(vertex, Integer.MAX_VALUE);
            }
            previous.put(vertex, null);
            timeSpent.put(vertex, 0); // initialize time spent to 0 for all vertices
        }
        while (!queue.isEmpty()) {
            VertexDistance current = queue.poll();
            if (current.vertex.equals(end)) {
                // Found shortest path to end vertex
                List<String> path = new ArrayList<>();
                while (previous.get(current.vertex) != null) {
                    path.add(current.vertex);
                    current.vertex = previous.get(current.vertex);
                }
                path.add(start);
                System.out.print("Shortest path from " + start + " to " + end + ": ");
                for (int i = path.size() - 1; i >= 0; i--) {
                    System.out.print(path.get(i) + " ");
                }
                int totalTimeSpent = timeSpent.get(end); // calculate total time spent
                // System.out.println("Total time spent: " + totalTimeSpent);
                return "Total time spent: " + totalTimeSpent;
            }
            for (Neighbor neighbor : graph.get(current.vertex)) {
                int requiredStrength = 0; // default value for required strength
                int requiredDexterity = 0; // default value for required dexterity
                int requiredIntelligence = 0;
                int requiredCharisma = 0;
                switch (neighbor.vertex) {
                    case "wakeUpCallRecollection":
                        requiredStrength = 10;
                        break;
                    case "wakeUpCallWindow":
                        requiredDexterity = 15;
                        break;
                    case "wakeUpCallKitchen":
                        requiredStrength = 15;
                        break;
                    case "wakeUpCallDrawer":
                        requiredDexterity = 20;
                        break;
                }
                if (player.strength >= requiredStrength && player.dexterity >= requiredDexterity) {
                    int distance = distances.get(current.vertex) + neighbor.distance;
                    int time = timeSpent.get(current.vertex) + neighbor.time; // increment time spent for neighbor vertex

// get required stats for the next node
                    switch (neighbor.vertex) {
                        case "wakeUpCallRecollection":
                            requiredStrength = 10;
                            requiredDexterity = 0;
                            requiredIntelligence = 0;
                            requiredCharisma = 0;
                            break;
                        case "wakeUpCallWindow":
                            requiredStrength = 0;
                            requiredDexterity = 15;
                            requiredIntelligence = 0;
                            requiredCharisma = 0;
                            break;
                        case "wakeUpCallKitchen":
                            requiredStrength = 0;
                            requiredDexterity = 0;
                            requiredIntelligence = 10;
                            requiredCharisma = 0;
                            break;
                        case "wakeUpCallDrawer":
                            requiredStrength = 0;
                            requiredDexterity = 0;
                            requiredIntelligence = 0;
                            requiredCharisma = 5;
                            break;
                        default:
                            break;
                    }
// check if player meets required stats for next node
                    if (player.strength >= requiredStrength && player.dexterity >= requiredDexterity && player.intelligence >= requiredIntelligence && player.charisma >= requiredCharisma) {
                        if (distance < distances.get(neighbor.vertex)) {
                            distances.put(neighbor.vertex, distance);
                            previous.put(neighbor.vertex, current.vertex);
                            queue.add(new VertexDistance(neighbor.vertex, distance));
                            timeSpent.put(neighbor.vertex, time);
                        }
                    } else {
                        System.out.println("Cannot proceed to " + neighbor.vertex + ". Required stats: Strength " + requiredStrength + ", Dexterity " + requiredDexterity + ", Intelligence " + requiredIntelligence + ", Charisma " + requiredCharisma);
                    }
                }
            }

        }
        // System.out.println();
        return "No path found";
    }

    class Neighbor {

        String vertex;
        int distance;
        int time;

        public Neighbor(String vertex, int distance, int time) {
            this.vertex = vertex;
            this.distance = distance;
            this.time = time;
        }

    }

    class VertexDistance implements Comparable<VertexDistance> {

        String vertex;
        int distance;

        public VertexDistance(String vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(VertexDistance other) {
            return Integer.compare(this.distance, other.distance);
        }

    }
}


    }


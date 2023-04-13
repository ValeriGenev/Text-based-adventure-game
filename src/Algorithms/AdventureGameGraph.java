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
        player.dexterity = 15;
        graph = new HashMap<>();
        graph.put("home", new ArrayList<>(Arrays.asList(
                new Neighbor("castle", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("forest", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4),
                new Neighbor("wakeUpCallRecollection", 3, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                new Neighbor("wakeUpCallWindow", 4, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                new Neighbor("wakeUpCallKitchen", 5, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                new Neighbor("wakeUpCallDrawer", 6, 1, 2, 3, 4, 5, 6, 7, 8, 9))));
        graph.put("castle", new ArrayList<>(Arrays.asList(
                new Neighbor("monster", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("goblinCombat", 2, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("alternativeMageCombat", 3, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("alternativePaladinCombat", 4, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("alternativeRangerCombat", 5, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("alternativeMonkCombat", 6, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
        graph.put("forest", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("monster", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4),
                new Neighbor("rabbitCombat", 3, 10, 11, 11, 11, 11, 1, 2, 3, 4))));
        graph.put("monster", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4),
                new Neighbor("playerAttack", 3, 10, 11, 11, 11, 11, 1, 2, 3, 4),
                new Neighbor("monsterAttack", 4, 10, 11, 11, 11, 11, 1, 2, 3, 4))));
        graph.put("wakeUpCallRecollection", new ArrayList<>(Arrays.asList(
                new Neighbor("wakeUpCallWindow", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("wakeUpCallKitchen", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4))));
        graph.put("wakeUpCallWindow", new ArrayList<>(Arrays.asList(
                new Neighbor("wakeUpCallRecollection", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
        graph.put("wakeUpCallKitchen", new ArrayList<>(Arrays.asList(
                new Neighbor("wakeUpCallRecollection", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("wakeUpCallDrawer", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4))));
        graph.put("wakeUpCallDrawer", new ArrayList<>(Arrays.asList(
                new Neighbor("wakeUpCallKitchen", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));

        graph.put("north", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
        graph.put("east", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
        graph.put("west", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))
        );
        graph.put("south", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))
        );

        graph.put("rabbitCombat", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("win", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4),
                new Neighbor("lose", 3, 15, 12, 12, 12, 12, 2, 3, 4, 5)))
        );
        graph.put("exitHut", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))
        );
        graph.put("goblinCombat", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                new Neighbor("win", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4),
                new Neighbor("lose", 3, 15, 11, 11, 11, 11, 1, 2, 3, 4))));
        graph.put("win", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
        graph.put("lose", new ArrayList<>(Arrays.asList(
                new Neighbor("home", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
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
                int requiredStrength = neighbor.requiredStrength; // default value for required strength
                int requiredDexterity = neighbor.requiredDexterity; // default value for required dexterity
                int requiredIntelligence = neighbor.requiredIntelligence;
                int requiredCharisma = neighbor.requiredCharisma;

                // check if player meets required stats for next node
                if (player.strength >= requiredStrength && player.dexterity >= requiredDexterity
                        && player.intelligence >= requiredIntelligence && player.charisma >= requiredCharisma) {
                    int distance = distances.get(current.vertex) + neighbor.distance;
                    int time = timeSpent.get(current.vertex) + neighbor.time; // increment time spent for neighbor
                    // vertex
                    if (distance < distances.get(neighbor.vertex)) {
                        distances.put(neighbor.vertex, distance);
                        previous.put(neighbor.vertex, current.vertex);
                        queue.add(new VertexDistance(neighbor.vertex, distance));
                        timeSpent.put(neighbor.vertex, time);
                        player.strength += neighbor.strengthGain;
                        player.charisma += neighbor.charismaGain;
                        player.intelligence += neighbor.intelligenceGain;
                        player.dexterity += neighbor.dexterityGain;
                    }
                } else {
                    System.out.println("Cannot proceed to " + neighbor.vertex + ". Required stats: Strength "
                            + requiredStrength + ", Dexterity " + requiredDexterity + ", Intelligence "
                            + requiredIntelligence + ", Charisma " + requiredCharisma);
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
        int requiredStrength;
        int requiredDexterity;
        int requiredIntelligence;
        int requiredCharisma;
        int strengthGain;
        int dexterityGain;
        int intelligenceGain;
        int charismaGain;

        public Neighbor(String vertex, int distance, int time, int requiredStrength, int requiredDexterity,
                int requiredIntelligence, int requiredCharisma, int strengthGain, int dexterityGain,
                int intelligenceGain, int charismaGain) {
            this.vertex = vertex;
            this.distance = distance;
            this.time = time;
            this.requiredStrength = requiredStrength;
            this.requiredDexterity = requiredDexterity;
            this.requiredIntelligence = requiredIntelligence;
            this.requiredCharisma = requiredCharisma;
            this.strengthGain = strengthGain;
            this.dexterityGain = dexterityGain;
            this.intelligenceGain = intelligenceGain;
            this.charismaGain = charismaGain;
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



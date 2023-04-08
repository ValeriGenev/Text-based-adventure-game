package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Valeri
 */
public class AdventureGameGraph {

    private Map<String, List<Neighbor>> graph;

    public AdventureGameGraph() {
        graph = new HashMap<>();
        Map<String, List<Neighbor>> graph = new HashMap<>();
        graph.put("cityStreets", new ArrayList<>(Arrays.asList(
                new Neighbor("north", 1),
                new Neighbor("east", 2),
                new Neighbor("west", 3),
                new Neighbor("south", 4))));
        graph.put("cityHall", new ArrayList<>(Arrays.asList(
                new Neighbor("cityHallMagistrate", 1),
                new Neighbor("cityHallMagistrateOffice", 2))));
        graph.put("pub", new ArrayList<>(Arrays.asList(
                new Neighbor("pubAdventurers", 1),
                new Neighbor("pubUnusual", 2),
                new Neighbor("pubBeer", 3),
                new Neighbor("pubDeludedWoman", 4),
                new Neighbor("pubRebels", 5),
                new Neighbor("pubRipoff", 6))));
        graph.put("library", new ArrayList<>(Arrays.asList(
                new Neighbor("libraryConfrontation", 1),
                new Neighbor("libraryInquiry", 2),
                new Neighbor("libraryLost", 3),
                new Neighbor("libraryLostContinuation", 4),
                new Neighbor("libraryTreat", 5),
                new Neighbor("libraryTreatContinuation", 6),
                new Neighbor("libraryTreatDeparture", 7),
                new Neighbor("libraryFalseRemorse", 8),
                new Neighbor("libraryGutting", 9))));
        graph.put("garrison", new ArrayList<>(Arrays.asList(
                new Neighbor("garrisonSoldiers", 1),
                new Neighbor("garrisonCommisar", 2),
                new Neighbor("garrisonDeafVeteran", 3),
                new Neighbor("garrisonCommisarStateOfAffairs", 4),
                new Neighbor("garrisonCommisarInquiry", 5),
                new Neighbor("garrisonCommisarWork", 6),
                new Neighbor("garrisonCommisarBrother", 7))));
        graph.put("deludedWoman", new ArrayList<>(Arrays.asList(
                new Neighbor("deludedWoman", 1))));
        graph.put("blacksmith", new ArrayList<>(Arrays.asList(
                new Neighbor("blacksmith", 1))));
        graph.put("win", new ArrayList<>(Arrays.asList(
                new Neighbor("toTitleScreen", 1))));
        graph.put("home", new ArrayList<>(Arrays.asList(
                new Neighbor("wakeUpCallRecollection", 1),
                new Neighbor("wakeUpCallWindow", 2),
                new Neighbor("wakeUpCallKitchen", 3),
                new Neighbor("wakeUpCallDrawer", 4),
                new Neighbor("exitHut", 5))));
        graph.put("monsterFakeHydra", new ArrayList<>(Arrays.asList(
                new Neighbor("playerAttack", 1),
                new Neighbor("monsterAttack", 2),
                new Neighbor("win", 3),
                new Neighbor("lose", 4))));
    }

    public void printGraph() {
        for (String vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");
            for (Neighbor neighbor : graph.get(vertex)) {
                System.out.print(neighbor.vertex + "(" + neighbor.distance + ") ");
            }
            System.out.println();
        }
    }

    public void dijkstra(String start, String end) {
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
// В началото, да се предостави избор за статистика, лимит от точки разпределяне на различни статистики,ако се изпълняват изискванията да се мине от едно място на друго, да се преминава
// If in a given path there is a mob that is easily beaten
// wEight of the nodes can be a funciton of на героя. Той има статистика, да може и дане може да я мине, ако има определена статистика. (You need ot pass this if you have 17 attack. If not, I don't), randomization
//Initially, have it return static values. THen, accept parameters. Then, show how long it is and what sequence to pass through. Shortest path algorithms - take a look at others.

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
                System.out.println("Total time spent: " + totalTimeSpent);
                return;
            }
            for (Neighbor neighbor : graph.get(current.vertex)) {
                int distance = distances.get(current.vertex) + neighbor.distance;
                if (distance < distances.get(neighbor.vertex)) {
                    distances.put(neighbor.vertex, distance);
                    previous.put(neighbor.vertex, current.vertex);
                    queue.add(new VertexDistance(neighbor.vertex, distance));
                    timeSpent.put(neighbor.vertex, timeSpent.get(current.vertex) + neighbor.time); // increment time spent for neighbor vertex
                }
            }
        }

        System.out.println("No path found");

        // if end vertex not reached, no path found
    }
}
    class Neighbor {

        String vertex;
        int distance;
        int time;

        public Neighbor(String vertex, int distance) {
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


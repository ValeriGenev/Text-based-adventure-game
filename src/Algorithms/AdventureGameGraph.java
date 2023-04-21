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
                player.hp = 100;
                player.strength = 20;
                player.charisma = 30;
                player.intelligence = 40;
                player.dexterity = 30;
                graph = new HashMap<>();

                graph.put("wakeUpHouse", new ArrayList<>(Arrays.asList(
                                new Neighbor("wakeUpLookAround", 3, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                                new Neighbor("wakeUpBasement", 4, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                                new Neighbor("wakeUpLongsword", 5, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                                new Neighbor("exitHouse", 6, 1, 2, 3, 4, 5, 6, 7, 8, 9))));
                graph.put("wakeUpLookAround", new ArrayList<>(Arrays.asList(
                                new Neighbor("wakeUpBasement", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                                new Neighbor("wakeUpLookAroundHopeless", 2, 10, 10, 11, 11, 11, 1, 2, 3, 4))));
                new Neighbor("exitHouse", 2, 10, 11, 10, 11, 11, 1, 2, 3, 4);
                graph.put("wakeUpBasement", new ArrayList<>(Arrays.asList(
                                new Neighbor("loseBySuffocation", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
                graph.put("wakeUpLongsword", new ArrayList<>(Arrays.asList(
                                new Neighbor("wakeUpLookAroundHopeless", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2),
                                new Neighbor("exitHouse", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4))));
                new Neighbor("wakeUpBasement", 2, 10, 11, 11, 11, 11, 1, 2, 3, 4);
                graph.put("exitHouse", new ArrayList<>(Arrays.asList(
                                new Neighbor("cityHall", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
                new Neighbor("pub", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2);
                new Neighbor("garrison", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2);
                graph.put("wakeUpLookAroundHopeless", new ArrayList<>(Arrays.asList(
                                new Neighbor("loseBySuffocation", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
                graph.put("garrison", new ArrayList<>(Arrays.asList(
                                new Neighbor("garrisonCommisar", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("garrisonSoldiers", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                new Neighbor("garrisonDeafVeteran", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0);
                new Neighbor("garrisonCommisarLeave", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0);
                graph.put("garrisonSoldiers", new ArrayList<>(Arrays.asList(
                                new Neighbor("garrisonSoldiersExplanation", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("garrisonSoldiersCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                new Neighbor("garrisonSoldiersModified", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0);
                graph.put("garrisonSoldiersExplanation", new ArrayList<>((Arrays.asList(
                                new Neighbor("garrison", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))));
                graph.put("garrisonCommisar", new ArrayList<>(Arrays.asList(
                                new Neighbor("garrisonCommisarDisguise", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("garrisonCommisarLeave", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("garrisonCommisarLeave", new ArrayList<>(Arrays.asList(
                                new Neighbor("garrisonCommisarDisguise", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("garrisonCommisarDisguise", new ArrayList<>(Arrays.asList(
                                new Neighbor("garrisonCommisarGameOver", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("garrisonCommisarGameOver", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("garrisonCommisarGameOverAlternative", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("garrisonDeafVeteran", new ArrayList<>(Arrays.asList(
                                new Neighbor("AdventurersTransition", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersTransition", new ArrayList<>(Arrays.asList(
                                new Neighbor("AdventurersRanger", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersMage", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersPaladin", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersMonk", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("pub", new ArrayList<>(Arrays.asList(
                                new Neighbor("pubEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("pubConvincing", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("pubFight", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("pubEscape", new ArrayList<>(Arrays.asList(
                                new Neighbor("cityHall", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("garrison", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("pubConvincing", new ArrayList<>(Arrays.asList(
                                new Neighbor("pubCapture", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("pubRun", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("pubRun", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 2, 2, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("pubCapture", new ArrayList<>(Arrays.asList(
                                new Neighbor("win", 1, 1, 1, 2, 3, 4, 5, 6, 7, 8))));
                graph.put("AdventurersMage", new ArrayList<>(Arrays.asList(
                                new Neighbor("AdventurersMageLocation", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersPaladin", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersRanger", 2, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                                new Neighbor("AdventurersMonk", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersMonk", new ArrayList<>(Arrays.asList(
                                new Neighbor("AdventurersMonkLocation", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersPaladin", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersRanger", 2, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                                new Neighbor("AdventurersMage", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersRanger", new ArrayList<>(Arrays.asList(
                                new Neighbor("AdventurersRangerLocation", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersPaladin", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersMage", 2, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                                new Neighbor("AdventurersMonk", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersPaladin", new ArrayList<>(Arrays.asList(
                                new Neighbor("AdventurersPaladinLocation", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersMage", 1, 1, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("AdventurersRanger", 2, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                                new Neighbor("AdventurersMonk", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersMageLocation", new ArrayList<>(Arrays.asList(
                                new Neighbor("alternativeMageCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersMonkLocation", new ArrayList<>(Arrays.asList(
                                new Neighbor("alternativeMonkCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersRangerLocation", new ArrayList<>(Arrays.asList(
                                new Neighbor("alternativeRangerCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("AdventurersPaladinLocation", new ArrayList<>(Arrays.asList(
                                new Neighbor("alternativePaladinCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("cityHall", new ArrayList<>(Arrays.asList(
                                new Neighbor("cityHallMagistrate", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHallDefenders", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHallSurrender", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHallEquipment", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("cityHallEquipment", new ArrayList<>((Arrays.asList(
                                new Neighbor("cityHall", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))));
                graph.put("cityHallMagistrateInquiry", new ArrayList<>(Arrays.asList(
                                new Neighbor("cityHallMagistrateMessenger", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHallDefenders", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHall", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("cityHallMagistrateOffice", new ArrayList<>(Arrays.asList(
                                new Neighbor("cityHallMagistrateInquiry", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("loseByBleedingOut", new ArrayList<>((Arrays.asList(
                                new Neighbor("lose", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))));
                graph.put("cityHallMagistrateMessenger", new ArrayList<>(Arrays.asList(
                                new Neighbor("cityHallMagistrateMessengerEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHallMagistrateMessengerChaos", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("cityHallSurrender", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("cityHallMagistrateMessengerEscape", new ArrayList<>(Arrays.asList(
                                new Neighbor("win", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("cityHallMagistrateMessengerChaos", new ArrayList<>(Arrays.asList(
                                new Neighbor("loseByBleedingOut", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("cityHallDefenders", new ArrayList<>((Arrays.asList(
                                new Neighbor("cityHall", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2)))));
                graph.put("alternativeRangerCombat", new ArrayList<>(Arrays.asList(
                                new Neighbor("attemptedEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("playerAttackRanger", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("alternativePaladinCombat", new ArrayList<>(Arrays.asList(
                                new Neighbor("attemptedEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("playerAttackPaladin", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("alternativeMageCombat", new ArrayList<>(Arrays.asList(
                                new Neighbor("attemptedEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("playerAttackMage", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("alternativeMonkCombat", new ArrayList<>(Arrays.asList(
                                new Neighbor("attemptedEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("playerAttackMonk", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("garrisonSoldiersCombat", new ArrayList<>(Arrays.asList(
                                new Neighbor("attemptedEscape", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("playerAttackSoldier", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("attemptedEscape", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("playerAttackPaladin", new ArrayList<>(Arrays.asList(
                                new Neighbor("win", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("monsterAttackPaladin", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("playerAttackMage", new ArrayList<>(Arrays.asList(
                                new Neighbor("win", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("monsterAttackMage", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("playerAttackMonk", new ArrayList<>(Arrays.asList(
                                new Neighbor("win", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("monsterAttackMonk", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("playerAttackRanger", new ArrayList<>(Arrays.asList(
                                new Neighbor("win", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("monsterAttackRanger", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("playerAttackSoldier", new ArrayList<>(Arrays.asList(
                                new Neighbor("garrisonSoldiersModified", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("monsterAttackSoldier", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("monsterAttackPaladin", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("alternativePaladinCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("monsterAttackMage", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("monsterAttackMage", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("monsterAttackRanger", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("alternativeRangerCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("monsterAttackMonk", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("alternativeMonkCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("monsterAttackSoldier", new ArrayList<>(Arrays.asList(
                                new Neighbor("lose", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0),
                                new Neighbor("garrisonSoldiersCombat", 3, 3, 3, 4, 5, 6, 7, 8, 9, 0))));
                graph.put("win", new ArrayList<>(Arrays.asList(
                                new Neighbor("wakeUpHouse", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
                graph.put("lose", new ArrayList<>(Arrays.asList(
                                new Neighbor("wakeUpHouse", 1, 5, 10, 10, 10, 10, 1, 1, 0, 2))));
                printGraph();
        }

        public void printGraph() {
                for (String vertex : graph.keySet()) {
                        System.out.print(vertex + " -> ");
                        for (Neighbor neighbor : graph.get(vertex)) {
                                System.out.print(neighbor.vertex + "(" + neighbor.distance + ", " + neighbor.time
                                                + ") ");
                        }
                        System.out.println();
                }
        }

        public String dijkstra(String start, String end) {
                Map<String, Integer> distances = new HashMap<>();
                Map<String, String> previous = new HashMap<>();
                PriorityQueue<VertexDistance> queue = new PriorityQueue<>();
                Map<String, Integer> timeSpent = new HashMap<>(); // new map to track time spent
                int totalTimeSpent = 0;
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
                        System.out.println("Current:" + current.vertex);
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
                                return "Total time spent: " + totalTimeSpent;
                        }
                        for (Neighbor neighbor : graph.get(current.vertex)) {
                                System.out.println("Current:" + neighbor.vertex);
                                int requiredStrength = neighbor.requiredStrength; // default value for required strength
                                int requiredDexterity = neighbor.requiredDexterity; // default value for required
                                                                                    // dexterity
                                int requiredIntelligence = neighbor.requiredIntelligence;
                                int requiredCharisma = neighbor.requiredCharisma;
                                // check if player meets required stats for next node
                                if (player.strength >= requiredStrength && player.dexterity >= requiredDexterity
                                                && player.intelligence >= requiredIntelligence
                                                && player.charisma >= requiredCharisma) {
                                        System.out.println("We pass the node.");
                                        int distance = distances.get(current.vertex) + neighbor.distance;
                                        int time = timeSpent.get(current.vertex) + neighbor.time;
                                        totalTimeSpent += time;

                                        if (distances.containsKey(neighbor.vertex)
                                                        && distance < distances.get(neighbor.vertex)) {
                                                System.out.println("Put distance for neighbour: "
                                                                + neighbor.vertex);
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
                                        return "Cannot proceed to " + neighbor.vertex
                                                        + ". Required stats: Strength "
                                                        + requiredStrength + ", Dexterity " + requiredDexterity
                                                        + ", Intelligence "
                                                        + requiredIntelligence + ", Charisma "
                                                        + requiredCharisma;
                                }
                        }
                }
                return "No path found" + "Total time spent: " + totalTimeSpent;
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

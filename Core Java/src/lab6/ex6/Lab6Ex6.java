package lab6.ex6;

import java.util.*;

public class Lab6Ex6  {

    // Method to find eligible voters based on ages
    public static List<String> votersList(Map<String, Integer> ageMap) {
        // Create a list to store the names of eligible voters
        List<String> eligibleVoters = new ArrayList<>();

        // Iterate through the map entries (Name, age)
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            // Check if the person is eligible to vote (age > 18)
            if (age > 18) {
                // Add the name to the list of eligible voters
                eligibleVoters.add(name);
            }
        }

        // Return the list of eligible voters
        return eligibleVoters;
    }

    public static void main(String[] args) {
        // Create a map of Name and age
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 22);
        ageMap.put("Bob", 16);
        ageMap.put("Charlie", 20);
        ageMap.put("David", 17);

        // Get the list of eligible voters by calling the votersList method
        List<String> eligibleVoters = votersList(ageMap);

        // Print the list of eligible voters
        System.out.println("List of eligible voters: " + eligibleVoters);
    }
}


	
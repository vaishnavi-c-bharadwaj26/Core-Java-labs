package lab6.ex1;

import java.util.*;

public class Lab6Ex1 {
    public List<Object> getValues(HashMap<Object, Object> hashMap) {
        if (hashMap == null) {
            return null;
        }

        List<Object> values = new ArrayList<>(hashMap.values());

        // Sort the values
        Collections.sort(values, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return String.valueOf(o1).compareTo(String.valueOf(o2));
            }
        });

        return values;
    }

    public static void main(String[] args) {
        Lab6Ex1 obj = new Lab6Ex1();

        // Create a sample HashMap
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("A", 3);
        hashMap.put("B", 1);
        hashMap.put("C", 2);
        hashMap.put("D", 6);
        hashMap.put("E", 5);

        List<Object> sortedValues = obj.getValues(hashMap);

        // Print the sorted values
        System.out.println("Sorted Values: " + sortedValues);
    }
}


//
//package lab6.ex1;
//
//import java.util.*;
//import java.util.Map.Entry;
//
//
//public class Lab6Ex1 {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        map.put("A", 5);
//        map.put("B", 7);
//        map.put("C", 3);
//        map.put("D", 1);
//        map.put("E", 2);
//        map.put("F", 8);
//        map.put("G", 4);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            list.add(entry.getValue());
//        }
//        Collections.sort(list); 
//        for (int num : list) {
//            for (Entry<String, Integer> entry : map.entrySet()) {
//                if (entry.getValue().equals(num)) {
//                    sortedMap.put(entry.getKey(), num);
//                }
//            }
//        }
//        System.out.println(sortedMap);
//    }
//}




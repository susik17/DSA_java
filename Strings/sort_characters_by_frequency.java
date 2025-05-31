import java.util.*;

class Solution {
    //method-2 :Using pair[] + sorting
    public static String sortCharactersByFrequency(String s) {
        Pair[] arr = new Pair[123];
        for (int i = 0; i < 123; i++) arr[i] = new Pair(0, (char) i);

        for (char ch : s.toCharArray()) {
            arr[ch].first++;
            arr[ch].second = ch;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 123; i++) {
            for (int j = 0; j < arr[i].first; j++) {
                ans.append(arr[i].second);
            }
        }

        return ans.toString();
    }
    
    public static class Pair implements Comparable<Pair> {
        int first;
        char second;
    
        Pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    
        public int compareTo(Pair other) {
            return Integer.compare(this.first, other.first);
        }
    }

    
    
 /*
 //Method - 1 :Using hashmap+list sort
    public static String sortCharactersByFrequency(String s) {
        // Step 1: Count character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Convert map to list of entries and sort by value (descending)
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());//descending

        // Step 3: Build result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            result.append(String.valueOf(ch).repeat(freq));  // Java 11+
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(sortCharactersByFrequency(s));
    }
}
*/
    




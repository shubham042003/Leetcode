class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }

        HashMap<Integer, List<Character>> freqMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : h.entrySet()) {
            int freq = entry.getValue();
            freqMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(entry.getKey());
        }

        int[] a = new int[freqMap.size()];
        int i = 0;
        for (int freq : freqMap.keySet()) {
            a[i++] = freq;
        }

        Arrays.sort(a); 
        StringBuilder w = new StringBuilder();
        for (int j = a.length - 1; j >= 0; j--) {
            int freq = a[j];
            List<Character> chars = freqMap.get(freq);
            for (char c : chars) {
                for (int k = 0; k < freq; k++) {
                    w.append(c);
                }
            }
        }
        return w.toString();
    }
}
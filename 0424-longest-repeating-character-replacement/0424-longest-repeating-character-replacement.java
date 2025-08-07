class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxCount = 0;
        int maxLength = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            maxCount = Math.max(maxCount, freqMap.get(ch));

            if ((end - start + 1) - maxCount > k) {
                char leftChar = s.charAt(start);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
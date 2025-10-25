class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1;

        int left = 0, right = 0, maxLen = 1;

        while (right < n - 1) {
            if (arr[right] == arr[right + 1]) {
                right++;
                left = right;
            } else {
                while (right < n - 1 &&
                      ((arr[right] > arr[right + 1] && (right == left ||arr[right - 1] < arr[right])) ||
                       (arr[right] < arr[right + 1] && (right == left || arr[right - 1] > arr[right])))) {
                    right++;
                }
                maxLen = Math.max(maxLen, right - left + 1);
                left = right;
            }
        }

        return maxLen;
    }
}

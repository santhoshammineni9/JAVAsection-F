class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int number : nums) {
            int digits = 0;
            int temp = number;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
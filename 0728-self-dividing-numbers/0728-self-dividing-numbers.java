class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();
        for (int number = left; number <= right; number++) {
            int temp = number;
            boolean valid = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || number % digit != 0) {
                    valid = false;
                    break;
                }
                temp /= 10;
            }
            if (valid) {
                answer.add(number);
            }
        }
        return answer;
    }
}
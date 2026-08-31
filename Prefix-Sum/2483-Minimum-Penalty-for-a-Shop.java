class Solution {
    public int bestClosingTime(String customers) {

        int penalty = 0;

        // If shop closes at hour 0,
        // every Y causes a penalty
        for (char ch : customers.toCharArray()) {
            if (ch == 'Y') {
                penalty++;
            }
        }

        int minPenalty = penalty;
        int answer = 0;

        for (int i = 0; i < customers.length(); i++) {

            if (customers.charAt(i) == 'Y') {
                penalty--;   // Y is now before closing
            } else {
                penalty++;   // N is now before closing
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                answer = i + 1;
            }
        }

        return answer;
    }
}

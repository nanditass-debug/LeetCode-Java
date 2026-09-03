class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int remainingDays = n % 7;
        
        int firstWeekSum = 28;
        int lastWeekSum = 28 + 7 * (weeks - 1);
        int total = weeks * (firstWeekSum + lastWeekSum) / 2;
        
        int mondayMoney = weeks + 1;
        for (int i = 0; i < remainingDays; i++) {
            total += mondayMoney + i;
        }
        
        return total;
    }
}

class Solution {
    public int trailingZeroes(int n) {
        int count2 = 0, count5 = 0;

        for(int i = 1; i <= n; i++) {
            count5 += getDivisors(i, 5);
            count2 += getDivisors(i, 2);
        }

        return Math.min(count2, count5);
    }

    public int getDivisors(int n, int x) {
        int count = 0;
        while(n % x == 0){
            count++;
            n /= x;
        }
        return count;
    }
}

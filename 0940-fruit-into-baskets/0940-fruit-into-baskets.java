class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) return 0;
        int preval = fruits[0], curval = fruits[0];
        int curmax = 1, maxcount = 1, tailCount = 1;
        for (int i = 1; i < fruits.length; i++) {
            int f = fruits[i];
            if (f == curval) {
                curmax++;
                tailCount++;
            } else if (f == preval) {
                preval = curval;
                curval = f;
                curmax++;
                tailCount = 1;
            } else {
                curmax = tailCount + 1;
                preval = curval;
                curval = f;
                tailCount = 1;
            }
            if (curmax > maxcount) {
                maxcount = curmax;
            }
        }
        return maxcount;
    }
}
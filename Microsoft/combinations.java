class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> combinations = 
                  new ArrayList<>();

        List<Integer> subset = new ArrayList<>();

        int sum = 0;

        findCombinations(1, 9, k, n, sum, subset, combinations);
        return combinations;
    }

    void findCombinations(int start, int end, int k, int n, int sum, List<Integer> subset, List<List<Integer>> combinations) {
        if(k == 0) {
            if(sum == n) {
                combinations.add(new ArrayList(subset));
            }
            return;
        } 

        if(start > end) {
            return;
        }

        if(sum > n) {
            return;
        }

        sum+=start;
        subset.add(start);
        findCombinations(start+1, end, k-1, n, sum, subset, combinations);
        
        
        sum-=start;
        subset.remove(subset.size()-1);
        findCombinations(start+1, end, k, n, sum, subset, combinations);
    }
}

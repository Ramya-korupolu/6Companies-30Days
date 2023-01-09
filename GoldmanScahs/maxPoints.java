class Solution {
    public int maxPoints(int[][] points) {
        
        double slope;
        int max = 0;

        for(int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++) {   
                if(i != j){
                    if(points[j][0] == points[i][0]) {
                    slope=Double.POSITIVE_INFINITY;
                    } else {
                        slope = (points[j][1] - points[i][1]) / (double)(points[j][0] - points[i][0]);
                    }
                    //System.out.println(map.getOrDefault(slope,0));
                    map.put( slope , map.getOrDefault(slope,0)+1);
                    max = Math.max(max, map.get(slope));
                }
                
            }
            //System.out.println(map);
        }
        

        return max + 1;
    }
}

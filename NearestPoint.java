public class NearestPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int distance = Integer.MAX_VALUE;

        for(int i=0; i<points.length; i++){
            if(points[i][0]==x){
                int dist = Math.abs(points[i][1] - y);
                if(dist < distance){
                    distance = dist;
                    index = i;
                }
            }
            if(points[i][1]==y){
                int dist = Math.abs(points[i][0] - x);
                if(dist < distance){
                    distance = dist;
                    index = i;
                }
            }
        }
        return index;
    }
}

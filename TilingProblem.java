public class TilingProblem {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(floorTiling(n));
    }

    public static int floorTiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return floorTiling(n-1) + floorTiling(n-2);
    }
}

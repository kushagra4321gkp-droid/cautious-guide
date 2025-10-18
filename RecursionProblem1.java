public class RecursionProblem1 {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.decreasingOrder(5);
    }
}

class Recursion{
    void decreasingOrder(int n){
        // if(n==0){
        //     return;
        // }
        // decreasingOrder((n-1));
        // System.out.println(n);

        System.out.println(n);
        if(n==0){
            return;
        }
        decreasingOrder(n-1);
        
    }
}

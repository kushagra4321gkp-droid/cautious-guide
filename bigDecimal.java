import java.math.BigDecimal;

public class bigDecimal{
    public static void main(String args[]){
        int a = 123456789;
        float f = a;
        System.out.println(f);

        BigDecimal bd = new BigDecimal(a);
        System.out.println(bd);
    }
}
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalDemo {
    public static void main(String[] args) {
//        double a = .7;
//        double b = .1;
//        System.out.println(a + b);

        BigDecimal a = new BigDecimal(.7);
        BigDecimal b = new BigDecimal(.1);
        BigDecimal answer = a.add(b);
        BigDecimal display = answer.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Answer before the round off and scale");
        System.out.println(answer);
        System.out.println("Answer after the rounding off and scale");
        System.out.println(display);

    }
}

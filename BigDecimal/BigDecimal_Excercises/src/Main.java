import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //Precision: Total number of significant digits
        //Scale: Number of digits to the right of the decimal point

        //BigDecimal mainValue = new BigDecimal("1113.141592653589793").setScale(10, RoundingMode.HALF_DOWN);
        //BigDecimal mainValue = new BigDecimal("31.25").setScale(1, RoundingMode.HALF_DOWN);
        //mainValue = mainValue.setScale(10, RoundingMode.HALF_DOWN);

        BigDecimal mainValue = new BigDecimal("125").divide(new BigDecimal("80"), 4, RoundingMode.HALF_DOWN).multiply(new BigDecimal("20"));
        mainValue = mainValue.setScale(2, RoundingMode.HALF_DOWN);

//        BigDecimal mainValue = new BigDecimal("125").divide(new BigDecimal("80"), new MathContext(5, RoundingMode.HALF_DOWN)).multiply(new BigDecimal("20"));
//        mainValue = mainValue.setScale(2);
        System.out.println(mainValue);


        // 1.1
        BigDecimal round = new BigDecimal("3.53456").round(new MathContext(4, RoundingMode.HALF_UP));
        // 2.1
        BigDecimal scale = new BigDecimal("3.53456").setScale(4, RoundingMode.HALF_UP);

        System.out.println("round: " + round);
        System.out.println("scale: " + scale);

        // 2.1
        BigDecimal round2 = new BigDecimal("135.3456").round(new MathContext(4, RoundingMode.HALF_UP));
        //result = 35.35
        System.out.println("round2: " + round2);
        // 2.2
        BigDecimal scale2 = new BigDecimal("135.3456").setScale(4, RoundingMode.HALF_UP);
        // result = 35.3456
        System.out.println("scale2: " + scale2);
    }
}
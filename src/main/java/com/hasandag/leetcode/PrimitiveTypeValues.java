public class PrimitiveTypeValues {
    public static void main(String[] args) {


        System.out.println("Long max value is "+Long.MAX_VALUE);
        System.out.println("Float max value is "+Float.MAX_VALUE);
        System.out.println("Double max value is "+Double.MAX_VALUE);
        System.out.println();

        if(Long.MAX_VALUE>Float.MAX_VALUE)
            System.out.println("Long max value is bigger than Float!");
        else
            System.out.println("Float max value is bigger than Long!");

        if(Long.MAX_VALUE>Double.MAX_VALUE)
            System.out.println("Long max value is bigger than Double!");
        else
            System.out.println("Double max value is bigger than Long!");

        if(Float.MAX_VALUE>Double.MAX_VALUE)
            System.out.println("Float max value is bigger than Double!");
        else
            System.out.println("Double max value is bigger than Float!");
    }
}

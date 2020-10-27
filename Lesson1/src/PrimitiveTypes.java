public class PrimitiveTypes {
    public static void main(String[] args) {
        byte a = 10; //(-2^7,(2^7-1)),8-bit signed integer.
        short b = 23635; //(-2^15,(2^15-1)),16-bit signed integer.
        int number = -2352356;//(-2^31,(2^31-1))32-bit signed integer.
        long num = 324523452352323635L; //(-2^15,(2^15-1))64-bit signed integer.
        float c = 12.666f;
        double d = 12.666666666;
        char letter  ='A';
        //Or unicode presentation of defining char value
        char uDef = '\u0022';
        String name = "Gago";
        System.out.println(name + " c");
        System.out.println(a);
        System.out.println(b);
        System.out.println(number);
        System.out.println(num);
        System.out.println(c);
        System.out.println(d);
        System.out.println(letter);
        System.out.println(uDef);

    }
}

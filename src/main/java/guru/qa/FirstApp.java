package guru.qa;

public class FirstApp {
    public static void main(String[] args) {
        char symbol = 'w';
        char anotherSymbol;

        boolean flag = false; // default: false

        byte aByte = 123; // 8 bit, default=0
        short aShort; // 16 bit, default=0
        int aInt = aByte; // 32 bit, default=0
        long aLong = 123L; // 64 bit, default=0
        Integer boxed = 1; // класс-обертка default=null

        char[][] array = new char[][] {{'w', 'a', 's'}};

        float aFloat = 1.2F;
        double aDouble = 1.2D;

        String aString = "Hello, QA"; // default=null

        getMaxIntNumber();


    }
    static void getMaxIntNumber() {
     //   return Integer.MAX_VALUE;
        System.out.println("max value: " + Integer.MAX_VALUE);
    }
}

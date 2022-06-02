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
        aLong += 1; // aLong = aLong+1
        Integer boxed = 1; // класс-обертка default=null

        char[][] array = new char[][] {{'w', 'a', 's'}};

        float aFloat = 1.2F;
        double aDouble = 1.2D;

        String aString = "Hello, QA"; // default=null

        // / деление (целочиссленное)
        // % взятие остатка от деления

        // & и (&&)
        // | или (||)
        // ! отрицание

        // != не равно ^
        // == сравнивает адреса в памяти
        // для сравнения использовать equals (для строк)

        if (aString != null && aString.equals("Julia")) {

        }

        // instanceof
        // >= Больше или равно
        // <= Меньше или равно


        aString = 3 > 2 ? "Dima" : "Alex"; // тернарный оператор

        if (3>2) {
            aString = "Dima";
        } else {
            aString = "Alex";
        }

        switch (aString) {
            case "Dima":
                System.out.println("Hi, " + aString);
                break;
            case "Alex":
                System.out.println("Hi, " + aString);
                break;
        }


        getMaxIntNumber();
        System.out.println(summ(aByte, (int) aLong));

        //Переполнения

        System.out.println(Byte.MAX_VALUE+1);
        System.out.println(Byte.MIN_VALUE-1);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);


    }
    static void getMaxIntNumber() {
     //   return Integer.MAX_VALUE;
        System.out.println("max value: " + Integer.MAX_VALUE);
    }
    static int summ(int first, int second) {
        return first + second;
    }


}

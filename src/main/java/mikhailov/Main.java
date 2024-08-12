package mikhailov;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Базовые типы и операции с ними
        byte a = 127;
        short b = 2;
        int c = 300;
        long d = 4;
        float e = 5.9f;
        boolean f = false;


        var ab = a+b; //ab - int;
        var d1 = 4.1;
        var d2 = 4.1f;
        var d3 = d1 * d2; // d3 double
        var d4 = (float)d1 * d2; // d4 float после явного преобразования

        a = (byte)c; // остаются правые 8 разрядов в двоичной системе: 00101100 или 44 в десятеричной
        int g = (int)e; // остается 5, округляется до целых, просто идет усечение дробной части

        //Printf
        System.out.printf("a = %d; и = %d; c = %d; e = %f", a, b, c, e);
        System.out.printf("\nabc = %d\n", a + b + c);

        //Унарные операции
        int u1 = 5;
        int u2 = 10;
        int result = 0;
        System.out.printf("\nresult = %d, u1 = %d; u2 = %d", result, u1, u2);

        result = ++u1 + u2--;
        System.out.printf("\nresult = %d, u1 = %d; u2 = %d", result, u1, u2);

        System.out.println();

        //Поразрядные операции
        u1 = u1 >> 1;
        System.out.println("u1 = " + u1); //аналогично делению на 2

        u1 <<= 2;
        System.out.println("u1 = " + u1); //аналогично умножению на 2

        //Логические операции
        boolean l1 = 5 < 0; // false

        boolean l2 = 5 < 0 || 5 == 5; // true

        boolean l3 = 5 > 0 ^ 5 == 5; // false

        boolean l4 = 5 < 0 && 5 == 5; // false

        System.out.printf("l1 = %s; l2 = %s; l3 = %s; l4 = %s \n", l1, l2, l3, l4);

        // swith

        Random random = new Random();
        int rand = random.nextInt(1,10);

        switch (rand){
            case 1:
                System.out.println("rand == 1");
                break;
            case 2:
                System.out.println("rand == 2");
                break;
            case 3:
                System.out.println("rand == 3");
                break;
            default:
                System.out.println("rand > 3");

        }
        System.out.println("rand == " + rand);

        boolean randIsBig;
        boolean b1 = rand > 3 ? (randIsBig = true) : (randIsBig = false);
        System.out.println(randIsBig);
    }

}
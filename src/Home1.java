public class Home1 {
    //задание 4
    private static boolean task10and20(int x1, int y1) {
        int sum = x1 + y1;
        return sum >= 10 && sum <= 20;

    }
    //Задание 5
    public static boolean isPositiveOrNegative (int num){ return num >= 0; }
    //Задание6
    public static boolean isNegatige (int number){return number <0;}
    //Задание 7
    private static String Hello(String name) {return "Hello, " + name; }

    public static void main(String[] args) {
        System.out.println("Hello world");

        //Задание 2
        System.out.println("Задание 2 \n");
        byte val = 2;
        short val1 = 256;
        int val2 = 222;
        long val3 = 222222L;
        float val4 = 3.14f;
        double val5 = 12.24;
        char val6 = '\u2242';
        boolean val7 = true;

        System.out.println("byte val = " + val + ";\n" + "short val1 = " + val1 + ";\n");
        System.out.println("int val2 = " + val2 + ";\n" + "long val3 = " + val3 + ";\n");
        System.out.println("float val4 = " + val4 + ";\n" + "double val5 = " + val5 + "\n");
        System.out.println("char val6 = " + val6 + ";\n" + "boolean val7 = " + val7 + "\n");

        //задание 3
        System.out.println("Задание 3 \n");
        float a = 10.9f;
        float b = 2.23f;
        float c = 1.5f;
        float d = 1.95f;

        System.out.println("a =" + a + ", b =" + b + ", c =" + c + ", d =" + d);

        System.out.println((a * (b + (c / d))));


        //Задание 4
        System.out.println("Задание 4 \n");

        int x1 = 10;
        int y1 = 10;
        System.out.println("Значение инициализированных переменных: ");
        System.out.println("x = " + x1 + "; " + "y= " + y1 + ";");
        System.out.printf("Сумма чисел равна = %d ", x1 + y1);
        System.out.printf("Метод возвращает значение: %s \n\n", task10and20(x1, y1));

        //Задание 5
        System.out.println("Задание 5 \n");
        int num = 0;
        System.out.printf("Число равно = %d. ", num);
        System.out.printf("Число %s. \n\n", isPositiveOrNegative(num) ? "положительно":"отрицательное");

        //Задание 6
        System.out.println("Задание 6. \n");
         int number = -22;

        System.out.printf("Значение переменной = %d. Метод возвращает %s.\n\n", number, isNegatige(number));

        //Задание 7
        System.out.println("Задание 7. \n");

        String name = "Alexey";
        System.out.println(Hello(name) + "!\n");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(twoIntegers(15, 35));
        System.out.println(calculator(20, 40, 50, 30));
        positiveNegative(-10);
        System.out.println(negative(20));
        System.out.println(name("Vova"));
        leapYear(2023);
    }
    // 1 задача
    public static float calculator(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }
    // 2 задача
    public static boolean twoIntegers(int x, int y) {
        if((x + y)>10 && (x+y)<20){
            return true;
        }else{
            return false;
        }
    }
    // 3 задача
    public static void positiveNegative(int x) {
        if (x > 0) {
            System.out.println("Положительное число " + x);
        } else {
            System.out.println("Отрицательное число " + x);
        }
    }
    // 4 задача
    public static boolean  negative(int x) {
        if (x > 0) {
            return false;
        } else {
            return true;
        }
    }
    // 5 задача
    public static String name(String x){
        return "Hello " + x;
    }
    // 6 задача
    public static void leapYear(int a){
        if((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)){
            System.out.println("Високосный год " + a);
        }else{
            System.out.println("Не является високосным " + a);
        }
    }
}
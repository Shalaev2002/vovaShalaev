package manual2;

public class Manual2 {
    public static void main(String[] args) {
        devs();
        devs1();

    }

    public static void devs() {
        int[] arr = new int[8];
        int ops = -3;
        for (int i = 0; i < arr.length; i++) {
            ops = ops + 3;
            System.out.print(ops + " ");

        }
        System.out.println();
    }

    public static void devs1() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void devs2(String[] args) {
        int[][] twoD = new int[5][5];



    }
}






public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        for (int i = arr.length - 1;i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println("\n");
        double [] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1;i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println("\n");
        int [] arr3 = new int [4];
        arr3 [1] = 2;
        arr3 [3] = 1;
        arr3 [2] = 5;
        for (int i = arr3.length - 1;i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("\n");
        int [] mas = {1, 2, 3, 4, 5};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 0) {
                mas[i] = mas[i] + 1;}
            if (i == mas.length - 1) {
                System.out.print(mas[i]);
            } else {
                System.out.print(mas[i] + ", ");
            }
        }
    }
}
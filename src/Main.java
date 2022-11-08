import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr;
        int size;

        System.out.println("Enter the array size:");
        size = sc.nextInt();

        arr = new int[size];
        System.out.println("Enter the elements for this array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Array now:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min value of this array is: " + min);
    }
}
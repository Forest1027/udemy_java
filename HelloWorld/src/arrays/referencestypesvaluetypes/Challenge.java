package arrays.referencestypesvaluetypes;

import java.util.Scanner;

public class Challenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the count: ");
        int count = scanner.nextInt();
        int[] arr = readIntegers(count);
        System.out.println(findMin(arr));
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        while (count>0){
            arr[arr.length - count] = scanner.nextInt();
            count -- ;
        }
        return arr;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}

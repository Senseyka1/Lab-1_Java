
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Input variant 1 or 2: ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        switch (k) {
            case 1:
                Scanner enter = new Scanner(System.in);
                System.out.println("Input size of array: ");
                int n = enter.nextInt();
                int[] array = new int[n];
                for(int i = 0; i < array.length; i++) {
                    array[i] = enter.nextInt();
                }
                for(int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                int dodatniElement = 0;
                for(int i = 0; i < array.length; i++) {
                    if(array[i] > 0) dodatniElement++;
                }
                System.out.println("Positive: " + dodatniElement);
                for(int i = 0; i < array.length; i++) {
                    if(array[i] < 0){
                        array[i] = array[i] * -1;
                    }
                    System.out.println("New array: " + array[i]);
                }
                int min = array[0];
                int positionOfmin = 0;
                for(int i = 0; i < array.length; i++) {
                    if(min > array[i]){
                        min = array[i];
                        positionOfmin = i;
                    }
                }
                int sum = 0;
                for(int i = 0; i < positionOfmin; i++) {
                    sum += array[i];
                }
                System.out.println("min = " + min);
                System.out.println("position + " + positionOfmin);
                System.out.println("sum = " + sum);
                break;

            case 2:
                Scanner input = new Scanner(System.in);
                System.out.println("Input n");
                int[] array2 = new int[input.nextInt()];
                for(int i = 0; i < array2.length; i++) {
                    array2[i] = (int) (Math.random() * 200 - 100) ;
                }
                for(int i = 0; i < array2.length; i++) {
                    System.out.println(array2[i]);
                }
                int dodatniElement2 = 0;
                for(int i = 0; i < array2.length; i++) {
                    if(array2[i] > 0) dodatniElement2++;
                }
                System.out.println("Positive: " + dodatniElement2);
                for(int i = 0; i < array2.length; i++) {
                    if(array2[i] < 0){
                        array2[i] = array2[i] * -1;
                    }
                    System.out.println("New array: " + array2[i]);
                }
                int min2 = array2[0];
                int positionOfmin2 = 0;
                for(int i = 0; i < array2.length; i++) {
                    if(min2 > array2[i]){
                        min2 = array2[i];
                        positionOfmin2 = i;
                    }
                }
                int sum2 = 0;
                for(int i = 0; i < positionOfmin2; i++) {
                    sum2 += array2[i];
                }
                System.out.println("min = " + min2);
                System.out.println("position + " + positionOfmin2);
                System.out.println("sum = " + sum2);
                break;

            default:
                System.out.println("Error");
        }

    }
}


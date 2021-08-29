package homework3;

import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        int [] arr = {25, 5, 250, 11, 20, 345, 70};
        int min = arr[0];
        int index1 = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i]<min) {
                min = arr[i];
                index1 = i;
            }
        }
        System.out.println(min + " ");
        int max = arr[0];
        int index2 = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>max) {
                max = arr[j];
                index2 = j;
            }
        }
        System.out.println( max + " ");
        int a = 0;
        a = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = a;
        System.out.print(Arrays.toString(arr));
    }
}

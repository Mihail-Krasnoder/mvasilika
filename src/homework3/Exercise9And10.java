package homework3;

public class Exercise9And10 {
    public static void main(String[] args) {
        int [] arr = {25, 11, 250, 5, 20, 50, 70};

        int min = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min + " ");
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>max) {
                max = arr[j];
            }
        }
        System.out.println(max + " ");
    }
}

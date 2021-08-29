package homework3;

public class Exercise13 {
    public static void main(String[] args) {
        int[][] mas = new int[8][8];
        for(int i = 0; i < mas.length; i++) {
            for(int j=0; j < mas.length; j++) {
                if((i+j)%2 == 0) mas[i][j] +=1;
                System.out.print(" " + mas[i][j]);
            }
            System.out.println();
        }
    }
}

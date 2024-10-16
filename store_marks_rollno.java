import java.util.Scanner;

public class store_marks_rollno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        // input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter roll number & marks : ");
                arr[i][j] =sc.nextInt();
            }
        }
        //output
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print("The result : ");
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

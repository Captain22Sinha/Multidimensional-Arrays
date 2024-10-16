import java.util.Scanner;

public class output_using_nested_loops {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        Scanner sc = new Scanner(System.in);
        
        arr[0][0] = 9;
        int m = arr.length; // no of rows / lines
        int n = arr[0].length; // no of cols
        System.out.println(m);
        System.out.println(n);

        System.out.print("Enter input : ");
        // Input of 2D Array
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // cols
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of 2D Array
        for(int i=0 ; i<3 ; i++){ //rows
            for(int j=0 ; j<3 ; j++){ // cols
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
public class sum_in_arr {
    public static void main(String[] args) {
        int[][] arr = { { 1, 5, 6 }, { 2, 56, 25 }, { 36, 74, 45 } };
        
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                sum += arr[i][j];
            }
        }
        
        System.out.println("The Sum is : " + sum);
    }
}
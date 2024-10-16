public class sum_2matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 3, 9}, {3, 7, 3}, {9, 4, 5}};
        int[][] arr2 = {{3, 6, 4}, {2, 8, 3}, {6, 2, 1}};
        int m = arr1.length;
        int n = arr2[0].length;
        int[][] res = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                res[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("The sum is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

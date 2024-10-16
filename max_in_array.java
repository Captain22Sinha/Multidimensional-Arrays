public class max_in_array {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 6}, {2,56,25},{36,74,45}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.print("The largest value : " + mx);
    }
}

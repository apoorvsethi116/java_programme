public class array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,1}};
        int[][] brr = {{1,2},{1,2},{2,1}};
        int[][] result = new int [2][2];
        for (int i = 0; i<=1; i++){
            for (int j = 0; j<=1; j++){
                for (int k =0; k<=2; k++){
                    result[i][j] += arr[i][k]*brr[k][j];
                }
            }
        }
        for(int i = 0; i<=1; i++){
            for(int j = 0; j<=1; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
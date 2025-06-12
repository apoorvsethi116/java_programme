public class linear_search {
    public static int l_search(int arr[] , int i , int n, int target) {
        for (i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 3, 22, 4, 3224, 3, 2};
        int target = 55;
        int n = arr.length;
        int res = l_search(arr , 0 , n , target);
        if(res >= 0){
            System.out.println(target + " found at index : " + res);
        }else{
            System.out.println("Not found");
        }
    }
}

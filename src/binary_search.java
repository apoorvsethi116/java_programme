public class binary_search {
    public static int l_search(int arr[] , int i , int n, int target) {
        for (i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {2,3,22,4,5,4,87,9};
        int target = 4;
        int i = 0 , n = arr.length;
        int mid = 0 , res = 0;
        if(n % 2 == 0){
            mid = n/2;
            res = l_search(arr , 0 , mid , target);
        }else {
            mid = (n+1)/2;
            res = l_search(arr , mid , n , target);
        }
        if(res >= 0){
            System.out.println(target + " found at index : " + res);
        }else{
            System.out.println("Not found");
        }
    }
}

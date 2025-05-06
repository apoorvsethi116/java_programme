public class testPractice {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,9,2,8,5,7};
        System.out.print("Unique elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    found = true;
                    break;
                }

            }
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    found = true;
                    break;
                }

            }
            System.out.println(arr[i] + " ");
        }
    }
}

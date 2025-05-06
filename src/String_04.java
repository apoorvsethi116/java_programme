public class String_04 {
    public static void main(String[] args) {
        String str = "helllllleleoooo";
        char[] arr = str.toCharArray();
        int maxCount = 0;
        char res = '\0';
        for(int i = 0; i< arr.length; i++){
            int count = 0;
            for (int j = 0; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(maxCount<count){
                maxCount = count;
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}

public class String_03 {
    public static void main(String[] args) {
        String str = "helohooo";
        char res = '\u0000';
        char arr[] = str.toCharArray();
        for(int i =0; i< arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    return;
                }
            }
        }
    }
}

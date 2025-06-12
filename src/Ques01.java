import java.util.Scanner;

public class Ques01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = { "B" , "A" , "C"};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].charAt(0) >= arr[j].charAt(0)){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for(String val : arr){
            System.out.print(val + " ");
        }

    }
}
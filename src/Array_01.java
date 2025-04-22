import java.util.*;
public class Array_01 {
    public static void main(String[] args) {
        int sum = 123;
        int[] even = new int[3];
        int[] odd = new int[3];
        int s;
        for (int i = 0; i<3; i ++){
            s = sum% 10;
            sum = sum/10;
            if(s % 2 == 0){
                even[i] =s ;
            }else{
                odd[i] = s  ;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}

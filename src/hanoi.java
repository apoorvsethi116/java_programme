import java.util.Scanner;
public class hanoi {
    public static void tower(int n , char frompeg , char topeg , char auxpeg){
        if (n==1){
            System.out.println("move disk 1 from peg " + frompeg + " to peg " + topeg);
            return;
        }
        tower(n-1 , frompeg , auxpeg , topeg);
        System.out.println("move disk " + n + " from peg " + frompeg + " to peg " + topeg);
        tower(n-1 , auxpeg , topeg , frompeg);
    }
    public static void main(String[] args) {
        Scanner disk = new Scanner(System.in);//create an input obj
        System.out.println("enter number of disk:");
        int n = disk.nextInt();// it reads the user input
        tower(n , 'A' , 'C' , 'B');
    }
}
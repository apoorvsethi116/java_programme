import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char b = in.next().charAt(0);
        int c = in.nextInt();

        switch(b){
            case '+':
                System.out.println(a+c);
                break;
            case '-':
                System.out.println(a-c);
                break;
            case '*':
                System.out.println(a*c);
                break;
            case '/':
                System.out.println(a/c);
                break;
            case '%':
                System.out.println(a%c);
                break;
        }
    }
}

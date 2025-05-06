public class loop_01 {
    public static void main(String[] args) {
        char a ='*';
        for (int i = 0; i < 8; i ++){
            //System.out.print(a);
            for(int j = 1; j <i; j ++){
                System.out.print(a);
            }
            System.out.println(" ");
        }
    }
}

public class first {
    public static void main(String[] args) {
//    char ch = 'n';
//    if(ch >= 'A' && ch <='Z'){
//        System.out.println("upperCase");
//    } else if (ch>='a' && ch<='z') {
//        System.out.println("lowercase");
//    } else{
//        System.out.println("lowerCase");
//    }
//
//     ;
//        int grade = 25;
//        if (grade >= 85) {
//            System.out.println("Type : A kid with " + grade + " marks");
//        } else if (grade < 85 && grade >= 50) {
//            System.out.println("Type : B kid with " + grade + " marks");
//
//        } else if (grade < 50 && grade >= 35) {
//            System.out.println("Type : C kid with " + grade + " marks");
//
//        } else {
//            System.out.println("bkl");
//        }

//        int a = 6;
//        boolean isPrime = true;
//        for(int i = 2; i < a; i++){
//            if(a%i==0){
//                isPrime = false;
//                System.out.println("!aPrime");
//                break;
//
//            }else{
//                System.out.println("prime");
//                break;
//
//            }
//        }
        int year = 2024;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else
            System.out.println("Not a leap year");
    }
}

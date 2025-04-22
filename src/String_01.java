public class String_01 {
    public static void main(String[] args) {
        int matchCount = 0;
        String str = "hello";
        String str2 = "hiihhhhhhi";
        String target = "h";
        String pallindrome = "namanaman";
        int a = 0, b = pallindrome.length() - 1;
        boolean isPalindrome = true;

        while (a < b) {
            if (pallindrome.charAt(a) != pallindrome.charAt(b)) {
                isPalindrome = false;
                break;
            }
            a++;
            b--;
        }


        if (isPalindrome) {
            System.out.println("Is a Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }

        for (int i = 0; i<str.length(); i ++){
            for (int j =0; j<str2.length(); j++){

                    if(str.charAt(i) == str2.charAt(j)){
                        if (str.charAt(i) == target.charAt(0)) {
                            matchCount++;
                        }
                    }

            }

        }
        System.out.println(matchCount);
    }
}

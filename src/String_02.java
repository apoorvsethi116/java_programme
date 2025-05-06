public class String_02 {
    public static void main(String[] args) {
        String str = "hello";
        String newStr = "";
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(newStr.indexOf(c) == -1){
                newStr +=c;
            }
        }
        System.out.println(newStr + "  ");
    }
}

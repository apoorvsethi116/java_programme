class Hello {
    String user_name = "Mansi";
    String sur_name = "Patel";

    void func1() {
        System.out.println(sur_name +" "+ user_name);

    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.func1();
    }
}

public class object_01 {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.func1();
    }
}

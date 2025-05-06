//constructor chaining using this
class Student{
    int a;
    int b;
    Student(int b){
        this(10 , 20);
    }
    Student(int a, int i){
        this.a = a;
        this.b = b;
    }
    void func(){
        System.out.println(a);
        System.out.println(b);
    }



}

public class constructor_01 {
    public static void main(String[] args) {
        Student obj = new Student(10 , 20);
        System.out.println(obj.a);
        obj.func();

    }
}

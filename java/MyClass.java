
/*
public class MyClass {
    static int a = 0;

    MyClass() {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
    }
}
*/
public class MyClass {
    private int a = 20;
    protected int b = 100;
    public int c = 200;
    int x = 1000;

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.a);

    }
}

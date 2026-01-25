// class demo in java

class C_demo1 {
    public static void main(String[] args) {
        System.out.println("i am class 1");
    }
}

public class C_demo2 {
    public static void main(String[] args) {
        System.out.println("i am class 2");
        C_demo1 d1 = new C_demo1();
        new C_demo3();
    }
}

class C_demo3 {
    static{
        System.out.println("static block of demo3");
    }

    C_demo3(){
        System.out.println("constructor of C_demo3");
    }
    public static void main(String[] args) {
        
    }
}
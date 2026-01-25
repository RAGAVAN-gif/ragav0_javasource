// program for java static Block

class Staticblock{ // this is a class initialis

    public Staticblock(){ // this is an constractor of an static class
        System.out.println("i an costractor");
    }

    static{ // first static block
        System.out.println("i am static block 1");
    }

    static{ // this is an second static block
        System.out.println("i am an static block 2");
    }

    {// this is an non static block 
        System.out.println("i am non statick block 1");
    }

    public static void main(String[] args) { // main method

        System.out.println(" i am a static main method");

        Staticblock sb = new Staticblock(); // instance of static class
        //Staticblock sb1 = new Staticblock();

        sb.test(); // call of test method using object

        Staticblock.test();// call by class name

        System.out.println(2<<1); // this is an normal boolen 
    }
    public static void test() { // this is an static method
        System.out.println( "i am an static test");
    }
}
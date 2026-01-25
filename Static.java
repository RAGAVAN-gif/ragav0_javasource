//  java static example

class Myclass {
    public static int staticvariable = 10; // static variable
    public int instancevariable = 20; // instance variable

    static{
        // ststic block body
        System.out.println("this is a normal static block");
    }

    public static void staticmethod(){ // static method
        // body of static method
        System.out.println("this is a static block");
    }
    
    public void instancemethod(){ // instance method

        //body of instance method
        System.out.println("this is a instance method");
    }
}

public class Static {

    public static void main(String[] args) {
        // Accessing static members
        System.out.println(Myclass.staticvariable); // display static variable
        Myclass.staticmethod(); // display static method

        // create an instance to the Myclass
        Myclass obj = new Myclass();
        
        // Accessing instans members through the instans of object
        System.out.println(obj.instancevariable); //disply instans variable
        obj.instancemethod(); //display instans method 

    }
}

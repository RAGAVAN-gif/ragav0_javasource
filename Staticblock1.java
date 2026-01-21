// program for static block

class lap{
    String brand; // non static variable
    int price; // non static variable
    static String name; // static variable 

    public void show(){ // non static function 
        System.out.println(brand+" "+price+" "+name+"");
    }

    public static void show1(lap obj) { // static function
        System.out.println(obj.brand+" "+obj.price+" "+name);
    }
}

public class Staticblock1 { //class 
 
    public static void main(String[] args) { // main method
        lap lp1 = new lap(); // object creation for fist lap
        lp1.brand = "asus";
        lp1.price = 35000;

        lap lp2 = new lap();// object creation for second lap
        lp2.brand = "lenova";
        lp2.price = 40000;

        lap.name = "laptop"; // static value for name variable

        lp1.show(); // call function
        lp2.show(); // call function
        lap.show1(lp1); // call static function
    }
}

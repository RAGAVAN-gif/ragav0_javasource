// java for static program

public class Maal { // class name Maal
    static int streetNo = 10; // static variable
    String name = "RELAINS MAAL";
    int price,discount = 3;// non atatic variable /that take object space
    String brand;

    public static void main(String[] args) { // main method
        Maal product1 = new Maal(); // object 1 for maal and value declare
        product1.brand="ABC";
        product1.discount=4;
        product1.price=100;
        
        Maal product2 = new Maal(); // object 2 for maal and value declare
        product2.brand="DEF";
        product2.discount=4;
        product2.price=200;

        System.out.println(product1.discount); //display the content
        System.out.println(product2.price);
    }
}
        

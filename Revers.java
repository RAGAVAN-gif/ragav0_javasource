/*java reversal program*/
import java.util.Scanner;


public class Revers{
    int number;
    int reversal=0;

    public static void main(String args[]){
        Revers ob = new Revers();
        Scanner x = new Scanner(System.in);

        System.out.println("Enter number:");
        ob.number=x.nextInt();

        while(ob.number!=0){
            ob.reversal = ob.reversal*10 + ob.number % 10;
            ob.number= ob.number/10;
        }
        System.out.println("Reversed value:"+ob.reversal);

        x.close();
    }
}

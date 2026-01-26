/*java program for number of digitfinding */
import java.util.Scanner;


public class Digitfind {
    int num;
    int count=0;
    void digit(){
        int temp=num;
        while (temp!=0) {
            temp = temp/10;
            count++;
        }
    }
    public static void main(String[] args) {
        Digitfind c = new Digitfind();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        c.num = s.nextInt();
        System.out.println("Given number is :"+ c.num);
        c.digit();
        System.out.println("Number of digit :"+ c.count);
        s.close();
    }
}

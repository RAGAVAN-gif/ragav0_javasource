/*java program for palindrome */
import java.util.Scanner;

class Revers {

    int num;
    int rev=0;
    void revers(){
        int temp=num;
        while (temp != 0) {
            rev = rev*10 + temp % 10;
            temp = temp/10;
        }
    }
    
}

public class Palindrome {
    public static void main(String[] args) {
        Revers obj = new Revers();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        obj.num=s.nextInt();
        obj.revers();
        System.out.println("Reversed num : "+obj.rev);
        if(obj.num == obj.rev){
            System.out.println("This is an polindrome number");
        }
        else{
            System.out.println("Not a polindrom number");
        }
        s.close();

    }
    
    
}


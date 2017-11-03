package lab04;
import java.util.Scanner;
/**
 * 
 * @author Chan Chi Yin 
 * Student ID: 55246734
 * Lab Section ID: LA2 
 *
 */
public class DigitSeparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit integer:");
        String i = sc.nextLine();
        
        char i0 = i.charAt(0);
        char i1 = i.charAt(1);
        char i2 = i.charAt(2);
        char i3 = i.charAt(3);
        char i4 = i.charAt(4);
        

                
    
        System.out.print("Digits in "+ i +" are " +i0+"   "+i1+"   "+i2+"   "+i3+"   "+i4);
        
    }
    
}

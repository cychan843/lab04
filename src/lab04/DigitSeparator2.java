package lab04;
import java.util.Scanner;
/**
 * 
 * @author Chan Chi Yin 
 * Student ID: 55246734
 * Lab Section ID: LA2 
 *
 */
public class DigitSeparator2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit integer:");
        int i = sc.nextInt();
        int i0 = i/10000;
        int i1 = i%10000/1000;
        int i2 = i%1000/100;
        int i3 = i%100/10;
        int i4 = i%10;
        
        System.out.print("Digits in "+ i +" are " +i0+"   "+i1+"   "+i2+"   "+i3+"   "+i4);
        
    }
    
}

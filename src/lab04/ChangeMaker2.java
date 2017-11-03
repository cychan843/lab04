package lab04;
import java.util.Scanner;
/**
 * 
 * @author Chan Chi Yin 
 * Student ID: 55246734
 * Lab Section ID: LA2 
 *
 */
public class ChangeMaker2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a whole number from 1 to 99: ");
    while(!sc.hasNextInt()) {                  
    //avoid invalid numbers
        System.out.println("Invalid Numbers!!!");
        sc.next();}   
    int m = sc.nextInt();        //input of the amount of  change
    int q = 25;                // Calculate the number of quarters
    int d = 10;         // Calculate the number of dimes
    int n = 5;     // Calculate the number of nickels
    int Nq = 0;
    int Nd = 0;
    int Nn = 0;
    
    while((m/q)>= 1){
        Nq += 1;
        m -= q;
    }
    while((m/d)>= 1){
        Nd +=1;
        m -= d;   
    }
    while((m/n)>= 1){
        Nn += 1;
        m -= n;
    }
    System.out.println("One combination of coins that equals to "+m+" cents is:");
            if(Nq>1)
                System.out.println(Nq+" quarters");  //output of number of quarters
            else
                System.out.println(Nq+" quarter");   //Use correct grammar
            if(Nd>1)
                System.out.println(Nd+" dimes");     //output of number of dimes
            else
                System.out.println(Nd+" dime");      //Use correct grammar
            if(Nn>1)
                System.out.println(Nn+" nickels");   //output of number of nickels
            else
                System.out.println(Nn+" nickel");    //Use correct grammar
            if(m>1)
                System.out.println(m+" pennies");   //output of number of pennies
            else
                System.out.println(m+" penny");     //Use correct grammar
        sc.close();
}
}
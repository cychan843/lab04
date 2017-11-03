/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author cychan843
 */
public class ChangeMaker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number from 1 to 99: " );
        while(!sc.hasNextInt()) {                  
            //avoid invalid numbers
            System.out.println("Invalid Numbers!!!");
            sc.next();}   
        
        int m = sc.nextInt();        //input of the amount of  change
        int q = m/25;                // Calculate the number of quarters
        int d = m%25/10;         // Calculate the number of dimes
        int n = m%25%10/5;     // Calculate the number of nickels
        int p = m%25%10%5;   // Calculate the number of pennies
        
        System.out.println("One combination of coins that equals to "+m+" cents is:");
            if(q>1)
                System.out.println(q+" quarters");  //output of number of quarters
            else
                System.out.println(q+" quarter");   //Use correct grammar
            if(d>1)
                System.out.println(d+" dimes");     //output of number of dimes
            else
                System.out.println(d+" dime");      //Use correct grammar
            if(n>1)
                System.out.println(n+" nickels");   //output of number of nickels
            else
                System.out.println(n+" nickel");    //Use correct grammar
            if(p>1)
                System.out.println(p+" pennies");   //output of number of pennies
            else
                System.out.println(p+" penny");     //Use correct grammar
        sc.close();

}
}
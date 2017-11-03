package lab04;
import java.util.Scanner;
/**
 * 
 * @author Chan Chi Yin 
 * Student ID: 55246734
 * Lab Section ID: LA2 
 *
 */
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Using Quadratic Solver"
                + "\n=================================");//welcome message
        System.out.print("Please enter the value of a: ");    
        while(!sc.hasNextDouble()) {                  
            //avoid invalid numbers
            System.out.println("Invalid Numbers!!!");
            sc.next();}   
        //Input
//the value of a of the quadratic equation
        double a = sc.nextDouble();
        System.out.print("Please enter the value of b: ");
        while(!sc.hasNextDouble()) {                  
            //avoid invalid numbers
            System.out.println("Invalid Numbers!!!");
            sc.next();}   
//the value of b of the quadratic equation
        double b = sc.nextDouble();
        System.out.print("Please enter the value of c: ");
        while(!sc.hasNextDouble()) {                  
            //avoid invalid numbers
            System.out.println("Invalid Numbers!!!");
            sc.next();}
//the value of c of the quadratic equation
        double c = sc.nextDouble();

        //Calculation
        double d = b*b-4*a*c;      
//delta of the quadratic equation
        double x1 = (-b+Math.sqrt(d) )/(2*a);
//x1 in quadratic equation
        double x2 = (-b-Math.sqrt(d) )/(2*a);
//x2 in quadratic equation

            if(d>=0){
//check delta 
                //output
                System.out.println("x1 = "+ x1);
                //solution x1
                System.out.println("x2 = "+ x2);}
                //solution x2
            else
                System.out.println("No real root!");
            
}    
}

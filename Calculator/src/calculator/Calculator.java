/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Joshua Jonkers
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kbd= new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Enter first value: ");
        num1= kbd.nextInt();
        
        System.out.println("Enter second value: ");
        num2= kbd.nextInt();
        
        System.out.println("Addition: "+ (num1+num2));
        
        System.out.println("Subtraction: "+ (num1-num2));
        
        System.out.println("Multiply: "+ (num1*num2));
    }
    
}

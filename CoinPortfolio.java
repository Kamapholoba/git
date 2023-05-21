/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coinportfolio;

import java.util.Scanner;

/**
 *
 * @author Nathi Ngcobo
 */
public class CoinPortfolio {

    /**
     * @param args the command line arguments
     */
  
    
    public static int sum(int firstNum,int secondNum){
        return firstNum+secondNum;
    }
   public static int multiplication(int firstNum,int secondNum){
       return firstNum*secon dNum;
   }
   public static void main(String[]args){
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter first number");
       int firstNum = scan.nextInt();
       
       System.out.println("Enter second number");
       int secondNum = scan.nextInt();
       
       int multiplication;
       
       multiplication=multiplication(firstNum,secondNum);
       
      System.out.println(multiplication);
   }
      
   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author pimaduwa
 */
public class CalcChange {

    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String choice;
        
        int h,q,d,n,p;//totcents,dollars,cents;//Part A
       
        System.out.println("Welcome to the Change Calculator");
        
        System.out.print("Do you have change ? (Y/N):");
        choice=sc.nextLine();
        //System.out.println("Your choice was: " + choice);
        
        while (!choice.isEmpty() &&
                choice.substring(0, 1).equalsIgnoreCase("Y")) {
            
            h=getCoin(" half-dollars "); //Part B
            q=getCoin(" quarters ");
            d=getCoin(" dimes ");
            n=getCoin(" nickels ");
            p=getCoin(" pennies ");
            sc.nextLine();
            CoinTotal(h,q,d,n,p);
            
            //Part A
            /*totcents=h*50+q*25+d*10+n*5+p;
            dollars=totcents/100; //note: interger division
            cents=totcents%100; //modulus
            System.out.println("You have " + totcents + " cents " +
                    " which is " + dollars + " dollars " +
                    " and " + cents + " cent(s).");*/
            
            System.out.print("Do you have more change? (Y/N)");
            choice=sc.nextLine();
        } //end of while
        
        System.out.println(
                "Thanks for using the coin calculator.");
        
    } //end of main
    public static  int getCoin(String cointype) {
        int ccount=0;
        
        do {
            try {
                System.out.print("How many" + cointype + 
                " do you have? ");
        
                ccount=sc.nextInt();
                if (ccount < 0) {
                    System.out.println(
                    "coin count must be non-negative.");
                }
            } catch (Exception e) {
                System.out.println("Input error: " + e.getMessage());
                sc.nextLine();
                ccount=-1;
            } 
            
        } while (ccount < 0);
        
        return ccount;
    }
    //Extra credit
    public static void CoinTotal(int hf, int qr, int di, int ni, int pe)
    
    {   int totcents,dollars,cents;
    
        totcents = hf*50+qr*25+di*10+ni*5+pe;
        dollars=totcents/100; //note: interger division
        cents=totcents%100; //modulus
        System.out.println("You have " + totcents + " cents " +
                    " which is " + dollars + " dollars " +
                    " and " + cents + " cent(s).");
}//end of class
}
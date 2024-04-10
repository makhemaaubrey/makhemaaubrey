/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compoundinterest;

/**
 *
 * @author makhe
 */
import java.util.Scanner;
public class CompoundInterest {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    float p,r,t,n;
    System.out.println("Enter the Principal : ");
    p =sc.nextFloat();
    System.out.println("Enter the rate of the interest  : ");
    r=sc.nextFloat();
    System.out.println("Enter the time period: ");
      t=sc.nextFloat();
      System.out.println("Enter the number of times that the interest is coumpounded per unit t: ");
       n=sc.nextFloat();
       
       double amount = p*Math.pow(1 +(r/n),n*t);
      System.out.println("Amount is: "+amount);
    }
}

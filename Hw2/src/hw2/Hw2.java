/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,j,n;
       Scanner rt=new Scanner(System.in);
       n=rt.nextInt();
       for(i=1;i<=n;i++)
       {
           
           for(int o = 1; o <=n-i ; o++)
           {
               System.out.print(" ");
           
           }
           for(j=i;j>=1;j--)
           {
               System.out.print(j);
                     
           }
           for(int k=2;k<=i;k++)
           {
               System.out.print(k);
               
           }
           System.out.println("");
          
          //Jakir Hossain Niloy
       }
       //---------------------------------------------------
            for(i=n;i>=1;i--)
       {
           
           for(int o = 1; o <=n-i ; o++)
           {
               System.out.print(" ");
           
           }
           for(j=i;j>=1;j--)
           {
               System.out.print(j);
                     
           }
           for(int k=2;k<=i;k++)
           {
               System.out.print(k);
               
           }
           System.out.println("");
          
          
       }
    }
    
}

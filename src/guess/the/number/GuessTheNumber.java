/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess.the.number;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class GuessTheNumber 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        double n,snum;
        n=(Math.random()*99999);
        long a=Math.round(n);
        System.out.print(a);
        snum=sc.nextDouble();
        
        if(a>snum){
             System.out.println("lower");
        }
        else if(a==snum){
            System.out.println("equal");
        }
        else{
             System.out.println("higher");   
        }   
    }
}
        
       


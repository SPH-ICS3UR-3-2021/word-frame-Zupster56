/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
    //TODO code application logic header
    Scanner in = new Scanner(System.in);
    //det a word from the user
    //print the following 
    /*
    * c a t *
    t * * * c 
    a * * * a 
    c * * * t 
    * t a c *
    */
    System.out.printin("Enter a word");
    String input=in.nextLine();
    //part 1: print the word surrounded by two stars
    System.out.print("* ");
    for (int x=0;x<input.length();x++){
      System.out.print(input.charAt(x)+" ");

     System.out.printLn("*");
    }
    }





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lottonumbergenerator;

import java.util.Scanner;

/**
 *
 * @author John Harold Santos
 * 15-Jun-2017
 * 6:48:44 PM
 *
 */
public class LottoNumberGenerator {
    
    static Scanner userInput = new Scanner(System.in);
    static int TotalNumbers;
    static int TotalDrawNumbers;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TotalNumbers = TotalNumbers();
        System.out.println();
        TotalDrawNumbers = TotalDrawNumbers();
       
        System.out.println("\nTotal numbers count is " + TotalNumbers);
        System.out.println("Total numbers to be drawn is " + TotalDrawNumbers);
    }
    
    // Amount of numbers in the lotto
    public static int TotalNumbers(){
        System.out.print("Enter how many total numbers: ");
        TotalNumbers = userInput.nextInt();
        if (userInput.hasNextLine() == true){
            String foo = userInput.nextLine();
            if (foo.length() != 0)
                TotalNumbers();
        }
        return TotalNumbers;
    }
    
    // Amount of numbers to be drawn in the lotto
    public static int TotalDrawNumbers(){
        System.out.print("Enter how many numbers to be drawn: ");
        TotalDrawNumbers = userInput.nextInt();
        if (userInput.hasNextLine() == true){
            String foo = userInput.nextLine();
            if (foo.length() != 0)
                TotalDrawNumbers();
        }
        return TotalDrawNumbers;
    }

}

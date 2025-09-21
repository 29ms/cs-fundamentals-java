/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pinheiroactivity6b;
import java.util.Scanner;
/**
 *
 * @author icode7
 */
public class PinheiroActivity6B {

    public static void main(String[] args) {
        Scanner keyedinput = new Scanner(System.in);
        int rightNum = 67;
        int guess;
        int counter = 1;
        
    while (counter <= 5) {
        System.out.print("Guess the number between 1-100!");
        guess = keyedinput.nextInt();
        counter ++;
        
        if (guess == 67) {
        System.out.println("Congratulations! You guessed the right number.");
        break;
        }
        
        if (counter == 6) {
         System.out.println("You couldn't get the right number. Good try!");
            break;
            
        }
        
        else if (guess >= 0 && guess < 67) {
        System.out.println("Too low");
        }
       
        else if (guess <= 100 && guess > 67) {
        System.out.println("Too high");
        }
        
        else{
        System.out.println("Invalid Number");
        }
    }
  }  // not the ending if statement
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pinheiroactivity1a;
import java.util.Scanner;

/* 
 * Created By: Josiah Pinheiro
 * Created For: Mr. De Poli
 * Class: ICS 3U
 * Filename: PinheiroActivity1A.java
 * Project Start Date: Sept. 67, 2025
 * Project Completion Date: Sept. 67, 2025
 * Project Description: 
 */

public class PinheiroActivity1A {

    public static void main(String[] args) {
        Scanner keyedinput = new Scanner(System.in);

    // Variables    
        String firstName;
        int guess;
        int correctAnswers = 0;
        int attempt = 0;
        int maxRetries = 3;
        int totalQuestions = 10;
        int exit = 777;
        int retry;
        
    // Ask for name
        System.out.println("Welcome to the 2025 Meme Quiz! Please enter your first name to start:");
        firstName = keyedinput.nextLine();
        
    // Loop    
        while (attempt < maxRetries) { 
        correctAnswers = 0;
        attempt++;
       
        System.out.println("Alright, " + firstName + ", let's get started! This is attempt #" + attempt + ".");
        System.out.println("Type " + exit + " at any time to quit.");
             
        // Question One
        System.out.println("Q1) Which number has the most aura?");
        System.out.println("   1) 22");
        System.out.println("   2) 67");
        System.out.println("   3) 69");
        System.out.println("   4) 41");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 2) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Two
        System.out.println("Q2) Which state is the best?");
        System.out.println("   1) Delaware");
        System.out.println("   2) California");
        System.out.println("   3) Ohio");
        System.out.println("   4) Texas");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 3) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Three
        System.out.println("Q3) What is it called when you must give someone food?");
        System.out.println("   1) Fanum Tax");
        System.out.println("   2) Food Giving");
        System.out.println("   3) The Food Tax");
        System.out.println("   4) Have a slice");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 1) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Four
        System.out.println("Q4) What did my mother eat?");
        System.out.println("   1) Fries");
        System.out.println("   2) Noodles");
        System.out.println("   3) Pizza");
        System.out.println("   4) Ice-Cream");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 1) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Five
        System.out.println("Q5) Which term has taken Gen Z by storm?");
        System.out.println("   1) Speed");
        System.out.println("   2) L Speed");
        System.out.println("   3) Ohio Speed");
        System.out.println("   4) W Speed");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 4) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Six
        System.out.println("Q6) Why was 6 afraid of 7");
        System.out.println("   1) Because 7 8 9");
        System.out.println("   2) Because 7 was scary");
        System.out.println("   3) Because 7 was born in Delaware");
        System.out.println("   4) Because 7 was friends with 9");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 1) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Seven
        System.out.println("Q7) What is the tuffest roast of 2025?");
        System.out.println("   1) L ratio");
        System.out.println("   2) L");
        System.out.println("   3) The dollar store Cappucino Assassino is talking");
        System.out.println("   4) You tung tung");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 3) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Eight
        System.out.println("Q8) Finish the phrase. Tung tung...?");
        System.out.println("   1) Red");
        System.out.println("   2) Sand");
        System.out.println("   3) Seven");
        System.out.println("   4) Sahur");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 4) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Nine
        System.out.println("Q9) Finish the phrase. Low Taper...?");
        System.out.println("   1) Fame");
        System.out.println("   2) Fans");
        System.out.println("   3) Fade");
        System.out.println("   4) Full");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 3) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
        // Question Ten
        System.out.println("Q10) Why did the chicken cross the road?");
        System.out.println("   1) To get to the other side");
        System.out.println("   2) To cross the road");
        System.out.println("   3) To get to the other road");
        System.out.println("   4) To get to the destination");

        guess = keyedinput.nextInt();
        
        // Invalid and Valid Answers
        if (guess == exit) {
        System.out.println("You quit the quiz. Have a good one, " + firstName + ".");
        break;
        }   
        else if (guess < 1 || guess > 4) {
        System.out.println("Invalid number.");
        }
        else if (guess == 1) {
        System.out.println("Correct!");
        correctAnswers ++;
        }
        else {
        System.out.println("Sorry.");
        }
        
    // System to quit or retry quiz
        
        System.out.println(firstName + ", you got " + correctAnswers + "/10 on attempt number #" + attempt + ".");
        System.out.println("Enter 1 to retry the quiz or 777 to quit.");
        retry = keyedinput.nextInt();
        
        if (retry == exit) {
        break;
        }
        else if (retry != 1) {
        System.out.println("Please type either 1 to retry, or 777 to quit.");
        break;
        }
      
    } // End of while loop
     
    
    
    
        
        
  }
}

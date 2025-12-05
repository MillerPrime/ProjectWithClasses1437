// Adam Miller
// 3/26/25
// Lab #3 Loops/Branches
package com.mycompany.millerquizscore;
import java.util.Scanner;

public class MillerQuizScore 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Variables
        double score;
        int count = 0;
        double sum = 0.0;
        double highest = 0.0;
        double lowest = 100.0;

        // Ask for the starting score
        System.out.print("Enter quiz score (-1 to stop): ");
        score = input.nextDouble();

        // Loop for scores
        while (score != -1) {
            // If score is less than 0 and greater than 100
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            } 
            else {
                // Update valid score stats
                count++;
                sum += score;

                if (score > highest) 
                {
                    highest = score;
                }
                if (score < lowest) 
                {
                    lowest = score;
                }
            }

            // Ask for the next score at the end of the loop
            System.out.print("Enter quiz score (-1 to stop): ");
            score = input.nextDouble();
        }

        // Print results
        if (count > 0) {
            double average = sum / count;
            System.out.println("Number of scores entered: " + count);
            System.out.printf("Highest score: %.2f%n", highest);
            System.out.printf("Lowest score: %.2f%n", lowest);
            System.out.printf("Average score: %.2f%n", average);
        } 
        else {
            System.out.println("No valid scores were entered.");
        }

        input.close();
    }
}
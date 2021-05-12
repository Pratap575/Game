package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
//        for (int i = 0; i < 1500; i++)
            System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissor");
            int userinput = sc.nextInt();
            int computerinput = random.nextInt(3);
            if (userinput == computerinput) {
                System.out.println("Draw");
            } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
                System.out.println("You Win");
            } else {
                System.out.println("You lose");
            }
            if (computerinput == 0) {
                System.out.println("Computer choice Rock");
            } else if (computerinput == 1) {
                System.out.println("Computer choice Paper");
            } else {
                System.out.println("computer choice Scissor");
        }
    }
}

package com.NumberGuessing;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random random =new Random();
		
		String [] choisces= {"rock","paper","scissors"};
		char playAgain = 0;
		
		System.out.println("Rock Paper Scissors: User Vs Computer :");
		
		do {
			System.out.println("Enter rock ,paper or scissors: ");
			String userChoice=sc.nextLine().toLowerCase();
			
			if(     !userChoice.equals("rock")&&
					!userChoice.equals("paper")&&
					!userChoice.equals("scissors")) {
				System.out.println("Invali choice !! try again");
				continue;
			}
		 int randomIndex=random.nextInt(3);
		 String computerChoic=choisces[randomIndex];
		 System.out.println("Computer chosese : "+ computerChoic);
		 
		 switch(userChoice) {
		 case  "rock" :
			 if(computerChoic.equals("scissors")) System.out.println("you win !!");
			 else if(computerChoic.equals("paper")) System.out.println("computer wins !!");
			 else System.out.println("its a draw :");
			 break;
		 case  "paper" :
			 if(computerChoic.equals("rock")) System.out.println("you win !!");
			 else if(computerChoic.equals("scissors")) System.out.println("computer wins !!");
			 else System.out.println("its a draw :");
			 break;
		 case  "scissors" :
			 if(computerChoic.equals("paper")) System.out.println("you win !!");
			 else if(computerChoic.equals("rock")) System.out.println("computer wins !!");
			 else System.out.println("its a draw :");
			 break;
		 } 
		 System.out.println("Play again? (y/n): ");
		 playAgain =sc.nextLine().charAt(0);
		 
		}while(playAgain =='y' || playAgain == 'Y');
			System.out.println("Thanks for playing");
		sc.close();
	}

}

  
package x;

import java.util.Scanner;

public class AngelNumberForYou {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 /*
		 -----------♠-----------
		  */
		 int AngelNumber;
	
		
		System.out.println("An Angel Number is 3-digit numbers with all the same digits.");
		System.out.println("Want to know your numbers meaning?");
		System.out.println("So please enter an Angel Number.");
		
		AngelNumber = scan.nextInt();
		
		if(AngelNumber == 111) {
			System.out.println("111, It is thought to symbolize new beginnings or a new cycle."
					+ " The angel number 111 is also a sign of “angelic guidance” and the need for healing."
					+ " This number is also thought to indicate that you are “in tune” with your spiritual nature");
		}
		
		if(AngelNumber == 222) {
			System.out.println("22 means good things are are the way."
					+ " In this sense, the number 222 is a sign of good things to come."
					+ " Again, the number 222 can be seen as a reminder that you are on the right path"
					+ " and doing the right things in life. This number is also a sign of positivity, good luck, and joy.");
		}
		
		if(AngelNumber == 333) {
			System.out.println("Angel number 333 symbolizes encouragement in making the correct"
					+ " choices in life. And in terms of relationships, "
					+ "if you see this number, that may indicate that it is time for you to make essential changes and "
					+ "choices in your love life.");
		}
		
		if(AngelNumber == 444) {
			System.out.println("Basically, 444 is the angel number that signifies that you are in love,"
					+ " and that your inner wisdom has been pointing you in the right direction."
					+ " The number 444 is a sign of love and wholeness."
					+ " This number suggests that you are in love with every single part of yourself.");
		}
		
		if(AngelNumber == 555) {
			System.out.println("The 555 angel number meaning is that significant change is imminent."
					+ " Change is a part of life, and when we see the number 555,"
					+ " something is telling you that a transition is in play in your life and all around you."
					+ " Every change brings stress; it's part of being human");
		}
		if(AngelNumber == 666) {
			System.out.println("hi devil,lol");
		
		}
		if(AngelNumber == 777) {
			System.out.println("It's a sign that the universe is with you and is supporting you on your spiritual path"
					+ " — especially when you may be doubting your chosen path."
					+ " It also means that you are wise, and have been given messages in your life to help others in their own life challenges");
		}
		if(AngelNumber == 888) {
			System.out.println("The main 888 angel number meaning is success and financial good luck."
					+ " If the universe is sending you 888, you're moving in the right direction!");
		}
		if(AngelNumber == 999) {
			System.out.println("Seeing the angel number 999 indicates that one cycle of your life mission is coming to an end,"
					+ " as another important new phase is beginning."
					+ " You are entering a period of your life's mission where many major changes will occur:"
					+ " new beginnings in the near future, but also some possible modifications to your life path.");
		}
		
	}
}

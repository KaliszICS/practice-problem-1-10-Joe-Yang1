/**
 * Lesson: String Manipulation
 * Author: Joe Yang
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}
	
	public static void q1() {
		//Write question 1 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String word;
	word = input.nextLine();
	System.out.println(word.contains("on"));
	}

	public static void q2() {
		//Write question 2 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input the word mango: ");
	String fruit;
	fruit = input.nextLine();
	fruit = fruit.toLowerCase();
	System.out.println(fruit.indexOf("mango")==0);

	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word;
	word = input.nextLine();
	System.out.print("Input a letter: ");
	String letter;
	letter = input.nextLine();
	System.out.println(word.indexOf(letter));
	System.out.println(word.lastIndexOf(letter));

	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String word;
	word = input.nextLine();
	System.out.println("Your sentence is " + word.length() + " " + "characters long");
	
	}

	public static void q5() {
		//Write question 5 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String word;
	word = input.nextLine();
	System.out.print("Input a word to replace: ");
	String word2;
	word2 = input.nextLine();
	System.out.print("What word would you like to replace it with: ");
	String word3;
	word3 = input.nextLine();
	System.out.println(word.replaceAll(word2, word3));
	}

	public static void q6() {
		//Write question 6 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String word;
	word = input.nextLine();
	String word2;
	word2 = word.toUpperCase();
	String word3;
	word3= word.toLowerCase();
	System.out.println(word2.trim());
	System.out.println(word3.trim());

	}

	public static void q7() {
		//Write question 7 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word;
	word = input.nextLine();
	System.out.println(word.substring(0, 4));
	System.out.println(word.substring(word.length() -4));
	

	}

	public static void q8() {
		//Write question 8 code here
	}

}

package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseLines {

	public static void main(String[] args) {
		// TODO read successive input lines until EOF, then print out in reverse order

		Stack<String> lineStack = new Stack<String>();

		final Scanner input = new Scanner(System.in);
		String line;
		while ((line = input.nextLine()) != null){
			lineStack.push(line);
			String top = line;
		}
		
		while(lineStack.peek(top) != null){
			System.out.println(lineStack.pop(top));
		}
	



	}
}

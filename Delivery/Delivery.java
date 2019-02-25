/*
 *Programmed By: Martin Horciak
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Thursday, December 15, 2016.
 *Program Description: Create a program that prompts the user for a height, length and width
 *						of the package they are trying to send. If any of the dimensions are
 *						greater than 10 display a message that rejects the package.
 */

 import java.util.Scanner;

 class Delivery {
 	public static void main (String [] args) {

 		double length, width, height;

 		Scanner input = new Scanner(System.in);

 		System.out.print ("Enter the height of your package: ");
 		height = input.nextDouble();
 		System.out.print ("Enter the width of your package: ");
 		width = input.nextDouble();
 		System.out.print ("Enter the length of your package: ");
 		length = input.nextDouble();
 		input.close();

 		if (length <= 10 && width <= 10 && height <= 10) {
 			System.out.println ("\nPackage accepted");
 		}else {
 			System.out.println ("\nPackage Denied");
 		}
 	}
 }

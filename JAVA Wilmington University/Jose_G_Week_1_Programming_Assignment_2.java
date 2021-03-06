import java.util.Scanner; 
//Jose Guadarrama - 10/20/2017
//SDD 315 - Found of Object Programming
//Programming Assignment #2

//Write a program in Java that will take the dimensions of two different homes and calculate the total square footage. 
//The program will then compare the two values and print out a line of text appropriately stating whether it is larger
//or smaller than the other one.
//You, the developer, will choose the dimensions of each room (hard coded values in the source code) in each home; 
//however, each home must contain at least 4 rooms for calculating. You may choose to add more, but the minimum each 
//can have is 4.
// 
//Example output:
//House 1 is larger than House 2 by xxxx square feet.
//Replace "xxxx" with the difference in square feet between the two homes.

public class Jose_G_Week_1_Programming_Assignment_1 {

	public static void main(String[] args) {
		//home 1 - 4 rooms
		//l = length; w - width
		int room1l = 8, room1w = 7;
		int room2l = 9, room2w = 9;
		int room3l = 11, room3w = 8;
		int room4l = 5, room4w = 6;
		int h1_total_squarefeet = room1w + room1l + room2w + room2l + room3l + room3w + room4l + room4w;
		//home 2 - 4 rooms
		//l = length; w - width
		int r1l = 8, r1w = 12;
		int r2l = 9, r2w = 9;
		int r3l = 10, r3w = 8;
		int r4l = 8, r4w = 6;
		int h2_total_squarefeet = r1w + r1l + r2w + r2l + r3l + r3w + r4l + r4w;
		
		if(h1_total_squarefeet > h2_total_squarefeet){
			System.out.println("House 1 is larger than House 2 by " + (h1_total_squarefeet - h2_total_squarefeet) + " square feet");
		}
		else if(h2_total_squarefeet > h1_total_squarefeet){
			System.out.println("House 2 is larger than House 1 by " + (h2_total_squarefeet - h1_total_squarefeet) + " square feet");
		}
		else{
			System.out.println("House 1 and House 2 are the same in Square Feet");
		}
//		Continue adding to programming assignment #1. After the comparison of the size of each home is printed out to the screen, 
//		take the dimensions you supplied in the code and print out the label of the home, each room in that home and the dimensions 
//		associated with that room along with the total square footage of that home. This assignment utilizes string concatenation 
//		and variable assignment.
		
		//house 1
		System.out.println("\nHouse 1\n_________________________\nLiving Room: " + room1l + "x" + room1w);
		System.out.println("Dinning Room: " + room2l + "x" + room2w);
		System.out.println("Bedroom: " + room3l + "x" + room3w);
		System.out.println("Master BedRoom: " + room4l + "x" + room4w);
		System.out.println("Total Square Feet: " + h1_total_squarefeet);
		//house2
		System.out.println("\nHouse 2\n_________________________\nLiving Room: " + r1l + "x" + r1w);
		System.out.println("Dinning Room: " + r2l + "x" + r2w);
		System.out.println("Bedroom: " + r3l + "x" + r3w);
		System.out.println("Master BedRoom: " + r4l + "x" + r4w);
		System.out.println("Total Square Feet: " + h2_total_squarefeet);
		
		
	}

}

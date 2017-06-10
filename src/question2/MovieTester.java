/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question2;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class MovieTester {
	//class name based on end goal

	public static void main(String[] args) {
		
		//creating variables to be passed into getters and setters
		String x;
		String y;
		int q;
		
		//Declaring and creating instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare and create cinema array
		Movie cinema[] = new Movie[3];
		
		//Creating for loop to allow population of the array
		for (int counter = 0; counter < cinema.length; counter++) {

			
			
			//Output to console 
			System.out.print("Please enter the title of Movie " + (counter + 1) + ": ");
			x = input.nextLine(); //setting x equal to user input
			cinema[counter].setTitle(x); //passing x into setter
			
			//Output to console 
			System.out.print("Please enter the genre of Movie " + (counter + 1) + ": ");
			y = input.nextLine(); //setting y equal to user input
			cinema[counter].setGenre(y);//passing y into setter
			
			//Output to console 
			System.out.print("Please enter the rating (1-5) for Movie " + (counter + 1) + ": ");
			q = input.nextInt();//setting q equal to user input
			cinema[counter].setRating(q);//passing q into setter

			input.nextLine(); // to clear the input

		}
		//creating for loop to traverse the Array and display the title, genre and rating for each element of the array
		for (int counter = 0; counter < cinema.length; counter++) {

			System.out.println("Movie Title " + (counter + 1) + ": " + cinema[counter].getTitle() + "\n"
					+ "Movie Genre " + (counter + 1) + ": " + cinema[counter].getGenre() + "\n" + "Movie Rating "
					+ (counter + 1) + ": " + cinema[counter].getRating());
			
			cinema[counter].playIt(counter); //calling playIt method for each object
		}
		
		input.close();//Close input to avoid possible leak
	
	}//end main method

}//end class

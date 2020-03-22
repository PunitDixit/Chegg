package javaPgm;
import java.util.Scanner; // Scanner class is used for reading the input from the user during runtime

public class Task2 {

	public static void main(String[] args) {
		try {
			Scanner userInput = new Scanner(System.in); //Creating instance of Scanner class for reading the input provided by the user through console window.

			System.out.print("Enter String to repeat:");
			String str =  userInput.nextLine();   // to read the String value (that needs to be repeated) provided by the user.

			System.out.print("Repetitions......:");
			int n =  userInput.nextInt(); // to read the integer value (defining the number of times the string has to be repeated) provided by the user.

			System.out.println("Final String.......:" + StringPrinter(n, str)); // Calling the StringPriter method and printing the output in the console window.

		}

		catch(Exception e){

			System.out.println(e.getMessage()); // To print the exception message
			e.printStackTrace(); // To print the Stack trace in case user provides negative integer value

		}

		System.out.println(":::Program Terminated");
	}

	public static String StringPrinter(int n, String str) throws Exception{

		String finalStr = ""; // Initiating the local String variable 

		if(n<0) // if statement to check if the integer entered is negative. In case of negative integer, throw the exception else concatenate the String str for 'n' number of times.
		{
			throw new Exception("Please Enter a Positive Integer!"); // This is to throw Exception when negative integer value is provided by the user.
		}
		else { //for loop for concatenating the string 'str' provided by the user by the 'n' number of times.
			for(int i =0; i<n;i++){ 
				finalStr = finalStr+str; // for concatenating the string 'str' value as provided by the user.
			}  
		}
		return finalStr; //returning the final string value after concatenation
	}

}

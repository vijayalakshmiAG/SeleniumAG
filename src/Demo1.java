import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		//System.out.println("Welcome to Java program");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the age");
        int age = myObj.nextInt();
        System.out.println(age);
        if(age >= 18) {
        	System.out.println(" Major");
        }
        	else {
        		System.out.println(" Minor");
        	}
        		
        }

	}



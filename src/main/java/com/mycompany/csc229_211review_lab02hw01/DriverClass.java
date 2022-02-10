
package com.mycompany.csc229_211review_lab02hw01;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
                //Scanner for user input
                Scanner scnr = new Scanner(System.in);
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class

		Student std1= new Student("James", 20);

		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.		
                
                //Program will ask for user to input students gpa
                System.out.println("Enter students GPA");
                
                //scanner will set student gpa
                std1.setGpa(scnr.nextDouble());
                
                //Output box will show students name and age
		System.out.println(std1);
                //Output box will show the students gpa from get method in Student class
                System.out.println("Students GPA: " +std1.getGpa());
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}

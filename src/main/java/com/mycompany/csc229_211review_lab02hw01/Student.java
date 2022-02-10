
package com.mycompany.csc229_211review_lab02hw01;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{

    private String address;
    private double gpa; 
    private String name;
    private int age;
    
    // Overloaded constructor with String name and Int age parameters 
    public Student(String name, int age) {
        
        this.name = name;
        this.age = age;
        
    }
    /**
     * 
     * @return returns the students GPA
     */
    public double getGpa() { 
        return gpa;
    }
    /**
     * 
     * @param gpa sets the students GPA 
     */
    public void setGpa(double gpa) {  
        this.gpa = gpa;
    }
    /**
     * 
     * @return returns the students address
     */
    @Override
    public String getAddress() {  
        return this.address;
    }
    /**
     * 
     * @param address sets the students address 
     */
    @Override
    public void setAddress(String address) {  
        this.address = address;
    }
    
    /**
     *
     * @return returns the students name and age 
     */
    @Override
    public String toString()
    {
        return "Students name: " + this.name +  "\nStudents age: " + this.age; // toString method will print students name and age
    }
    
    
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}

import java.util.Scanner;
/**
 * A triangle class that creates a triangle object to store
 * the name, base, and height of the triangle.
 * Has methods to change the name, base, and height, calculate area, and 
 * output the name, base, height, and area of the triangle
 * 
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 9/27/2026
 */
public class Triangle
{
    private String name; //name of the triangle
    private double base; //base of the triangle
    private double height; //height of the triangle
    
/**
 * Constructs a Triangle object with the default name of Unknown,
 * base of 0.0, and height of 0.0
 * 
 */     
    public Triangle(){
    
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }
    
/**
 * Constructs a Triangle object using the specified name, base,
 * and height values.
 * 
 * @param nameInput - Input for the name of the triangle
 * @param baseInput  - Input for the base of the triangle
 * @param heightInput - Input for the height of the triangle
 */   
    public Triangle(String nameInput, double baseInput, double heightInput){
        
        name = nameInput;
        base = baseInput;
        height = heightInput;
        
    }
    
/**
 * Prints the triangle name, base, height, and area to the screen
 * 
 */   
    public void writeOutput(){
        
        System.out.printf("Triangle name is: %s\nTriangle base is: %.1f\nTriangle height is: %.1f\nTriangle area is: %.1f\n\n", 
        name, base, height, getArea());
    }
    
/**
 * Gets input from the user on the triangle name, triangle base, and triangle height to set to the name, base, and height variables.
 * 
 */   
    public void readInput(){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
        
        System.out.println(); //New line to seperate
    }
    
/**
 * Changes the name of the triangle object to the specified name
 * 
 * @param newName - program input for new name for the triangle
 */   
    public void setName(String newName){
        
        name = newName;
    }
    
/**
 * Changes the base of the triangle object to the specified base
 * 
 * @param newBase - program input for new base for the triangle
 */  
    public void setBase(double newBase){
        
        base = newBase;
    }
    
/**
 * Changes the height of the triangle object to the specified height
 * 
 * @param newHeight - program input for new height for the triangle
 */  
    public void setHeight(double newHeight){
        
        height = newHeight;
    }
    
/**
 * Uses the base and height to get the area of the triangle which is (base * height)/2.0
 * 
 * @return - the area of the triangle
 */  

    public double getArea(){
        
        return (base * height)/2.0;
    }
    
    
    

}
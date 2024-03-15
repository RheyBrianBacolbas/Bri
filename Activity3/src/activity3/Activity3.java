/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;
import java.util.Scanner;

public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        double celsius;
        double fahrenheit;
        System.out.println("Enter Celcius");
        celsius = scn.nextDouble();
        fahrenheit = (celsius*9/5) + 32;
        
        System.out.println("Celsius:" + celsius + "\n" + "celsius to fahrenheit:" + fahrenheit);
       
    }
    
}

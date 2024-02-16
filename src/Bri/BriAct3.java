/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bri;
import java.util.Scanner;
/**
 *
 * @author DASURECO 11
 */
public class BriAct3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        double celsius;
        double fahrenheit;
        
        System.out.print("Input Celsius: ");
        celsius = scn.nextInt();
        fahrenheit = (celsius*9/5) + 32;
               
        System.out.println("Celsius: "+celsius+" "+"Celsius to Fahrenheit: "+fahrenheit);
    }
    
}

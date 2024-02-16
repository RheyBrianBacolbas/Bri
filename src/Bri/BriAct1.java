/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bri;
import java.util.Scanner;


public class BriAct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scn = new Scanner(System.in);

    System.out.print("Enter Last Name: ");
     String lName = scn.nextLine();

    System.out.print("Enter First Name: ");
    String fName = scn.nextLine();

    System.out.print("Enter Middle Name: ");
    String mName = scn.nextLine();

    System.out.print("Enter Age: ");
     int age = scn.nextInt();

                scn.nextLine();
        
        System.out.print("Enter Gender: ");
        String gName = scn.nextLine();

        System.out.print("Enter Birthday: ");
        int bDay = scn.nextInt();
        
        System.out.print("Enter Birthmonth: ");
        int bMonth = scn.nextInt();
        
        System.out.print("Enter Birthyear: ");
        int bYear = scn.nextInt();
        
        System.out.println("\nYOUR DATA: " );

        System.out.println("Last Name: " + lName);        
        System.out.println("First Name: " + fName);       
        System.out.println("Middle Name: " + mName);       
        System.out.println("Age: " + age);      
        System.out.println("Gender: " + gName);
        System.out.println("Birthdate: " + bDay + "/" + bMonth + "/" + bYear);

                scn.close();
        



    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity4;

import java.util.Scanner;
public class Activity4 {

    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       
        System.out.println("Math : ");
        float mathGrade = scn.nextFloat();
        System.out.println("English");
        float englishGrade = scn.nextFloat();
        System.out.println("Chemistry");
        float chemistryGrade = scn.nextFloat();
        System.out.println("Physics");
        float physicsGrade = scn.nextFloat();
        System.out.println("Differential Equation");
        float deGrade = scn.nextFloat();
        
        float average = (mathGrade + englishGrade + chemistryGrade + physicsGrade + deGrade)/5;
        
        System.out.println();
        System.out.println("Average : " + average);
        
        if (average > 100)System.out.println("Invalid");
        else if (average >= 98)System.out.println("Summa Cum Laude");
        else if (average >= 95)System.out.println("Magna Cum Laude");
        else if (average >= 90)System.out.println("Cum Laude");
        else if (average >= 75)System.out.println("Cum Pyansa");
        
        else System.out.println("Kita nalang ta sunod tuig :))");
    }
    
}

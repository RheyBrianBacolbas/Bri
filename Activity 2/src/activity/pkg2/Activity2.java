/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2;

/**
 *
 * @author Student
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 1. Declare and initialize an array of integers with at least 5 elements
       
       int[] myArray = {9000, 700, 7000, 4500, 100};
       // 2. Print Each element of the array on the new line
        System.out.println("Array Elements:");
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i +":" + myArray[i]);
            
            // 3. Calculate and Print Array Sum
            
            int arraySum = 0;
            for (int num: myArray) {
                arraySum += num;
            }
            
       
        }
        }
    }
    


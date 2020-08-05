/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading_up;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Grading_up {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count, i;
        float totalmarks=0, percentage;
        Scanner scanner ;
        scanner = new Scanner (System.in);
        System.out.println("Enter Number of Subjects :");
        count = scanner.nextInt();
        System.out.println("Enter marks of " + count + " Subject " );
        for(i=0;i<count ;i++){
            totalmarks += scanner.nextInt();
        }
        System.out.println("Total Marks :" + totalmarks);
        percentage = (totalmarks/(count));
        System.out.println("Percentage is : " + percentage + "%");
        System.out.println("The student Grade is : ");
        if(percentage>= 80){
            System.out.println("A");
        }
        else if(percentage>=60 && percentage<80)
        {
            System.out.println("B");
        }
        else if(percentage>=40 && percentage<60)
        {
            System.out.println("C");
        }
        else{
                System.out.println("D");
        }
    }    
}

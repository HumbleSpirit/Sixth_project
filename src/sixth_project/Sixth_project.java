/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth_project;

import java.util.Scanner;


/**
 *
 * @author Boro_s99
 */
public class Sixth_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
  /*  int number1 = 1234;
    int count = 0;
    int sum = 0;
    while (number1 > 0)
    {
        sum += number1 % 10 ;
        number1 = number1 / 10;
        count++;
    }
        int menuChoice = 0;
    
        System.out.println("Simple menu with do-while");
        Scanner in = new Scanner(System.in); 
           
        do
        {
            System.out.println("Please enter number");
             menuChoice = in.nextInt(); 
            
        }
        while ((menuChoice <= 4) && (menuChoice > 0));
        System.out.println("Please enter correct number"); */
            
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                if (i > 0 && j > 0)
                {
                    System.out.print(i*j + "\t");
                }
                
            }
           System.out.println(" ");
        }
    
    }

}

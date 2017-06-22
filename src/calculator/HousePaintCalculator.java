/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author bshimkaveg
 */
public class HousePaintCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double windowHeight = 5;
        double windowWidth = 3;
        double doorHeight = 7;
        double doorWidth = 3;
        double houseWidth;
        double houseHeight;
        double houseDepth;
        double paintCoverage = 300;//feet^2 per gallon
        double pricePerGallon;
        double gallonsOfPaint;
        double paintArea;
        double priceForPaint;
        int numberOfDoors;
        int numberOfWindows;

        Scanner ask = new Scanner (System.in);
        
        System.out.println("Enter your house width (ft): ");
        houseWidth = ask.nextDouble();
        System.out.println("Enter your house height (ft): ");
        houseHeight = ask.nextDouble();
        System.out.println("Enter your house depth (ft): ");
        houseDepth = ask.nextDouble();
        System.out.println("Enter the number of doors in your house: ");
        numberOfDoors = ask.nextInt();
        System.out.println("Enter the number of windows in your house: ");
        numberOfWindows = ask.nextInt();
        System.out.println("Enter the price per gallon: ");
        pricePerGallon = ask.nextDouble();
        
        
        //  Paint Area         =    LongWalls                +      ShortWalls              -    Total Door Area                        - Total Window Area 
        paintArea = (2*houseWidth*houseHeight)   +    (2*houseHeight*houseDepth)     -    (doorWidth*doorHeight*numberOfDoors)   -  (windowWidth*windowHeight*numberOfWindows);
        gallonsOfPaint = paintArea/paintCoverage;
        priceForPaint = pricePerGallon * gallonsOfPaint;
        
        System.out.println();
        System.out.println("Your painting area will be "+paintArea+" squared feet, and you will need "+gallonsOfPaint+" gallons of paint, and it will cost about $ "+priceForPaint);
        System.out.println();
              
    }
    
}

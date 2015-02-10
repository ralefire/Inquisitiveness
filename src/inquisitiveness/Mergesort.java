/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquisitiveness;

/**
 *
 * @author Admin
 */
public class Mergesort {
    
    public static void sortSelection(Double array[], int num)
    {
       //Define the "sorted side"
       int iWall = 0;

       //Place each item in sorted position once
       while (iWall < num)
       {
          //Find teh smallest unsorted item
          int smallestPosition = iWall;
          for (int i = iWall; i < num; i++)
             if (array[smallestPosition] > array[i])
                smallestPosition = i;

          //Place it in next slot
          Double tmp = array[iWall];
          array[iWall] = array[smallestPosition];
          array[smallestPosition] = tmp;
          iWall++;
       }
    }
   
}

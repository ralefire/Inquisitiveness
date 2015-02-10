/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquisitiveness;

import java.util.Objects;

/**
 *
 * @author Admin
 */

public class Quicksort 
{
    void sortQuick(double[] array, int num)
    {
       double tmp = 0.0;
       //If the array is 1 or 2 elements long
       if (num <= 2)
       {
          if (num == 1)                 //If only a single item (sorted)
             return;
          else if (array[1] > array[0]) //If 2, (sorted)
             return;
          else                          //If 2, (unsorted) swap
          {
             tmp = array[0]; array[0] = array[1]; array[1] = tmp; //swap
             return;
          }
       }
       //If more than 2 elements are in the array
       else
       {
          int iStart = 0;
          int iEnd   = num - 1;
          double pivot = array[num / 2];     //Identify the pivot
          while (iStart <= iEnd)
          {
             //If two elements are misplaced on opposite sides, swap
             if (((array[iStart] > pivot || Objects.equals(array[iStart], pivot))
                  && (pivot > array[iEnd] || Objects.equals(pivot, array[iEnd]))))
             {
                tmp = array[iStart]; array[iStart] = array[iEnd]; array[iEnd] = tmp; //swap
                iStart++;
                iEnd--;
             }

             //If both are less than pivot and UNSORTED
             else if (!(array[iStart] > pivot) && !(array[iEnd] > pivot)
                      && (array[iStart] > array[iEnd]))
             {
                tmp = array[iStart]; array[iStart] = array[iEnd]; array[iEnd] = tmp; //swap
                iStart++;
             }

             //If both are less than pivot and SORTED
             else if (!(array[iStart] > pivot) && !(array[iEnd] > pivot))
                iStart++;

             //If both are greater than pivot and UNSORTED
             else if ((array[iStart] > pivot) && (array[iEnd] > pivot)
                      && (array[iStart] > array[iEnd]))
             {
                tmp = array[iStart]; array[iStart] = array[iEnd]; array[iEnd] = tmp; //swap
                iEnd--;
             }

             //If both are greater than pivot and SORTED
             else if ((array[iStart] > pivot) && (array[iEnd] > pivot))
                iEnd--;

             //If both are on the correct side of the pivor
             else
             {
                iStart++;
                iEnd--;
             }
          }

          //If indicies landed on different elements
          if (iStart > iEnd)
          {
             // copy the sub array into remaining
             int size = num - iStart;
             double[] remaining = new double[size];
             System.arraycopy(array, iStart, remaining, 0, size);
             
             sortQuick(array, iStart);
             sortQuick(remaining, size);
          }

          //If indicies landed on the same element
          else
          {
             int size = num - (iStart + 1);
             double[] remaining = new double[size];
             System.arraycopy(array, iStart + 1, remaining, 0, size);  
              
             sortQuick(array, iStart + 1);
             sortQuick(remaining, size);
          }
       }
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquisitiveness;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Inquisitiveness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        Object tempLine;
        List<Object> vector = new ArrayList();
        
        while ((tempLine = in.readLine()) != null) {
            vector.add(tempLine);
        }
        
        double array[];
        array = new double[vector.size()];
        
        for (int i = 0; i < array.length; i++)
            array[i] = (double)vector.get(i);
        
        Quicksort sort = new Quicksort();
        
        long startTime = System.nanoTime();
        sort.sortQuick(array, array.length);
        System.out.print((System.nanoTime() - startTime) / 1000000000);
    }
    
}

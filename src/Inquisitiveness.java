/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        String tempLine;
        List<String> vector = new ArrayList();
        
        while ((tempLine = in.readLine()) != null) {
            vector.add(tempLine);
        }
        
        double array[];
        array = new double[vector.size()];
        
        for (int i = 0; i < array.length; i++)
            array[i] = Double.parseDouble(vector.get(i));
        
        Quicksort sort = new Quicksort(array, array.length);
        
        double startTime = System.nanoTime();
        
        sort.sort(array);
        
        System.out.print((System.nanoTime() - startTime) / 1000000000);
        System.out.println(" ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    
}



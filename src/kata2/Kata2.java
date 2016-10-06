/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO G500
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //int[] data = {1,1,1,3,4,5,6,90};
        String[] data = {"Peppe" , "Luigi" , "Giovi" , "Peppe" , "Peppino" , "Gigi" , "Luigi"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogram = histo.getHistogram();
        
        
        for (String key : histogram.keySet()) {
            System.out.println(key + " ---> " + histogram.get(key));
        }
        
        
        
    }
    
}

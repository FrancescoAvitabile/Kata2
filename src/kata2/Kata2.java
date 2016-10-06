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
        
        
        int[] data = {1,1,1,3,4,5,6,90};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i)?histogram.get(i)+1:1);
        }
        
        
        for (int key : histogram.keySet()) {
            System.out.println(key + " ---> " + histogram.get(key));
        }
        
        
        
    }
    
}

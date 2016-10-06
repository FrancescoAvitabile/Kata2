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
        
        
        for (int i = 0; i < data.length; i++) {
          if(!histogram.containsKey(data[i])){
              histogram.put(data[i], 0);
          }
            histogram.put(data[i], histogram.get(data[i])+1);
        }
        
        
        for (int key : histogram.keySet()) {
            System.out.println(key + " ---> " + histogram.get(key));
        }
        
        
        
    }
    
}

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
public class Histogram<T> {
    private final T[] data;
    
    
    public Histogram(T[] data){
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    
    
    public Map<T,Integer> getHistogram(){
        Map<T,Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
          if(!histogram.containsKey(data[i])){
              histogram.put(data[i], 0);
          }
            histogram.put(data[i], histogram.get(data[i])+1);
        }
        return histogram;
        
    }
    
    
    
    
}




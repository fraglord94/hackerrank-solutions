/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arone008
 */
public class string_construction {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        Map<Character, Integer> map = new HashMap<>();
        int count = 0; 
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i); 
            if(!map.containsKey(c)){
                map.put(c, 1); 
                count++; 
            }
            else 
            {
                map.put(c, 1); 
            }
        }
        System.out.println(count);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dynamic_array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int lastans = 0;
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < q; i++) {
            int choice = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int index = (x ^ lastans) % n;
            switch (choice) {
                case 1: 
                    al.get(index).add(y);
                    break;
                case 2: 
                    lastans = al.get(index).get(y % al.get(index).size());
                    System.out.println(lastans);
                    break;
            }

        }

    }
}

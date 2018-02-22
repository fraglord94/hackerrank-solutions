/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aronee
 */
public class pascal {

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> table = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(j, 1);
                } else {
                    row.add(j, table.get(i - 1).get(j) + table.get(i - 1).get(j - 1));

                }
            }
            table.add(i, row);
        }
        return table;
    }
}

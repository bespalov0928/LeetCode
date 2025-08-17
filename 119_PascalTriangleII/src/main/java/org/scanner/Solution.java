package org.scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(Arrays.asList(1));
        List<List<Integer>> trg = new ArrayList<>(Arrays.asList(row));

        while (trg.size() <= rowIndex) {
            List<Integer> prev = new ArrayList<>();

            prev.add(0);
            for (int r : trg.get(trg.size()-1)) {
                prev.add(r);
            }
            prev.add(0);

            List<Integer> newRow = new ArrayList<>();
            for (int i = 0; i < prev.size() - 1; i++) {
                newRow.add(prev.get(i)+prev.get(i+1));
            }
            trg.add(newRow);
        }

        return trg.get(trg.size()-1);
    }
}
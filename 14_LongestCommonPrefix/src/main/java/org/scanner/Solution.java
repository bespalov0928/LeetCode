package org.scanner;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String rsl = strs[0];
        int rslLength = rsl.length();
        for(String str:strs){
            String strTemp = str;
            while (rslLength>str.length() || !rsl.equals(strTemp.substring(0,rslLength))){
                rslLength--;
                if(rslLength==0){
                    return "";
                }
                rsl = rsl.substring(0,rslLength);

            }
        }

        return rsl;
    }
}
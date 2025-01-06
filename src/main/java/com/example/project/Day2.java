
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[] niceList = new String[names.length];
        String[] naughtyList = new String[names.length];
        int niceIndex = 0;
        int naughtyIndex = 0;
        for (int i = 0; i < names.length; i++) {
            int randomNum = (int) (Math.random() * 2);
            if (randomNum == 0){
                naughtyList[naughtyIndex] = names[i];
                naughtyIndex++;
            } else {
                niceList[niceIndex] = names[i];
                niceIndex++;
            } 
        }
        return new String[][] {niceList, naughtyList};
    }

    public static void main(String[] args) {
    }
}
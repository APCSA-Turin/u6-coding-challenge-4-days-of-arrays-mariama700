package com.example.project;

public class Day3 {
  public static String[][] generateSnowflake(int size) {
      if (size % 2 == 0) {
          throw new IllegalArgumentException("Size must be an odd number");
      }
      String[][] grid = new String[size][size];
      for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
              grid[i][j] = " ";
          }
      }
      
      int middle = size / 2;
      for (int i = 0; i < size; i++) {
          grid[middle][i] = "*";
          grid[i][middle] = "*";
          grid[i][i] = "*";
          grid[i][size - i - 1] = "*";
      }
      return grid;
  }


    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}

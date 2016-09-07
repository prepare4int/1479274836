package com.test.introduction.stock.bruteforce;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    double[] data = new double[]{1,2,3,2,1,5,2,1};
    double[] diff = new double[data.length];
    int n=0;
    for(int i=0;i<data.length;++i){
      for(int j=i;j<data.length-1;++j){
        n++;
        if(diff[i] < data[j]-data[i]){
          diff[i] = data[j]-data[i];
          System.out.println(i+" -> "+j);
        }
      }
    }
    double max = 0;
    for(int i=0;i<diff.length;++i){
      if(diff[i] > max){
        max = diff[i];
      }
    }
    System.out.println("Diff "+Arrays.toString(diff));
    System.out.println("Max "+max);
    System.out.println("Complexity "+n);
  }
}

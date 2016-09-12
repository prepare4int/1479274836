package com.test.introduction.stock.divideandconquer;

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
    System.out.println("MAX "+divide(data,0,data.length));
  }
  private static Pair divide(double[] data,int start,int end){
    if(start == end){
      if(end <data.length)
        return new Pair(data[start],data[start]); 
      else
        return new Pair(Double.MAX_VALUE,Double.MIN_VALUE); 
    }
    Pair first = divide(data,start,((start+end)/2));
    Pair second = divide(data,((start+end)/2)+1,end);
    return new Pair(first.min < second.min ? first.min : second.min,
                   first.max > second.max ? first.max:second.max);
  }
  
  private static class Pair{
    private double min,max;
    private Pair(double min,double max){
      this.min = min;
      this.max = max;
    }
    public String toString(){
      return min+" , "+max+ " => "+(max-min);
    }
  }
}

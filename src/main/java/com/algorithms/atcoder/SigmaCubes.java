package com.algorithms.atcoder;

import java.util.*;

public class SigmaCubes {

	  
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int acc=0;
	    
	    for (int i =1; i<=n;i++) {
	      acc+= i % 2 == 0 ? i*i*i : (-1)*i*i*i;
	    }
	    
	    System.out.print(acc);
	    
	    sc.close();
	  } 
}

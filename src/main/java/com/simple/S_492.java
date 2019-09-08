package com.simple;

public class S_492 {
	public int[] constructRectangle(int area) {
        int i = 1;
        int j = area;
        
        int result[] = new int[2];
        
        while(i <= j) {
        	long product = i * j;
        	if(product == area) {
        		result[0] = j--;
        		result[1] = i++;
        	}else if (product > area) {
        		j--;
        	}else {
        		i++;
        	}
        }
        
		return result;
    }
}

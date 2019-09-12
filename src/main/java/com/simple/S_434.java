package com.simple;

public class S_434 {

	public int countSegments(String s) {
		if(s.isEmpty() || s == null) {
			return 0;
		}
		
		String[] segments = s.split(" ");
        int result = 0;
        for (String seg : segments) {
            if ("".equals(seg)) {
                continue;
            }
            result++;
        }
		
		return result;
    }
	
	public static void main(String[] args) {
		S_434 s_434 = new S_434();
		System.out.println(s_434.countSegments("Hello, my name is John"));;
	}
}

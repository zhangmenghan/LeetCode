package com.simple; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* S_821 Tester. 
* 
* @author <Authors name> 
* @since <pre>septemper 17, 2019</pre>
* @version 1.0 
*/ 
public class S_821Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: shortestToChar(String S, char C) 
* 
*/ 
@Test
public void testShortestToChar() throws Exception { 
    S_821 s_821 = new S_821();
    int[] result = s_821.shortestToChar("loveleetcode",'e');
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + "    ");
    }
} 


} 

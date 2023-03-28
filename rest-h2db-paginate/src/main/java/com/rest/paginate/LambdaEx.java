package com.rest.paginate;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
interface PerformOperation {
 boolean check(int a);
}



public class LambdaEx {
	
	
	 public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
		 }
		 
		 public PerformOperation  isOdd(){
		    return var-> var%2==0?true:false;
		      
		 }
		 
		 public PerformOperation  isPrime(){
		    
		  return var->IntStream.range(2,var).
				  filter(val->var%val==0).boxed().collect(Collectors.toList()).size()>=1?false:true;
		 }
		 
		 
		 public PerformOperation  isPalindrome(){
		    try{  
		          return str->Integer.valueOf(str).toString().
		        		  equals(new StringBuilder(Integer.valueOf(str).toString()).reverse()
		    .toString());     
		    }catch(Exception e){
		        e.printStackTrace();
		        return null;
		    }
		     
		     
		 }
	

 public static void main(String[] args) throws IOException {
	 LambdaEx ob = new LambdaEx();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}

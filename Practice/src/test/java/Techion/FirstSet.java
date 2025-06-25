package Techion;

import org.testng.annotations.Test;

public class FirstSet {

	@Test
	public void program1() {
		
		String s = "ABCDEFDAA";
		char[] ch = s.toCharArray();
		for(int i=0; i<=ch.length-1; i++) {
			for(int j=i+1; j<=ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					ch[j]='@';
				}
			}
			if(ch[i]!='@') {
				System.out.print(ch[i]);
			}
		}
		System.out.println("---------------");
	}
	
	@Test
	public void swap2String() {
		
		String s1 = "R"; 
		String s2 = "Raju";
		
		s1 = s1 + s2;     //RRaju
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);
		System.out.println("---------------");
	}
	
	@Test
	public void swap2Int() {
		
		int n1 = 10;
		int n2 = 20;
		
		//Without 3rd variable
//		n1 = n1 + n2;
//		n2 = n1 - n2;
//		n1 = n1 - n2;
//		System.out.println(n1);
//		System.out.println(n2);
		
		//With 3rd variable
		int temp = n1;
		n1=n2;
		n2=temp;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("---------------");
	}
	
	@Test
	public void reverseAstring() {
		
		String s = "Malayalam";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			rev+=ch;
		}
		System.out.println(rev);
		System.out.println("---------------");
		
		//to check Palindrome or not
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		System.out.println("---------------");
	}
	
	@Test
	public void reverseAsentence() {
		
		String s = "Java Programs";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			rev+=ch;
		}
		System.out.println(rev);
		System.out.println("---------------");
	}
	
	@Test
	public void occurenceOfCharFromString() {
		
		String s = "Java Programs";
		char[] ch = s.toLowerCase().toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			int count = 1;
			for (int j = i+1; j <= ch.length - 1; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '@';
					count++;
				}
			}
			if (ch[i] != '@') {
				System.out.println(ch[i] + " " + count);
			}
		}
		System.out.println("---------------");
	}
	
	@Test
	public void seperateIntFromString() {
		
		String s = "a1s2d3f4g5h6j7k8l9";
		String s1 = "";
		for(int i=0; i<=s.length()-1; i++) {
			if(Character.isDigit(s.charAt(i))) {
				
			}else {
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
		System.out.println("---------------");
	}
	
	@Test
	public void largestNums() {
		
		int[] n = { 0, 1, 2, 3, 4, 5, 6 };
		
		
	    int max = Integer.MIN_VALUE;
	    int smax = Integer.MIN_VALUE;
	    int tmax = Integer.MIN_VALUE;
		
		for(int i=0; i<=n.length-1; i++) {
			if(n[i]>max) {
				tmax = smax;
				smax=max;
				max=n[i];
			}else if(n[i]>smax && n[i]!=max) {
				smax = n[i];
			}else if(n[i]>tmax && n[i]!=smax && n[i]!=max) {
				tmax = n[i];
			}
		}
		
		System.out.println(max);
		System.out.println(smax);
		System.out.println(tmax);
		
		
	}
	
	
	
	
	
	
	}
	
	
	


package com.basic1;

public class Peevo {	
	static int hap= 0;
	static int num1= 1;
	static int num2 = 1;
	public static void main(String[] args) {

	System.out.print(num1);
	System.out.print(" " +num2);
	
	for(int i=0;i<38;++i) {
		
		hap= num1+num2;
		//new hap = 위의 num2 +위의 합
		System.out.print(" "+hap);
		num1= num2;
		num2=hap;
		//위에 두줄 순서 바뀌면 덮여쓰여서 이상하게 나옴.
				
		}
	}
}

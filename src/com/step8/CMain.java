package com.step8;

import java.util.StringTokenizer;

class C{
	StringTokenizer st = new StringTokenizer("200|kiwi|tomato|¿À´Ã¹¹ÇØ?","|");
}
public class CMain {
	C c = new C();
	void m(StringTokenizer st) {
		int cnt = st.countTokens();//4
		System.out.println(cnt);
		st.nextToken();//200
		System.out.println(st.nextToken());//kiwi
		System.out.println(st.nextToken());//kiwi
		System.out.println(st.nextToken());//kiwi		
	}
	public static void main(String[] args) {
		CMain cm = new CMain();
		cm.m(cm.c.st);
		

	}

}

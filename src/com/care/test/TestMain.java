package com.care.test;

import com.care.zzz.TestClass;
import com.care.zzz.TestClass02;
//import  com.care.zzz.*; 		: com.care.zzz 패키지 내부의 클래스를 전부 가져다 쓰겠다

public class TestMain {
	
	/*﻿
	ㅁ 패키지(package)
	- 이름 생성 : url역순 프로젝트명
	(ex : com.naver.testproject)
	 */
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.test();
		
		TestClass tc = new TestClass();
		tc.testClass01();
		//tc.testClass02(); 	: 다른 패키지, public 없는 메소드
		
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
	}
}

package com.company.app;

import org.junit.Test;


// 원시(rpimitive type) : int, log, char			float double  : 초기값 0, 0,0
//1. 객체화 					inter long character	Float : 	null
//2. 타입변환  string <--> int, long

//리스트만들때 다 객체화해서 담아야한다.
public class WrapperTest {
	@Test
	public void test() {
		int a = new Integer(10); //팩
		Integer b = a;
		String c = b.toString(); //스트링으로 변환
		a = Integer.parseInt(c); //스트링을 int로 변환
		
	}
}

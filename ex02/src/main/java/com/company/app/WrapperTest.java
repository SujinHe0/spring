package com.company.app;

import org.junit.Test;


// ����(rpimitive type) : int, log, char			float double  : �ʱⰪ 0, 0,0
//1. ��üȭ 					inter long character	Float : 	null
//2. Ÿ�Ժ�ȯ  string <--> int, long

//����Ʈ���鶧 �� ��üȭ�ؼ� ��ƾ��Ѵ�.
public class WrapperTest {
	@Test
	public void test() {
		int a = new Integer(10); //��
		Integer b = a;
		String c = b.toString(); //��Ʈ������ ��ȯ
		a = Integer.parseInt(c); //��Ʈ���� int�� ��ȯ
		
	}
}

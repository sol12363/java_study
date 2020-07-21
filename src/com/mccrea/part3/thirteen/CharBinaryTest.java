package com.mccrea.part3.thirteen;

/**
 * 
 * @ClassName:  CharBinaryTest   
 * @Description: 编写一个方法，它以二进制形式显示char类型的的值。
 * 使用多个不同的字符来展示它。
 * @author: gaojian
 * @date:   2020年7月21日 下午3:10:43      
 * @Copyright:
 */
public class CharBinaryTest {
	
	public static String charToBinary(char c) {
		return Integer.toBinaryString(c);
	}

	public static void main(String[] args) {
		System.out.println("Q: " + charToBinary('Q'));
		System.out.println("W: " + charToBinary('W'));
		System.out.println("E: " + charToBinary('E'));
		System.out.println("R: " + charToBinary('R'));
		System.out.println("1: " + charToBinary('1'));
	}

}

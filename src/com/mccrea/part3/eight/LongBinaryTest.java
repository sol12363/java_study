package com.mccrea.part3.eight;

/**
 * 
 * @ClassName:  LongBinaryTest   
 * @Description: 展示用十六进制和八进制计数法来操作long值，
 * 用Long.toBinaryString()来显示结果
 * @author: gaojian
 * @date:   2020年7月21日 下午2:34:53      
 * @Copyright:
 */
public class LongBinaryTest {

	public static void main(String[] args) {
		long num1 = 0X2E;
		long num2 = 016;
		System.out.println("num1: " + Long.toBinaryString(num1));
		System.out.println("num2: " + Long.toBinaryString(num2));
	}/* Output:
	num1: 101110
    num2: 1110
	*///:~
}

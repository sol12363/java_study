package com.mccrea.part3.twelve;

/**
 * 
 * @ClassName:  LeftRightShiftTest   
 * @Description: 以一个所有位都为1的二进制数字开始，先左移它，
 * 然后用符号右移操作符对其进行右移，直至所有的二进制位都被移出为止，
 * 毎移一位都要使用Integer.toBinaryString()显示结果。
 * @author: gaojian
 * @date:   2020年7月21日 下午3:05:55      
 * @Copyright:
 */
public class LeftRightShiftTest {

	public static void main(String[] args) {
		int num = 0XF;
		System.out.println(Integer.toBinaryString(num));
		System.out.println("左移： " + Integer.toBinaryString(num <<= 1));
		System.out.println("右移： " + Integer.toBinaryString(num >>>= 1));
		System.out.println("右移： " + Integer.toBinaryString(num >>>= 1));
		System.out.println("右移： " + Integer.toBinaryString(num >>>= 1));
		System.out.println("右移： " + Integer.toBinaryString(num >>>= 1));
		System.out.println("右移： " + Integer.toBinaryString(num >>>= 1));
	}/* Output:
	1111
	左移： 11110
	右移： 1111
	右移： 111
	右移： 11
	右移： 1
	右移： 0
	*///:~

}

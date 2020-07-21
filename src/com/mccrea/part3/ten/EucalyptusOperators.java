package com.mccrea.part3.ten;

/**
 * 
 * @ClassName:  EucalyptusOperators   
 * @Description:编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，
 * 其中最低有效位为0，另一个也具有交替的二进制位1和0，但是最低有效位为1
 * （提示：使用十六进制常量来表示是最简单的方法）。取这两个值，
 * 用按位操作符以所有可能的方式结合运算它们，然后用Integer.toBinaryString()显示。
 * @author: gaojian
 * @date:   2020年7月21日 下午2:49:59      
 * @Copyright:
 */
public class EucalyptusOperators {

	public static void main(String[] args) {
		int num1 = 0X2A;
		int num2 = 0X15;
		System.out.println("num1: " + Integer.toBinaryString(num1));
		System.out.println("num2: " + Integer.toBinaryString(num2));
		System.out.println("num1&num2: " + Integer.toBinaryString(num1&num2));
		System.out.println("num1|num2: " + Integer.toBinaryString(num1|num2));
		System.out.println("num1^num2: " + Integer.toBinaryString(num1^num2));
		System.out.println("~num1: " + Integer.toBinaryString(~num1));
		System.out.println("~num2: " + Integer.toBinaryString(~num2));
	}/* Output:
	num1: 101010
	num2: 10101
	num1&num2: 0
	num1|num2: 111111
	num1^num2: 111111
	~num1: 11111111111111111111111111010101
	~num2: 11111111111111111111111111101010
	*///:~

}

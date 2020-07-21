package com.mccrea.part3.eleven;

/**
 * 
 * @ClassName:  RightShiftTest   
 * @Description: 以一个最高有效位为1的二进制数字开始（提示：使用十六进制常量），用有符号右移操作符对其进行进行右移，
 * 直至所有的二进制位都被移出为止，每移一位都要使用Integer.toBinaryString()显示结果。
 * @author: gaojian
 * @date:   2020年7月21日 下午3:00:41      
 * @Copyright:
 */
public class RightShiftTest {

	public static void main(String[] args) {
		int num = 0XAC;
		for (int i = 0; i <=8; i ++) {
			System.out.println(i + ">>:  " + Integer.toBinaryString(num >> i));
		}
	}/* Output:
	0>>:  10101100
	1>>:  1010110
	2>>:  101011
	3>>:  10101
	4>>:  1010
	5>>:  101
	6>>:  10
	7>>:  1
	8>>:  0
	*///:~

}

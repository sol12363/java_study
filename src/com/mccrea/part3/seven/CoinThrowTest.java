package com.mccrea.part3.seven;

import java.util.Random;

/**
 * 
 * @ClassName:  CoinThrowTest   
 * @Description: 编写一个程序，模拟扔硬币的结果  
 * @author: gaojian
 * @date:   2020年7月21日 下午2:28:48      
 * @Copyright:
 */
public class CoinThrowTest {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(2);
		if (num == 0) {
			System.out.println("正面");
		} else {
			System.out.println("反面");
		}
	}/* Output:
	正面
	*///:~

}

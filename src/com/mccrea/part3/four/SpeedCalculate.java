package com.mccrea.part3.four;

/**
 * 
 * @ClassName:  SpeedCalculate   
 * @Description: 编写一个计算速度的程序，它所使用的距离和时间都是常量 
 * @author: gaojian
 * @date:   2020年7月21日 下午2:08:16      
 * @Copyright:
 */
public class SpeedCalculate {

	public static void main(String[] args) {
		float distance = 110;
		float time = 2.5f;
		float speed = calculateSpeed(distance, time);
		System.out.println("distance = " + distance + ", time = " + time + ", speed = " + speed);
	}/* Output:
	distance = 110.0, time = 2.5, speed = 44.0
	*///:~
	
	/**
	 * 
	 * @Title: calculateSpeed   
	 * @Description: 计算速度
	 * @param: @param distance 距离
	 * @param: @param time 时间
	 * @param: @return  速度    
	 * @return: float      
	 * @throws
	 */
	private static float calculateSpeed(float distance, float time) {
		return distance / time;
	}

}

package com.mccrea.part3.two;

/**
 * 
 * @ClassName:  PersonTest   
 * @Description: 创建一个包含一个float域的类，并且用这个类来展示别名机制测试
 * @author: gaojian
 * @date:   2020年7月21日 下午1:45:32      
 * @Copyright:
 */
public class PersonTest {
	
	/**
	 * 
	 * @Title: main   
	 * @Description: 测试别名机制 
	 * @param: @param args      
	 * @return: void      
	 * @throws
	 */
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1.weight = 120.3f;
		person2.weight = 110.3f;
		System.out.println("1: person1.weight: " + person1.weight + ", person2.weight: " + person2.weight);
		person1 = person2;
		System.out.println("2: person1.weight: " + person1.weight + ", person2.weight: " + person2.weight);
		person1.weight = 130.7f;
		System.out.println("3: person1.weight: " + person1.weight + ", person2.weight: " + person2.weight);
	}/* Output:
	1: person1.weight: 120.3, person2.weight: 110.3
    2: person1.weight: 110.3, person2.weight: 110.3
    3: person1.weight: 130.7, person2.weight: 130.7
	*///:~

}

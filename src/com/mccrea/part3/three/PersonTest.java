package com.mccrea.part3.three;

/**
 * 
 * @ClassName:  PersonTest   
 * @Description: 创建一个包含一个float域的类，并且用这个类来展示方法调用时的别名机制
 * @author: gaojian
 * @date:   2020年7月21日 下午1:57:41      
 * @Copyright:
 */
public class PersonTest {
	
	private static void setWeight(Person person) {
		person.weight = 110.3f;
	}

	/**
	 * 
	 * @Title: main   
	 * @Description: 测试方法调用时的别名机制 
	 * @param: @param args      
	 * @return: void      
	 * @throws
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.weight = 120.7f;
		System.out.println("1: person.weight: " + person.weight);
		setWeight(person);
		System.out.println("2: person.weight: " + person.weight);
	}/* Output:
	1: person.weight: 120.7
    2: person.weight: 110.3
	*///:~

}

package com.mccrea.part3.fourteen;

/**
 * 
 * @ClassName:  StringCompareTest   
 * @Description: 编写一个接收两个字符串参数的方法，用各种布尔值的比较关系来比较这两个字符串，然后把结果打印出来。做==和!=比较的同时，用equals()作测试。
 * 在main()里面用几个不同的字符串对象调用这个方法。  
 * @author: gaojian
 * @date:   2020年7月21日 下午3:19:13      
 * @Copyright:
 */
public class StringCompareTest {
	
	public static void compareStr(String str1, String str2) {
		System.out.println(str1 + "&" + str2);
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 != str2: " + (str1 != str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
	}

	public static void main(String[] args) {
		compareStr("sqwe", "kjhg");
		compareStr("abfs", new String("abfs"));
	}/* Output:
	sqwe&kjhg
	str1 == str2: false
	str1 != str2: true
	str1.equals(str2): false
	abfs&abfs
	str1 == str2: false
	str1 != str2: true
	str1.equals(str2): true
	*///:~

}

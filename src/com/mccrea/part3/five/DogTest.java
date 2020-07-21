package com.mccrea.part3.five;

/**
 * 
 * @ClassName:  DogTest   
 * @Description: 显示两只狗的名字和叫声
 * @author: gaojian
 * @date:   2020年7月21日 下午2:20:45      
 * @Copyright:
 */
public class DogTest {

	public static void main(String[] args) {
		Dog spotDog = new Dog();
		Dog scruffyDog = new Dog();
		spotDog.name = "spot";
		spotDog.says = "Ruff! ";
		scruffyDog.name = "scruffy";
		scruffyDog.says = "Wurf! ";
		System.out.println("1：spotDog.name：" + spotDog.name + ", spotDog.says: " + spotDog.says);
		System.out.println("2：scruffyDog.name：" + scruffyDog.name + ", scruffyDog.says: " + scruffyDog.says);
	}/* Output:
	1：spotDog.name：spot, spotDog.says: Ruff! 
      2：scruffyDog.name：scruffy, scruffyDog.says: Wurf!
	*///:~

}

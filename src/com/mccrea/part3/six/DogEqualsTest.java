package com.mccrea.part3.six;

import com.mccrea.part3.five.Dog;

/**
 * 
 * @ClassName:  DogEqualsTest   
 * @Description: 练习5基础上测试equals和==   
 * @author: gaojian
 * @date:   2020年7月21日 下午2:22:54      
 * @Copyright:
 */
public class DogEqualsTest {

	public static void main(String[] args) {
		Dog spotDog = new Dog();
		Dog scruffyDog = new Dog();
		spotDog.name = "spot";
		spotDog.says = "Ruff! ";
		scruffyDog.name = "scruffy";
		scruffyDog.says = "Wurf! ";
		Dog spotDogNew = new Dog();
		spotDogNew = spotDog;
		System.out.println("1: spotDog.equals(scruffyDog): " + spotDog.equals(scruffyDog));
		System.out.println("2: spotDog == scruffyDog: " + (spotDog == scruffyDog));
		System.out.println("3: spotDog.equals(spotDogNew): " + spotDog.equals(spotDogNew));
		System.out.println("4: spotDog == spotDogNew: " + (spotDog == spotDogNew));
		System.out.println("5: scruffyDog.equals(spotDogNew): " + scruffyDog.equals(spotDogNew));
		System.out.println("6: scruffyDog == spotDogNew: " + (scruffyDog == spotDogNew));
	}/* Output:
	1: spotDog.equals(scruffyDog): false
	2: spotDog == scruffyDog: false
	3: spotDog.equals(spotDogNew): true
	4: spotDog == spotDogNew: true
	5: scruffyDog.equals(spotDogNew): false
	6: scruffyDog == spotDogNew: false
	*///:~

}

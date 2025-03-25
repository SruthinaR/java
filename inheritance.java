package OOPs;

import java.util.*;

class Animal{

	 void sound() {

		 System.out.println("animals make sound.");

	 }

 }

 /*class Dog extends Animal{

	 void bark() {                         //single inheritance

		 System.out.println("Dog barks."); 

	 }

 }*/

/*class Dog extends Animal1{

	 void bark() {                                       //multi level  inheritance

		 System.out.println("Dog barks."); 

	 }

}*/

class Dog extends Animal{

	 void bark() {                         

		 System.out.println("Dog barks."); 

	 }

}



class Cat extends Animal{

	void meow(){

		System.out.println("Cat meow.");	 //hierarchical inheritance

	}

}



class Puppy extends Dog{                      

	void weep()

	{

		System.out.println("Puppy weeps.");

	}

}

 public class inheritance {

	 public static void main(String args[]) {

	/*Dog d1=new Dog();

	d1.sound();                      //single

	d1.bark();*/

		 /* Puppy p1=new Puppy();

		  p1.sound();

		  p1.bark();                  //multi level

		  p1.weep(); */

		 Dog d1=new Dog();

		 Cat c1=new Cat();               //hiercrchiacl 

		 d1.bark();

		 c1.meow();

		  }

 }


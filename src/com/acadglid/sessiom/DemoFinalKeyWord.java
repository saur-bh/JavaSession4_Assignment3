
/*
 * Write a program in java to demonstrate the use of final keyword with class, with the method, with
	the constructor, and with a variable.
 */

package com.acadglid.sessiom;

public class DemoFinalKeyWord 
{

	final double PI = 3.14 ; //Variable declared final can not be changed 

	final String var; // declaration of variable with final which can be initialize in constructor

	DemoFinalKeyWord(){

		var = "I am intialized in constructor declared outside as final ";
		System.out.println(var);
		System.out.println("This is PI variable having value :" +PI+" and intialized as well as declared ");
		// PI= 4.2;  This will give error as variable is initialize while declaration itself.


	}

	// Method is having final keyword can not be overriden in extended class Demo.

	final void DemoMethod() {

		System.out.println("I am demoMethod which can  be overloaded but not  overriden");
	}


	// This can be  overiden in Demo Class 

	void DemoMethod(String var) {

		System.out.println("This is DemoMethod from parent class : DemoFinalKEyword");
	}


	public static void main(String[] arg) {


		// Final class Demo  which can not be extended 


		Demo demo = new Demo();

		// demo.PI = 31.1; This is illegal as PI is final can not be changed. 

		System.out.println("Can access the final value PI  "+ demo.PI);



		// Use of function which is declared final 

		demo.DemoMethod(); 

		// USe of overiden function which is not set as final 

		demo.DemoMethod("FromDemo");






	}

}

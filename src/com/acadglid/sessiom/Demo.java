package com.acadglid.sessiom;

final public class Demo extends DemoFinalKeyWord{

	/*
	 * void DemoMethod(){

		This will be error and illigal as function is define final in DemoFinalKeyword Class, it can not be inherited
	}

	 */

	Demo(){

		System.out.println("Final Class Demo which can not be extened");
	}

	void DemoMethod(String var) {

		System.out.println("I am in Demo class");


	}

}

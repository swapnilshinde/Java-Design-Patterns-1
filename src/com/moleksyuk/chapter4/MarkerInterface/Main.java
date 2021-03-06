/**
 * 
 */
package com.moleksyuk.chapter4.MarkerInterface;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 2, 2011
 * 
 * @author moleksyuk
 */
public class Main {

	public static void main(String[] args) {
		MarkedClass mk = new MarkedClass();
		NotMarkedClass nmk = new NotMarkedClass();

		Worker.doSomething(mk);
		Worker.doSomething(nmk);
	}
}

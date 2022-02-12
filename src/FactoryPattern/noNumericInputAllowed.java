package FactoryPattern;

public class noNumericInputAllowed extends Exception {

	public noNumericInputAllowed() {
		super();

	};

	public String toString() {
		return "Please enter A valid input (No number is Allowed)";
	}

};

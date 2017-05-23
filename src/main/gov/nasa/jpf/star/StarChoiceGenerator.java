package gov.nasa.jpf.star;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.symbc.numeric.PCChoiceGenerator;

public class StarChoiceGenerator extends PCChoiceGenerator {

	private Formula[] starPathConditions;

	public StarChoiceGenerator(int size) {
		super(0, size - 1);
		starPathConditions = new Formula[size];
	}

	// returns the formula for the current choice
	public Formula getCurrentPCStar() {
		return starPathConditions[getNextChoice()];
	}

	// sets the heap constraints for the current choice
	public void setCurrentPCStar(Formula pc) {
		starPathConditions[getNextChoice()] = pc;
	}

}

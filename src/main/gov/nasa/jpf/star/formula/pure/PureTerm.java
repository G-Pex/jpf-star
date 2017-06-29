package gov.nasa.jpf.star.formula.pure;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public abstract class PureTerm {
	
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return null;
	}
	
	public Variable[] getVars() {
		return null;
	}
	
	public PureTerm copy() {
		return this;
	}
	
	public void updateType(List<Variable> knownTypeVars) {
		return;
	}
	
	public void genTest(List<Variable> initVars, StringBuffer test, String objName, String clsName) {
		return;
	}

}

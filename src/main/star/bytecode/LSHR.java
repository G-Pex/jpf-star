package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.expression.BinaryExpression;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;
import starlib.formula.expression.Operator;

public class LSHR extends gov.nasa.jpf.jvm.bytecode.LSHR {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getOperandAttr(2);
		Expression sym_v2 = (Expression) sf.getOperandAttr(0);

		if (sym_v1 == null && sym_v2 == null)
			return super.execute(ti);// we'll still do the concrete execution
		else {
			int v2 = sf.pop();
			long v1 = sf.popLong();
			sf.pushLong(v1 >> v2); // support concolic
			
			Expression result = null;
			
			if (sym_v1 != null) {
				if (sym_v2 != null) {
					result = new BinaryExpression(Operator.SHIFTR, sym_v1, sym_v2);
				} else {
					result = new BinaryExpression(Operator.SHIFTR, sym_v1, new LiteralExpression(v2));
				}
			} else {
				result = new BinaryExpression(Operator.SHIFTR, new LiteralExpression(v1), sym_v2);
			}
			
			sf.setLongOperandAttr(result);

			return getNext(ti);
		}
	}

}

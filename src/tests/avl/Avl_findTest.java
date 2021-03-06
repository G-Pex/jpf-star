package avl;
import org.junit.Test;

import common.Constant;
import starlib.precondition.Initializer;

public class Avl_findTest extends TestAvl {
	
	@Override
	protected void initPrecondition() {
		String pre = "pre find == avl(this_root)";
		Initializer.initPrecondition(pre);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=2",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/avl",
				"+star.test_package=avl",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=avl.AvlTree.find(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AvlTree tree = new AvlTree();
			tree.find(0);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}

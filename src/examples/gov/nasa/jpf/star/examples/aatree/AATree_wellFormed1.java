package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_wellFormed1 extends TestJPF {

	@Test
	public void test_wellFormed1() throws Exception {
		AATree obj = new AATree();
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed2() throws Exception {
		AATree obj = new AATree();
		int level_4 = 1;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode left_2 = null;
		AANode right_3 = null;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed3() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = null;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed4() throws Exception {
		AATree obj = new AATree();
		AANode right_3 = new AANode();
		AANode left_2 = obj.nullNode;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_13 = 0;
		AANode left_14 = null;
		AANode right_15 = null;
		int level_16 = 0;
		right_3.element = element_13;
		right_3.left = left_14;
		right_3.right = right_15;
		right_3.level = level_16;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed5() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = null;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed6() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = new AANode();
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		int element_17 = 0;
		AANode left_18 = null;
		AANode right_19 = null;
		int level_20 = 0;
		left_2.element = element_17;
		left_2.left = left_18;
		left_2.right = right_19;
		left_2.level = level_20;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

}


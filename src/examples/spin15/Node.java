package spin15;

/*
 * Example from Antonio's model counting paper at SPIN 2015,
 * which is in turn adapted from Corina's TACAS 2003 paper
 * about generalized symbolic execution and lazy initialization
 */
class Node {
	int elem;
	Node next;

	public Node swapNode() {
		if (elem > next.elem) {
			Node t = next;
			next = t.next;
			t.next = this;
			return t;
		}
		return this;
	}
}

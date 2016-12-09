
class Chain {
	
	public static void main (String[] args) {
		ChildChain childChain = new ChildChain();
	}
	
}

class ParentChain {
	
	// No argument constructor
	ParentChain() {
		this("You are in the Parent"); // invokes one argument constructor ChainParent(String p)
		System.out.println("You are in the Parent no argument constructor");
	}
	
	// One argument constructor
	ParentChain(String p) {
		System.out.println(p + " one argument constructor");
	}
	
}

class ChildChain extends ParentChain {
	
	ChildChain() {
		super(); // Invokes parent's no argument constructor
		System.out.println("You are in the Child no argument constructor");
	}
	
}
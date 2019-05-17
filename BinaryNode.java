import java.util.*;
import java.io.*;

class BinaryNode{
	BinaryNode left;
	BinaryNode right;
	int value;

	BinaryNode(int value){
		this.left = null;
		this.right = null;
		this.value = value;
	}

	void leftInsert(int value){
		BinaryNode n = this;
		while (n.left != null){
			n = n.left;
			System.out.print("LEFT: " + n.value + "\n");
			// check(value);
		}
		n.left = new BinaryNode(value);
	}

	void rightInsert(int value){
		BinaryNode n1 = this;
		while (n1.right != null){
			n1 = n1.right;
			System.out.print("RIGHT: " + n1.value + "\n");
			// check(value);
		}
		n1.right = new BinaryNode(value);
	}

	private void check(int val){
		if(val < this.value){
			leftInsert(val);
		} else if (val > this.value) {
			rightInsert(val);		
		}
	}

	void add(int val){
		check(val);
	}
}
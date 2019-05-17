class Node{

	Node left = null;
	Node right = null;
	int value;

	Node(int value){
		this.value = value;
	}

	void checkRight(Node node, int value){
		if(node.right == null){
			node.right = new Node(value);
		}
		check(node.right, value);
	}

	void checkLeft(Node node, int value){
		if(node.left == null){
			node.left = new Node(value);
		}
		check(node.left, value);
	}

	void check(Node node, int value){
		if(node.value > value){
			checkRight(node, value);
		} else if(node.value < value){
			checkLeft(node, value);
		}
	}

	void add(int value){
		check(this, value);
	}

	void traverse(String direction, Node node){
		if(node == null) return;
		System.out.println(direction + ": " + node.value);
		traverse("LEFT", node.left);
		traverse("RIGHT", node.right);

	}

	void showTree(){
		traverse("ROOT", this);
	}

}
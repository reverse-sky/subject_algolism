package week3;

public class BinaryTree {
	public TreeNode root = new TreeNode();// root생성

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(Object data) {// 매개변수를 하나만 줄 때 자식노드를 null값으로 만들어 주는 생성자
		BinaryTree empty = new BinaryTree();// BinaryTree()에 의해 root에 null값이 들어간다.
		this.root.setItem(data);// 입력받은 하나의 매개변수를 입력
		this.root.setLeft(empty.root);// root의 왼쪽에 data가 left인 subtreet삽입
		this.root.setRight(empty.root);// root의 오른쪽에 data가 right인 subtree삽입
	}

	public BinaryTree(BinaryTree left, Object item, BinaryTree right) {// 매개변수를 3개 받을 때의 생성자
		this.root.setItem(item);// treenode의 set설정자사용
		this.root.setLeft(left.root);// root의 왼쪽에 data가 left인 subtreet삽입
		this.root.setRight(right.root);// root의 오른쪽에 data가 right인 subtree삽입
	}

	public boolean isEmpty() {// 비어있으면 true를 반환하는 메소드
		if (this.root == null) {
			return true;
		} else
			return false;
	}

	public Object rootData() {// root의 data를 반환하는 메소드
		if (this.isEmpty()) {
			System.out.println("Tree is Empty!!!");
			return null;// 비어있으면 null값을 반환
		} else
			return root.getItem();// 아니라면 root의 data를 반환
	}

	public BinaryTree leftSubTree() {// root트리의 lefsubTree를 생성
		if (this.root.getLeft() == null) {
			return null;
		} else {// root의 왼쪽이 비어있지 않다면
			BinaryTree left = new BinaryTree();// 메소드 타입이 BibalyTree이기 때문에 left라는 객체 생성
			left.root = this.root.getLeft();// left객체의 노드 안에 root의 값을 입력해서
			return left;// 반환
			// 메소드 반환타입이 BinaryTree라 반환하는 작업이 필요한 것
		}
	}

	public BinaryTree rightSubTree() {
		if (this.root.getRight() == null) {
			return null;
		} else {
			BinaryTree right = new BinaryTree();// 메소드 타입이 BibalyTree이기 때문에 right라는 객체 생성
			right.root = this.root.getRight();// right객체의 노드 안에 root의 값을 입력해서
			return right;// 반환
			// 메소드 반환타입이 BinaryTree라 반환하는 작업이 필요한 것
		}
	}

	public void show() {// 이산트리의 값을 보여주는 메소드
		BinaryTree right = this.rightSubTree();// 이 트리의 right의 data를 가져옴
		BinaryTree left = this.leftSubTree();// 이 트리의 left의 data를 가져옴

		System.out.println("root item : " + this.rootData());
		System.out.println("left item : " + left.root.getItem());
		System.out.println("right item : " + right.root.getItem());
	}

	// pre-order (전위)root - left -right
	public void preOrder_recursion() {
		preOrder_recursion_methods(this.root);// root의 전위 순회 시작
	}

	public void preOrder_recursion_methods(TreeNode T) {// 입력받은 Treenode T에 대해서
		if (T != null) {// T가 비어있는 게 아니라면
			System.out.print(T.getItem() + " "); // T의 data를 출력하고, 밑의 문장으로 간다.
			preOrder_recursion_methods(T.getLeft());// T의 왼쪽으로 재귀함수를 시작해서 T.getLeft()가 null값일 때 까지 반복한다.
			preOrder_recursion_methods(T.getRight());// T의 왼쪽이 재귀가 끝났을 때 이 문장이 실행된다. 똑같이 null값이 나오면 메소드가 종료되고
			// preOrder_recursion_methods종료
		}

	}

	// 중위 left root right
	public void inOrder_recursion() {
		inOrder_recursion_methods(this.root);
	}

	public void inOrder_recursion_methods(TreeNode T) {
		if (T != null) {
			inOrder_recursion_methods(T.getLeft());// 이번엔 왼쪽의 함수부터 재귀 시작 null값이 나오기 전까지 계속해서 재귀한다.
			System.out.print(T.getItem() + " ");// 왼쪽으로 계속 가는 재귀가 끝나면 출력
			inOrder_recursion_methods(T.getRight());// 오른쪽으로 재귀하는 함수

		}
	}

	// 후위 left right root
	public void postOrder_recursion() {
		postOrder_recursion_methods(this.root);
	}

	public void postOrder_recursion_methods(TreeNode T) {
		if (T != null) {
			postOrder_recursion_methods(T.getLeft());// 재귀가 끝나면 밑에 문장으로 시작
			postOrder_recursion_methods(T.getRight());
			System.out.print(T.getItem() + " ");
		}
	}

	// 복사하는 메소드
	public BinaryTree copy() {
		BinaryTree newTree = new BinaryTree();// 반환 타입이 BinaryTree타입이기에 빈 BinaryTree생성
		newTree.root = theCopy(root);// 새로 생성한 BT에 root는 theCopy()로 초기화
		return newTree;// 복사 완료한 값을 반환
	}

	public TreeNode theCopy(TreeNode t) {
		if (t == null)
			return null;// t가 비어있으면 null값을 반환
		else {
			TreeNode left = theCopy(t.getLeft());// left에 끝까지 재귀하고, 값을 left에 복사
			TreeNode right = theCopy(t.getRight());// 위의 문장이 끝나면 실행, left처럼 right서브트리의 끝까지 재귀하고 right에 값을 복사

			TreeNode newNode = new TreeNode(left, t.getItem(), right);// 새로운 newNode에 복사한 값 left,right 그리고 입력받은 t를 복사
			return newNode;// 복사한 TreeNode를 반환

		}
	}

	public boolean equals(BinaryTree tr) {// 입력받은 BinaryTree가 같은지를 판단하는 메소드
		return theEqual(this.root, tr.root);//현재의 root와 입력받은, 즉 비교하려는 tr의 root를 비교
	}

	private boolean theEqual(TreeNode s, TreeNode t) {
		if (s == null && t == null) {
			return true; // 둘다 null값이니 true
		} else if (s != null && t != null) {// 둘다 널값이 아닐경우
			if (s.getItem().equals(t.getItem())) {//만약 입력받은 root s와 r가 같을경우
				if (theEqual(s.getLeft() , t.getLeft())) //왼쪽을 비교해서 같을경우
					if (theEqual(s.getRight(), t.getRight())) {//오른쪽도 비교해서 같으면 
						return true;//완전히 같은 것 이므로 true값을 반환한다
					} else
						return false;
				else
					return false;

			} else//만약 입력받은 root s와 r가 같지 않으므로 false반환
				return false;
		} else {//둘중 하나만 null값인 경우 이므로 같지 않다.
			return false;
		}
	}

}

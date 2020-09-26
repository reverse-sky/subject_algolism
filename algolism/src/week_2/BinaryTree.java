package week_2;

public class BinaryTree {
	public TreeNode root = new TreeNode();//root생성

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(BinaryTree left, Object item, BinaryTree right) {
		this.root.setItem(item);//treenode의 set설정자사용
		this.root.setLeft(left.root);//root의 왼쪽에 data가 left인 subtreet삽입
		this.root.setRight(right.root);//root의 오른쪽에 data가 right인 subtree삽입 
	}

	public boolean isEmpty() {//비어있으면 true를 반환하는 메소드
		if (this.root == null) {
			return true;
		} else
			return false;
	}

	public Object rootData() {//root의 data를 반환하는 메소드
		if (this.isEmpty()) {
			System.out.println("Tree is Empty!!!");
			return null;//비어있으면 null값을 반환
		} else
			return root.getItem();//아니라면 root의 data를 반환
	}

	public BinaryTree leftSubTree() {//root트리의 lefsubTree를 생성
		if (this.root.getLeft() == null) {
			return null;
		} else {//root의 왼쪽이 비어있지 않다면
			BinaryTree left = new BinaryTree();//메소드 타입이 BibalyTree이기 때문에 left라는 객체 생성
			left.root = this.root.getLeft();//left객체의 노드 안에 root의 값을 입력해서
			return left;//반환
			//메소드 반환타입이 BinaryTree라 반환하는 작업이 필요한 것
		}
	}

	public BinaryTree rightSubTree() {
		if (this.root.getRight() == null) {
			return null;
		} else {
			BinaryTree right = new BinaryTree();//메소드 타입이 BibalyTree이기 때문에 right라는 객체 생성
			right.root = this.root.getRight();//right객체의 노드 안에 root의 값을 입력해서
			return right;//반환
			//메소드 반환타입이 BinaryTree라 반환하는 작업이 필요한 것
		}
	}
	
	

	public void show() {//이산트리의 값을 보여주는 메소드
		BinaryTree right = this.rightSubTree();//이 트리의 right의 data를 가져옴
		BinaryTree left = this.leftSubTree();//이 트리의 left의 data를 가져옴

		System.out.println("root item : " + this.rootData());
		System.out.println("left item : " + left.root.getItem());
		System.out.println("right item : " + right.root.getItem());
	}
}

package week3;

public class BinaryTree {
	public TreeNode root = new TreeNode();// root����

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(Object data) {// �Ű������� �ϳ��� �� �� �ڽĳ�带 null������ ����� �ִ� ������
		BinaryTree empty = new BinaryTree();// BinaryTree()�� ���� root�� null���� ����.
		this.root.setItem(data);// �Է¹��� �ϳ��� �Ű������� �Է�
		this.root.setLeft(empty.root);// root�� ���ʿ� data�� left�� subtreet����
		this.root.setRight(empty.root);// root�� �����ʿ� data�� right�� subtree����
	}

	public BinaryTree(BinaryTree left, Object item, BinaryTree right) {// �Ű������� 3�� ���� ���� ������
		this.root.setItem(item);// treenode�� set�����ڻ��
		this.root.setLeft(left.root);// root�� ���ʿ� data�� left�� subtreet����
		this.root.setRight(right.root);// root�� �����ʿ� data�� right�� subtree����
	}

	public boolean isEmpty() {// ��������� true�� ��ȯ�ϴ� �޼ҵ�
		if (this.root == null) {
			return true;
		} else
			return false;
	}

	public Object rootData() {// root�� data�� ��ȯ�ϴ� �޼ҵ�
		if (this.isEmpty()) {
			System.out.println("Tree is Empty!!!");
			return null;// ��������� null���� ��ȯ
		} else
			return root.getItem();// �ƴ϶�� root�� data�� ��ȯ
	}

	public BinaryTree leftSubTree() {// rootƮ���� lefsubTree�� ����
		if (this.root.getLeft() == null) {
			return null;
		} else {// root�� ������ ������� �ʴٸ�
			BinaryTree left = new BinaryTree();// �޼ҵ� Ÿ���� BibalyTree�̱� ������ left��� ��ü ����
			left.root = this.root.getLeft();// left��ü�� ��� �ȿ� root�� ���� �Է��ؼ�
			return left;// ��ȯ
			// �޼ҵ� ��ȯŸ���� BinaryTree�� ��ȯ�ϴ� �۾��� �ʿ��� ��
		}
	}

	public BinaryTree rightSubTree() {
		if (this.root.getRight() == null) {
			return null;
		} else {
			BinaryTree right = new BinaryTree();// �޼ҵ� Ÿ���� BibalyTree�̱� ������ right��� ��ü ����
			right.root = this.root.getRight();// right��ü�� ��� �ȿ� root�� ���� �Է��ؼ�
			return right;// ��ȯ
			// �޼ҵ� ��ȯŸ���� BinaryTree�� ��ȯ�ϴ� �۾��� �ʿ��� ��
		}
	}

	public void show() {// �̻�Ʈ���� ���� �����ִ� �޼ҵ�
		BinaryTree right = this.rightSubTree();// �� Ʈ���� right�� data�� ������
		BinaryTree left = this.leftSubTree();// �� Ʈ���� left�� data�� ������

		System.out.println("root item : " + this.rootData());
		System.out.println("left item : " + left.root.getItem());
		System.out.println("right item : " + right.root.getItem());
	}

	// pre-order (����)root - left -right
	public void preOrder_recursion() {
		preOrder_recursion_methods(this.root);// root�� ���� ��ȸ ����
	}

	public void preOrder_recursion_methods(TreeNode T) {// �Է¹��� Treenode T�� ���ؼ�
		if (T != null) {// T�� ����ִ� �� �ƴ϶��
			System.out.print(T.getItem() + " "); // T�� data�� ����ϰ�, ���� �������� ����.
			preOrder_recursion_methods(T.getLeft());// T�� �������� ����Լ��� �����ؼ� T.getLeft()�� null���� �� ���� �ݺ��Ѵ�.
			preOrder_recursion_methods(T.getRight());// T�� ������ ��Ͱ� ������ �� �� ������ ����ȴ�. �Ȱ��� null���� ������ �޼ҵ尡 ����ǰ�
			// preOrder_recursion_methods����
		}

	}

	// ���� left root right
	public void inOrder_recursion() {
		inOrder_recursion_methods(this.root);
	}

	public void inOrder_recursion_methods(TreeNode T) {
		if (T != null) {
			inOrder_recursion_methods(T.getLeft());// �̹��� ������ �Լ����� ��� ���� null���� ������ ������ ����ؼ� ����Ѵ�.
			System.out.print(T.getItem() + " ");// �������� ��� ���� ��Ͱ� ������ ���
			inOrder_recursion_methods(T.getRight());// ���������� ����ϴ� �Լ�

		}
	}

	// ���� left right root
	public void postOrder_recursion() {
		postOrder_recursion_methods(this.root);
	}

	public void postOrder_recursion_methods(TreeNode T) {
		if (T != null) {
			postOrder_recursion_methods(T.getLeft());// ��Ͱ� ������ �ؿ� �������� ����
			postOrder_recursion_methods(T.getRight());
			System.out.print(T.getItem() + " ");
		}
	}

	// �����ϴ� �޼ҵ�
	public BinaryTree copy() {
		BinaryTree newTree = new BinaryTree();// ��ȯ Ÿ���� BinaryTreeŸ���̱⿡ �� BinaryTree����
		newTree.root = theCopy(root);// ���� ������ BT�� root�� theCopy()�� �ʱ�ȭ
		return newTree;// ���� �Ϸ��� ���� ��ȯ
	}

	public TreeNode theCopy(TreeNode t) {
		if (t == null)
			return null;// t�� ��������� null���� ��ȯ
		else {
			TreeNode left = theCopy(t.getLeft());// left�� ������ ����ϰ�, ���� left�� ����
			TreeNode right = theCopy(t.getRight());// ���� ������ ������ ����, leftó�� right����Ʈ���� ������ ����ϰ� right�� ���� ����

			TreeNode newNode = new TreeNode(left, t.getItem(), right);// ���ο� newNode�� ������ �� left,right �׸��� �Է¹��� t�� ����
			return newNode;// ������ TreeNode�� ��ȯ

		}
	}

	public boolean equals(BinaryTree tr) {// �Է¹��� BinaryTree�� �������� �Ǵ��ϴ� �޼ҵ�
		return theEqual(this.root, tr.root);//������ root�� �Է¹���, �� ���Ϸ��� tr�� root�� ��
	}

	private boolean theEqual(TreeNode s, TreeNode t) {
		if (s == null && t == null) {
			return true; // �Ѵ� null���̴� true
		} else if (s != null && t != null) {// �Ѵ� �ΰ��� �ƴҰ��
			if (s.getItem().equals(t.getItem())) {//���� �Է¹��� root s�� r�� �������
				if (theEqual(s.getLeft() , t.getLeft())) //������ ���ؼ� �������
					if (theEqual(s.getRight(), t.getRight())) {//�����ʵ� ���ؼ� ������ 
						return true;//������ ���� �� �̹Ƿ� true���� ��ȯ�Ѵ�
					} else
						return false;
				else
					return false;

			} else//���� �Է¹��� root s�� r�� ���� �����Ƿ� false��ȯ
				return false;
		} else {//���� �ϳ��� null���� ��� �̹Ƿ� ���� �ʴ�.
			return false;
		}
	}

}

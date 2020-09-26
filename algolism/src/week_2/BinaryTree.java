package week_2;

public class BinaryTree {
	public TreeNode root = new TreeNode();//root����

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(BinaryTree left, Object item, BinaryTree right) {
		this.root.setItem(item);//treenode�� set�����ڻ��
		this.root.setLeft(left.root);//root�� ���ʿ� data�� left�� subtreet����
		this.root.setRight(right.root);//root�� �����ʿ� data�� right�� subtree���� 
	}

	public boolean isEmpty() {//��������� true�� ��ȯ�ϴ� �޼ҵ�
		if (this.root == null) {
			return true;
		} else
			return false;
	}

	public Object rootData() {//root�� data�� ��ȯ�ϴ� �޼ҵ�
		if (this.isEmpty()) {
			System.out.println("Tree is Empty!!!");
			return null;//��������� null���� ��ȯ
		} else
			return root.getItem();//�ƴ϶�� root�� data�� ��ȯ
	}

	public BinaryTree leftSubTree() {//rootƮ���� lefsubTree�� ����
		if (this.root.getLeft() == null) {
			return null;
		} else {//root�� ������ ������� �ʴٸ�
			BinaryTree left = new BinaryTree();//�޼ҵ� Ÿ���� BibalyTree�̱� ������ left��� ��ü ����
			left.root = this.root.getLeft();//left��ü�� ��� �ȿ� root�� ���� �Է��ؼ�
			return left;//��ȯ
			//�޼ҵ� ��ȯŸ���� BinaryTree�� ��ȯ�ϴ� �۾��� �ʿ��� ��
		}
	}

	public BinaryTree rightSubTree() {
		if (this.root.getRight() == null) {
			return null;
		} else {
			BinaryTree right = new BinaryTree();//�޼ҵ� Ÿ���� BibalyTree�̱� ������ right��� ��ü ����
			right.root = this.root.getRight();//right��ü�� ��� �ȿ� root�� ���� �Է��ؼ�
			return right;//��ȯ
			//�޼ҵ� ��ȯŸ���� BinaryTree�� ��ȯ�ϴ� �۾��� �ʿ��� ��
		}
	}
	
	

	public void show() {//�̻�Ʈ���� ���� �����ִ� �޼ҵ�
		BinaryTree right = this.rightSubTree();//�� Ʈ���� right�� data�� ������
		BinaryTree left = this.leftSubTree();//�� Ʈ���� left�� data�� ������

		System.out.println("root item : " + this.rootData());
		System.out.println("left item : " + left.root.getItem());
		System.out.println("right item : " + right.root.getItem());
	}
}

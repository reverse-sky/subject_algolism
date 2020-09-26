package week3;

public class TreeNode {
	private Object item;
	private TreeNode left;//�̻�Ʈ���� ����
	private TreeNode right;//������ �̻�Ʈ��

	public TreeNode() {//��� ������
		this.item = null;
		this.left = null;
		this.right = null;

	}

	public TreeNode(Object item) {//node�����ϸ� �Է¹��� item���� root�ʱ�ȭ
		this.item = item;
		this.left = null;
		this.right = null;

	}

	public TreeNode(TreeNode left, Object item, TreeNode right) {//�Է¹��� ������ ����,root ������ �ʱ�ȭ
		this.item = item;
		this.left = left;
		this.right = right;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;

	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}

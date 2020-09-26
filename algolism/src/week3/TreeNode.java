package week3;

public class TreeNode {
	private Object item;
	private TreeNode left;//이산트리의 왼쪽
	private TreeNode right;//오른쪽 이산트리

	public TreeNode() {//노드 생성자
		this.item = null;
		this.left = null;
		this.right = null;

	}

	public TreeNode(Object item) {//node생성하면 입력받은 item으로 root초기화
		this.item = item;
		this.left = null;
		this.right = null;

	}

	public TreeNode(TreeNode left, Object item, TreeNode right) {//입력받은 값으로 왼쪽,root 오른쪽 초기화
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

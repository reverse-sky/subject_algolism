package week_2;

public class BinaryTreeTest {
	public static void main(String args[]) {
		BinaryTree root;
		BinaryTree LeftTemp;
		BinaryTree RightTemp;

		BinaryTree LeftSubroot;
		BinaryTree RightSubroot;

		BinaryTree empty = new BinaryTree();//temp�� null������

		LeftTemp = new BinaryTree(empty,'A',empty);//data�� A�� �Է� �ڽ� ���� ����ִ� ���Է�
		RightTemp = new BinaryTree(empty, 'B',empty);//data�� B�� �Է� �ڽ� ���� ����ִ� ��
 		
		LeftSubroot = new BinaryTree(LeftTemp , '+' ,RightTemp);
		
		LeftTemp = new BinaryTree(empty, 'C',empty);//C�� �Է� �ڽ� ���� ����ִ� ��
		RightTemp = new BinaryTree(empty, 'D',empty);//D�� �Է� �ڽ� ���� ����ִ� ��
		
		RightSubroot = new BinaryTree(LeftTemp , '/' ,RightTemp);
		
		root = new BinaryTree(LeftSubroot , '*', RightSubroot);//root ���� �ڽĳ�带 ����
		System.out.println("=====root=====");
		root.show();
		
		System.out.println("=====root's right subTree=====");
		root.rightSubTree().show();
		System.out.println("=====root's right subTree=====");
		root.leftSubTree().show();
	}
}

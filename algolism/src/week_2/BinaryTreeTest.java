package week_2;

public class BinaryTreeTest {
	public static void main(String args[]) {
		BinaryTree root;
		BinaryTree LeftTemp;
		BinaryTree RightTemp;

		BinaryTree LeftSubroot;
		BinaryTree RightSubroot;

		BinaryTree empty = new BinaryTree();//temp에 null노드생성

		LeftTemp = new BinaryTree(empty,'A',empty);//data로 A를 입력 자식 노드는 비어있는 값입력
		RightTemp = new BinaryTree(empty, 'B',empty);//data로 B를 입력 자식 노드는 비어있는 값
 		
		LeftSubroot = new BinaryTree(LeftTemp , '+' ,RightTemp);
		
		LeftTemp = new BinaryTree(empty, 'C',empty);//C를 입력 자식 노드는 비어있는 값
		RightTemp = new BinaryTree(empty, 'D',empty);//D를 입력 자식 노드는 비어있는 값
		
		RightSubroot = new BinaryTree(LeftTemp , '/' ,RightTemp);
		
		root = new BinaryTree(LeftSubroot , '*', RightSubroot);//root 노드와 자식노드를 연결
		System.out.println("=====root=====");
		root.show();
		
		System.out.println("=====root's right subTree=====");
		root.rightSubTree().show();
		System.out.println("=====root's right subTree=====");
		root.leftSubTree().show();
	}
}

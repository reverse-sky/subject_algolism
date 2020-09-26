package week_4;

public class BinarySearchTree {
	private TreeNode rootNode;
	
	
	public void BSTinsert(Object k)//입력받은 K를 삽입하는 메소드
	{
		TreeNode p = rootNode;
		TreeNode q = p;//부모노드 역활을 할 것
		
		while(p != null)//p가 null값이 아닐 때 까지 반복한다.
		{
			if(k instanceof String)//k가 string인 경우
			{
				if(objectCompareToString(p,k)==0) {// 입력 받은 k가 이미 존재할 경우
				}
					
			}
			else if(k instanceof Integer)
			{
				// 해당 제어문을 완성하시오 . 				
			}
			else
			{
				System.out.println("해당 자료형에 대한 처리를 추가하지 않았습니다.");
				return;
			}
		}
		TreeNode newNode = new TreeNode(k);;
		if(rootNode == null)
			rootNode = newNode;
		else
		{
			if(k instanceof String)
			{
				 				
			}
			else if(k instanceof Integer)
			{
				// 해당 제어문을 완성하시오 . 
			}
			else
			{
				System.out.println("해당 자료형에 대한 처리를 추가하지 않았습니다.");
				return;
			}
		}
	}
	
	public TreeNode BSTsearch(Object k)//입력받은 k를 검색하는 메소드
	{//재귀로 짜면 public TreeNode BSTsearch(TreeNode t , Object k) 
		TreeNode t = rootNode;
		while(t != null)
		{
			if(k instanceof String)//k가 string 형태일 때
			{
				if(objectCompareToString(t.getKey(), k)==0){//찾음
					return t;//찾는 Tree노드를 반환
				}
				else if(objectCompareToString(t.getKey(), k)<0) {
					t= t.getLeft();//비교한 t가 k보다 작을 경우
					//재귀로 짜서 while이 없다면 BSTsearch(t.getLeft() , k); 로 짜면 되겠다.
				}
				else
					t = t.getRight();				
			}
			else if(k instanceof Integer)
			{
				if(objectCompareToInteger(t.getKey(), k)==0){//찾음
					return t;
				}
				else if(objectCompareToInteger(t.getKey(), k) <0) {
					t= t.getLeft();
				}
				else
					t = t.getRight();				
			}
			else
			{
				System.out.println("해당 자료형에 대한 처리를 추가하지 않았습니다.");
				return null;
			}
		}
		return null;//찾는 값이 없으면 null값.
	}


	private TreeNode maxNode(TreeNode root)//TreeNode의 최대값을 찾는 함수.
	{
		TreeNode p = root; //최대값이니까 큰 쪽을 찾아야함으로 오른쪽으로 순회한다.
		if(p.getRight() == null)//p의 오른쪽이 비어있다면 p가 제일 큰 값이므로
			 return p;
		else// p가 null값이 아니라면 p보다 더 큰 수가 있을 수 있다는 뜻이므로 오른쪽으로 순회를 반복한다.
			return maxNode(p.getRight());//p가 null값이 나올 때 까지 계속해서 재귀를 하게끔 한다.
	}
	
	private TreeNode delete(TreeNode root, Object k)//TreeNode를 삭제하는 메소드
	{
		TreeNode p = root;
		TreeNode q = p;
		while(p != null)
		{
			if(k instanceof String)
			{
				// 해당 제어문을 완성하시오 . 				
					
			}
			else if(k instanceof Integer)
			{
				// 해당 제어문을 완성하시오 . 				
			}
			else
			{
				System.out.println("해당 자료형에 대한 처리를 추가하지 않았습니다.");
				return null;
			}
		}
		
		if(p == null) // 아무것도 할 수 없는 경우
		{
				// 해당 제어문을 완성하시오 . 
		}
		if((p.getLeft() == null) && (p.getRight() == null))
		{
				// 해당 제어문을 완성하시오 . 			
		}
		else if((p.getLeft() == null )|| (p.getRight() == null))
		{
				// 해당 제어문을 완성하시오 . 			
		}
		else
		{
				// 해당 제어문을 완성하시오 . 			
		}
		return root;
	}
	
	public void BSTdelete(Object k)//입력받은 노드를 지움
	{
		rootNode = delete(rootNode,k);
	}
	
	private void printNode(TreeNode n)
	{
		if(n != null)
		{
			System.out.print("(");
			printNode(n.getLeft());
			System.out.print(" " + n.getKey() + " ");
			printNode(n.getRight());
			System.out.print(")");
		}
	}
	
	public void print()
	{
		printNode(rootNode);
		System.out.println();
	}
	
	private int objectCompareToString(Object s1, Object s2) // Object의 변수 형태가 String인 경우
	{
		return ((String) s1).compareTo((String) s2);//s1과 s2의 자료형을 비교해서 s1이 
	
		// 해당 제어문을 완성하시오 . 		
	}
	
	private int objectCompareToInteger(Object s1, Object s2) // Objecd의 변수 형태가 int인 경우
	{
		return ((Integer)s1).compareTo((Integer)s2);
		//s1 과 s2가 같으면 0을 s1>s2 면 양수를 반환 s1< s2 면 -1을 반환
		
		// 해당 제어문을 완성하시오 . 				
	}
}

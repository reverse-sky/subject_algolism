package week_4;

public class BinarySearchTree {
	private TreeNode rootNode;
	
	
	public void BSTinsert(Object k)//�Է¹��� K�� �����ϴ� �޼ҵ�
	{
		TreeNode p = rootNode;
		TreeNode q = p;//�θ��� ��Ȱ�� �� ��
		
		while(p != null)//p�� null���� �ƴ� �� ���� �ݺ��Ѵ�.
		{
			if(k instanceof String)//k�� string�� ���
			{
				if(objectCompareToString(p,k)==0) {// �Է� ���� k�� �̹� ������ ���
				}
					
			}
			else if(k instanceof Integer)
			{
				// �ش� ����� �ϼ��Ͻÿ� . 				
			}
			else
			{
				System.out.println("�ش� �ڷ����� ���� ó���� �߰����� �ʾҽ��ϴ�.");
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
				// �ش� ����� �ϼ��Ͻÿ� . 
			}
			else
			{
				System.out.println("�ش� �ڷ����� ���� ó���� �߰����� �ʾҽ��ϴ�.");
				return;
			}
		}
	}
	
	public TreeNode BSTsearch(Object k)//�Է¹��� k�� �˻��ϴ� �޼ҵ�
	{//��ͷ� ¥�� public TreeNode BSTsearch(TreeNode t , Object k) 
		TreeNode t = rootNode;
		while(t != null)
		{
			if(k instanceof String)//k�� string ������ ��
			{
				if(objectCompareToString(t.getKey(), k)==0){//ã��
					return t;//ã�� Tree��带 ��ȯ
				}
				else if(objectCompareToString(t.getKey(), k)<0) {
					t= t.getLeft();//���� t�� k���� ���� ���
					//��ͷ� ¥�� while�� ���ٸ� BSTsearch(t.getLeft() , k); �� ¥�� �ǰڴ�.
				}
				else
					t = t.getRight();				
			}
			else if(k instanceof Integer)
			{
				if(objectCompareToInteger(t.getKey(), k)==0){//ã��
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
				System.out.println("�ش� �ڷ����� ���� ó���� �߰����� �ʾҽ��ϴ�.");
				return null;
			}
		}
		return null;//ã�� ���� ������ null��.
	}


	private TreeNode maxNode(TreeNode root)//TreeNode�� �ִ밪�� ã�� �Լ�.
	{
		TreeNode p = root; //�ִ밪�̴ϱ� ū ���� ã�ƾ������� ���������� ��ȸ�Ѵ�.
		if(p.getRight() == null)//p�� �������� ����ִٸ� p�� ���� ū ���̹Ƿ�
			 return p;
		else// p�� null���� �ƴ϶�� p���� �� ū ���� ���� �� �ִٴ� ���̹Ƿ� ���������� ��ȸ�� �ݺ��Ѵ�.
			return maxNode(p.getRight());//p�� null���� ���� �� ���� ����ؼ� ��͸� �ϰԲ� �Ѵ�.
	}
	
	private TreeNode delete(TreeNode root, Object k)//TreeNode�� �����ϴ� �޼ҵ�
	{
		TreeNode p = root;
		TreeNode q = p;
		while(p != null)
		{
			if(k instanceof String)
			{
				// �ش� ����� �ϼ��Ͻÿ� . 				
					
			}
			else if(k instanceof Integer)
			{
				// �ش� ����� �ϼ��Ͻÿ� . 				
			}
			else
			{
				System.out.println("�ش� �ڷ����� ���� ó���� �߰����� �ʾҽ��ϴ�.");
				return null;
			}
		}
		
		if(p == null) // �ƹ��͵� �� �� ���� ���
		{
				// �ش� ����� �ϼ��Ͻÿ� . 
		}
		if((p.getLeft() == null) && (p.getRight() == null))
		{
				// �ش� ����� �ϼ��Ͻÿ� . 			
		}
		else if((p.getLeft() == null )|| (p.getRight() == null))
		{
				// �ش� ����� �ϼ��Ͻÿ� . 			
		}
		else
		{
				// �ش� ����� �ϼ��Ͻÿ� . 			
		}
		return root;
	}
	
	public void BSTdelete(Object k)//�Է¹��� ��带 ����
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
	
	private int objectCompareToString(Object s1, Object s2) // Object�� ���� ���°� String�� ���
	{
		return ((String) s1).compareTo((String) s2);//s1�� s2�� �ڷ����� ���ؼ� s1�� 
	
		// �ش� ����� �ϼ��Ͻÿ� . 		
	}
	
	private int objectCompareToInteger(Object s1, Object s2) // Objecd�� ���� ���°� int�� ���
	{
		return ((Integer)s1).compareTo((Integer)s2);
		//s1 �� s2�� ������ 0�� s1>s2 �� ����� ��ȯ s1< s2 �� -1�� ��ȯ
		
		// �ش� ����� �ϼ��Ͻÿ� . 				
	}
}

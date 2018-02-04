package trees;

public class BinaryTree 
{
	Node root;
//	public BinaryTree(int p)
	// {
		//root=new Node(p);
	//}
	public BinaryTree()                             //no node will b created
	{
		root=null;
	}
	public static  void printInorder(Node node){
		if(node==null)
		{
			return;
		}
		printInorder(node.left);
		System.out.println(node.value);
		printInorder(node.right);
	}
		
	public static void main(String[] args) 
	{
			BinaryTree bt=new BinaryTree();                     //default constructor
			bt.root=new Node(13);
			bt.root.left=new Node(2);
			bt.root.right=new Node(1);
			bt.root.left.left=new Node(4);
			bt.root.left.right=new Node(5);
			bt.root.right.right=new Node(3);
			//System.out.println(bt.root.left.left.value);
			printInorder(bt.root);
		//	System.out.println(bt.root.left.right.value);
			
	
}

}

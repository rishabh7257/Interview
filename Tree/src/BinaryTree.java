class node{
	
	int key;
	String value;
	node leftchild;
	node rightchild;
	
	
	public node(int key, String value){
		
		this.key = key;
		this.value = value;	
		
		}
	
	
	}


public class BinaryTree {

	node root;
	
	public void addnode(int key, String value){
		
		node newnode = new node(key,value);
		
		if (root == null){
			
			root = newnode;
			System.out.println("Root added");
		}else {
			
			node tempnode = root;
			node parent;
			while(true){
				parent=tempnode;

				if(key < tempnode.key){
					tempnode=tempnode.leftchild;
					
					if(tempnode==null){
						
						parent.leftchild=newnode;
						System.out.println("left added");
						return;
					}
					}else{
						
						tempnode=tempnode.rightchild;
						if(tempnode==null){
							parent.rightchild=newnode;
							System.out.println("Right added");
							return;

							
						
					}
					
				}
				
				
			}
			
			
		}
		
	}

	
	public void inOrderNodeTraversing(node tempnode){
		
		if(tempnode !=null){
			
			inOrderNodeTraversing(tempnode.leftchild);
			System.out.println("The key is "+tempnode.key +" with string "+tempnode.value);
			//System.out.println(tempnode);
			//System.out.println("Hello");
			inOrderNodeTraversing(tempnode.rightchild);
			
		}

	}
public void preOrderNodeTraversing(node tempnode){
		
		if(tempnode !=null){
			
			preOrderNodeTraversing(tempnode.leftchild);
			//System.out.println(tempnode);
			//System.out.println("Hello");
			preOrderNodeTraversing(tempnode.rightchild);
			System.out.println("The key is "+tempnode.key +" with string "+tempnode.value);
			
			
		}

	}
public void postOrderNodeTraversing(node tempnode){
	
	if(tempnode !=null){
		System.out.println("The key is "+tempnode.key +" with string "+tempnode.value);
		
		postOrderNodeTraversing(tempnode.leftchild);
		postOrderNodeTraversing(tempnode.rightchild);
			
		
	}
}

public void findNode(int key){
	
	node tempnode = root;
		
		while(tempnode.key != key) {
			
			if(key < tempnode.key) {
				
				tempnode=tempnode.leftchild;
				
			}
			else {
				
				tempnode = tempnode.rightchild;
			}
			
			
		}
		
	
	if(tempnode == null) {
		System.out.println("The node did not exist");	
	}
	System.out.println("The key is "+tempnode.key +" with string "+tempnode.value);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree theTree = new BinaryTree();

        theTree.addnode(50, "Boss");

        theTree.addnode(25, "Vice President");

        theTree.addnode(15, "Office Manager");

        theTree.addnode(30, "Secretary");

        theTree.addnode(75, "Sales Manager");

        theTree.addnode(85, "Salesman 1");
        
        System.out.println("Hello Main here");
        
        theTree.inOrderNodeTraversing(theTree.root);
        
        theTree.findNode(25);

	}

}

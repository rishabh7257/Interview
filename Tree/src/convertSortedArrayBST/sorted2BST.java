package convertSortedArrayBST;

public class sorted2BST {
	public sorted2BST() {
		// TODO Auto-generated constructor stub
		node root = null;

	}

	class node {

		node(int key, Object value) {
			this.key = key;
			this.left = null;
			this.right = null;
			this.value = value;
		}

		node left;
		node right;
		Object value;
		int key;
		node setleft;
		node setright;
	}

	node root = null;
	node prev = null;
	node head = null;
	node temp = null;
	node next = null;

	boolean insertElement (int key, Object value) {
		
		node newElement = new node(key, value);
		
		if(root==null) {
			root = newElement;
			return true;
		}
		else {
			node scanner = root;
			node parent = null;
			while(scanner!=null) {
				parent = scanner;
				if(key<scanner.key) {
					scanner = scanner.left;
				}
				else 
					scanner = scanner.right;
			}
			if(key<parent.key) {
				parent.left=newElement;
				return true;
				
			}
			else {
				parent.right=newElement;
				return true;
			}
					
			
		}
		
	}
	
	void treeTraverseInOrder (node scanner) {
		
		if(scanner == null) {
			//System.out.println("The tree is empty");
			return;
		}
		else {
			treeTraverseInOrder(scanner.left);
			System.out.println(scanner.key);
			treeTraverseInOrder(scanner.right);
				
		}
		
		
		
	}
	
	void findNode(node scanner, int key) {
		if(scanner == null) {
			return;
		}
		else if(scanner.key==key)  
			System.out.println(scanner.key +"found with value "+scanner.value);
			
		else if(key<scanner.key) 
			findNode(scanner.left,key);
			else 
				findNode(scanner.right,key);
			
	}
	
	void convertBinary2DoubleLinkedlist(node scanner) {
		
		if (scanner == null) 
			return;
		
		convertBinary2DoubleLinkedlist(scanner.left);
		
		if(head==null) {
			head = scanner;
			head.setleft=null;
		}
		else {
			scanner.setleft = prev;
			prev.setright=scanner;
		}
		prev = scanner;
		
		convertBinary2DoubleLinkedlist(scanner.right);
	}
	
	public void display() {
		if(head.value==null) {
			System.out.println("The list is empty");
			
		}
		else {
			temp = head;
			do{
				System.out.println("The element is "+temp.value);
				temp = temp.setright;
			}while(temp!=null);
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorted2BST bst = new sorted2BST();
		boolean a = bst.insertElement(50, "Rishabh");
		boolean b = bst.insertElement(40, "Swati");
		boolean c = bst.insertElement(60, "Sanghvi");
		boolean d = bst.insertElement(10, "Aadi");
		boolean e = bst.insertElement(45, "Prisha");
		boolean f = bst.insertElement(42, "Didi");
			
		bst.treeTraverseInOrder(bst.root);
		bst.findNode(bst.root, 42);
		bst.convertBinary2DoubleLinkedlist(bst.root);
		bst.display();
		
	}

}

package SingleSeriesQuestion;



public class Definition {

	public class node {
		
		Integer value;
		node next;
		
		node (Integer value, node next) {
			 
			 this.value = value;
			 this.next = next; 	
		 	}
		}
	
		node header = new node (null,null);
		node temp = new node (null,null);
		node child = new node (null,null);
		node parent = new node (null,null);
		

	
		Integer count = 0;
		
		public void search(Integer x) {
			// TODO Auto-generated method stub
			node temp = new node(null,null);
			temp = header;
			System.out.println("Value of count is "+count);
			while(temp.value!=x) {
				if(temp.next==null) {
					System.out.println("Value not found!!");
					break;
				}
				temp = temp.next;
			}
			if(temp.value == x)
				System.out.println("Value found Yay!!");
		}


		public void display() {
			// TODO Auto-generated method stub
			node temp = new node(null,null);
			temp = header;
			if(temp == null) {
				System.out.println("The list is empty");
			}
			
			do {
				System.out.println(""+temp.value);
				temp = temp.next;
			} while((temp)!= null); 
				
			
		}

		public void addLast(Integer x) {
			// TODO Auto-generated method stub
			node temp =new node(x,null);
			if(header.value==null) {
				node addnew = new node(x,null);
				header = addnew;
			}
			else {
			temp = header;
			while(temp.next!=null){
				temp = temp.next;
			}
			node addnew = new node(x,null);
			temp.next = addnew;
			count++;
			}
		}
		
		public void addBeforeZero() {
			Integer value = 0;
			if(header.value == null) {
				
				System.out.println("The list is empty");
			}
			else {
				child = header.next;
				parent = header;
				while(child.next!=null) {
					value = parent.value;
					while(child.value!= 0) {
						value = value + temp.value;
						child = child.next;
						parent = parent.next;
					}
					
					
					
				}
			}
		}
		
		public void delete(node child, node parent) {
			
		}
		
		
		
}


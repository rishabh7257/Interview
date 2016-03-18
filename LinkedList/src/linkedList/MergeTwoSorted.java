package linkedList;

public class MergeTwoSorted {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}

	}

	public static void main(String[] args) {
		
		MergeTwoSorted mergeTwoSorted = new MergeTwoSorted();
				
		mergeTwoSorted.prepareLinkedList();
		
	}
	
	public void prepareLinkedList() {
		
		ListNode l1 = new ListNode(5);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(4);
		ListNode result = mergeTwoLists(l1,l2);
		displayLinkedList(result);
	}

	public void displayLinkedList(ListNode l) {
		
		while(l != null) {
			
			System.out.println(" " + l.val);
			l = l.next;
		}
		
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = null;
		ListNode current = null;

		// if both null
		if (l1 == null && l2 == null) {
			return null;

		}

		// if one of them null
		if (l1 == null || l2 == null) {

			if (l1 == null) {
				return l2;
			} else {
				return l1;
			}
		}
		
		if (l3 == null){

			if (l1.val < l2.val){           

				l3 = new ListNode(l1.val);
				current =l3;
				l1 = l1.next;

			} else {

				l3 = new ListNode(l2.val);
				current =l3;
				l2 = l2.next;
			}
		}
		
		while(l1 != null && l2 != null) {

			if (l1.val < l2.val){           

				ListNode temp = new ListNode(l1.val);
				current.next = temp;
			//	l3 = l3.next;
				l1 = l1.next;

			} else {

				ListNode temp = new ListNode(l2.val);
				current.next = temp;
			//	l3 = l3.next;
				l2 = l2.next;
			}
		}

		if (l2 != null) {
		    
			current.next = l2;
		//	return l3;

		} else if (l1 != null) {

			current.next = l1;
		//	return l3;

		}
		return l3;
	}
	}

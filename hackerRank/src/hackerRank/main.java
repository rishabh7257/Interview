package hackerRank;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class main {
    
	static int totalNodes;
    class node {

		node(int key, int value) {
			this.key = key;
			this.value = value;
		}
		
		public void setAdjacent(List list) {
			this.adjacent = list;
		}
		
		public List getAdjacent() {
			return adjacent;
		}
		
		int value;
		int key;
		List<Integer> adjacent;
	}

	node root = null;

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int numberOfNodes = s.nextInt();
        totalNodes = numberOfNodes;
        HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<numberOfNodes; i++) {
        	int value = s.nextInt();
        	input.put(i, value);
        }
        
        HashMap<Integer, Integer> connect = new HashMap<Integer, Integer>();
        while(s.hasNext()) {
        	int m = s.nextInt();
        	int n = s.nextInt();
        	connect.put(m, n);
        }
          
        HashMap<Integer, Boolean> Notvisited = new HashMap<Integer, Boolean>();
        int maximumValue = input.get(0);
        int maximumKey = 0;
        
        for(int i = 1; i<numberOfNodes; i++) {
        	if(input.get(i) > maximumValue) {
        		maximumValue = input.get(i);
        		maximumKey = i;
        	}
        }
        
        if(Notvisited.get(maximumKey)) {
        	Notvisited.put(maximumKey, false);
        	
        }
        int key = findAdjacent(maximumKey);
        
    }

	public static int findAdjacent(int maximumKey) {
		int key = 0;
		for(int i = 0; i< totalNodes; i++) {
			
		}
		return key;
	}
}
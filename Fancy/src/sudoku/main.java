package sudoku;

import java.util.HashSet;

public class main {
	
	public static boolean checkeer (int[][] ary, int n) {
		
		HashSet<Integer> hsRow = new HashSet<Integer>();
		//HashSet<Integer> hsCol = new HashSet<Integer>();
		
		int rowSum = 0, colSum = 0;
		for(int i = 0;i<n;i++) {
			rowSum = 0;
			hsRow.clear();
			for(int j =0;j<n;j++) {
				
				rowSum = rowSum + ary[i][j];
				hsRow.add(ary[i][j]);
			}
			if((hsRow.size()!=n) && (rowSum!=45)) {
				return false;
				
			}
			for (i = 0; i < 9; i = i + 3) {
				int sum = 0;
		//		int temp = i;
				for (int j = i; j < i + 3; j++) {
					
					for (int k = i; k < i+3; k++) {
						sum += ary[j][k];
					}
		
				}
				System.out.println("i="+i+" \tSum="+sum);
				if (sum != 45) {
					return false;
				}

				i += 2;
			}
		}
		
		return true;
	}
	
	public static void main(String []args){
		int[][] sudoko1 ={ 
				{5,3,4,6,7,8,9,1,2},
                {6,5,2,1,9,7,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,7,9,5,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,7,3,5,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
                };
		boolean result = checkeer(sudoko1,9);
		
		System.out.print(result);
	}


}


public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,7},
				{4,-5},
				{-6,0}};
		
		int result = calculateNumberOfUniquePath(grid);
		System.out.println("The result of this program is " + result);
	}

	public static int calculateNumberOfUniquePath(int[][] grid) {
		
		System.out.println("The number of rows in the matrix " + grid.length);
		System.out.println("The number of coloumn in the matrix " + grid[0].length);
		
//		int col = grid[0].length + 2;
//		int row = grid.length + 2;
		int col = 5;
		int row = 6;
		
		int[][] dp = new int[row][col];
		dp[row-2][col-1] = 1;
		
		//Fill up the rest of table
		for (int c = col-2;c>=0;c--) {
			for (int r = row-2;r>=0;r--) {
				dp[r][c] = dp[r][c+1] + dp[r+1][c];
			}
		}
		return dp[1][1];
	}

}

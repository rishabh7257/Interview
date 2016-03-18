
public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = {{1,7},
				{4,-5},
				{-6,0}};
		
		int result = calculateMinimumPathSum(grid);
		System.out.println("The result of this program is " + result);
	}

	public static int calculateMinimumPathSum(int[][] grid) {
		
		System.out.println("The number of rows in the matrix " + grid.length);
		System.out.println("The number of coloumn in the matrix " + grid[0].length);
		
		int col = grid[0].length;
		int row = grid.length;
		
		int[][] dp = new int[row][col];
		
		dp[0][0] = grid[0][0];
		
		//Initialize first row
		for (int i = 1 ; i< col; i++) {
			dp[0][i] = dp[0][i-1] + grid[0][i];
		}
		
		//Initialize first coloum
		for (int j=1;j<row;j++) {
			dp[j][0] = dp[j-1][0] + grid[j][0];
		}
		
		//Fill up the table
		for (int c = 1; c < col; c++) {
			
			for (int r = 1; r < row; r++) {
				
				if (dp[r-1][c] + grid[r][c] < dp[r][c-1] + grid[r][c]) {
					dp[r][c] = dp[r-1][c] + grid[r][c];
				} else {
					dp[r][c] = dp[r][c-1] + grid[r][c];
				}
				 
			}
		}
		
		return dp[row-1][col-1];
	}
}

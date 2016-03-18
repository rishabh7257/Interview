import java.util.Scanner;

public class NQueen {
	
	static Scanner scan;
	static int N = 4;

	public static boolean isPlacable(int [][] board, int row, int col) {
		
		int r,c;
		
		for(r = 0; r < N; r++) {
			if (board[r][col] == 1) {
				return false;
			}
		}
		
		for (c = 0; c < N; c++) {
			if (board[row][c] == 1) {
				return false;
			}
		}
		
		for(r=row,c=col;r>=0&&c>=0;r--,c--) {
			if (board[r][c]==1) {
				return false;
			}
		}
		
		for (r=row,c=col;r<N&&c>=0;r++,c--) {
			if (board[r][c]==1) {
				return false;
			}
		}
		
		return true;
	}
	public static boolean theBoardSolver(int [][] board, int col) {
		if (col >= N)
			return true;
		for (int row = 0 ; row < N ; row++) {
			
			if (isPlacable(board, row, col)) {
				board[row][col] = 1;
					if (theBoardSolver(board, col+1)) {
						return true;
					} 
					board[row][col] = 0;
			}
		}
		return false;
	}
	
	static void printBoard(int board[][]) {
		int i;
		for (i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				if (board[i][j] == 1) {
					System.out.print("Q\t");
				} else {
					System.out.print("_\t");
				}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scan = new Scanner(System.in);
		System.out.println("State the value of N in this program!");
		N = scan.nextInt();
		int[][] board = new int[N][N];
		if (!theBoardSolver(board, 0)) {
			System.out.println("Solution not found.");
		}
		printBoard(board);
		
		
	}

}

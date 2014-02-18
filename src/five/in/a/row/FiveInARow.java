package five.in.a.row;

/**
 * Justify the five in row
 */
public class FiveInARow {

	public int find(int[][] board) {
		int length = board.length;
		int c = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (board[i][j] != 0) {
					if (j == 0 || board[i][j] == board[i][j-1]) {
						c++;
						if (c == 5) {
							return board[i][j];
						}
					} else {
						c = 1;
					}
				} else {
					c = 0;
				}
			}
		}
		
		c = 0;
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length; i++) {
				if (board[i][j] != 0) {
					if (i == 0 || board[i][j] == board[i-1][j]) {
						c++;
						if (c == 5) {
							return board[i][j];
						}
					} else {
						c = 1;
					}
				} else {
					c = 0;
				}
			}
		}
		
		c = 0;
		for (int i = length-1, j = 0; j < length; ) {
			for (int t = 0; i+t < length && j+t < length; t++) {
				if (board[i+t][j+t] != 0) {
					if (j+t == 0 || i+t == 0 || board[i+t][j+t] == board[i+t-1][j+t-1]) {
						c++;
						if (c == 5) {
							return board[i+t][j+t];
						}
					} else {
						c = 1;
					}
				} else {
					c = 0;
				}
			}
			if (i > 0) {
				i--;
			} else {
				j++;
			}
		}
		
		c = 0;
		for (int i = length-1, j = length-1; j >= 0; ) {
			for (int t = 0; i+t < length && j-t >= 0; t++) {
				if (board[i+t][j-t] != 0) {
					if (j-t == length-1 || i+t == 0 || board[i+t][j-t] == board[i+t-1][j-t+1]) {
						c++;
						if (c == 5) {
							return board[i+t][j-t];
						}
					} else {
						c = 1;
					}
				} else {
					c = 0;
				}
			}
			if (i > 0) {
				i--;
			} else {
				j--;
			}
		}
		
		return 0;
	}

}
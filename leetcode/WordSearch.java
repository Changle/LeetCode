public class WordSearch {

	public boolean exist(char[][] board, String word) {
		// Start typing your Java solution below
		// DO NOT write main() function

		int row = board.length;
		int column = board[0].length;

		boolean isVisited[][] = new boolean[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				wordSearch(row, column, i, j, board, isVisited, word, 0);
			}
		}

		return false;
	}

	public boolean wordSearch(int row, int column, int i, int j,
			char[][] board, boolean[][] isVisited, String word, int level) {
		
		if (word.length() == 0)
			return true;
		
		if (i < 0 || i >= row || j < 0 || j >= column)
			return false;
		
		if(isVisited[i][j] == true)
			return false;
		
		if(board[i][j] != word.charAt(level))
			return false;
		
		if(level == word.length() - 1)
			return true;
		
		isVisited[i][j] = true;
		
		if(i>0 && wordSearch(row,column, i-1,j, board,isVisited,word,level+1))
			return true;
		
		if(j>0 && wordSearch(row,column, i,j-1, board,isVisited,word,level+1))
			return true;
		
		if(i<row && wordSearch(row,column, i+1,j, board,isVisited,word,level+1))
			return true;
		
		if(j<column && wordSearch(row,column, i,j+1, board,isVisited,word,level+1))
			return true;
		
		isVisited[i][j] = false;
		
		return false;
		
		

	}

}

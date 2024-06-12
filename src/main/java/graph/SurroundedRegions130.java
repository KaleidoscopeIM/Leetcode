package graph;

public class SurroundedRegions130 {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'O', 'X'}};
        new SurroundedRegions130().solve(board);
        System.out.println();
    }

    public void solve(char[][] board) {
        if (board.length < 3 || board[0].length < 3)
            return;
        int[][] visited = new int[board.length][board[0].length];
        for (int i = 0; i < board[0].length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if ((i == 0 || i == board.length - 1) || (j == 0 || j == board[0].length - 1)) {
                    if (board[i][j] == 'O')
                        dfs(board, i, j, visited);
                }
            }
        }
        for (int i = 0; i < board[0].length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (visited[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j, int[][] visited) {
        if (i == board.length || i == -1 || j == -1 || j == board[0].length || visited[i][j] == 1 || board[i][j] == 'X')
            return;
        if (board[i][j] == 'O')
            visited[i][j] = 1;
        dfs(board, i + 1, j, visited);
        dfs(board, i, j + 1, visited);
        dfs(board, i, j - 1, visited);
        dfs(board, i - 1, j, visited);
    }
}

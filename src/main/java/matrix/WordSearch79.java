package matrix;

public class WordSearch79 {


    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        System.out.println(new WordSearch79().exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        if (word == null || word.trim().equals(""))
            return false;
        char c = word.charAt(0);
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == c) {
                    int[][] lookup = new int[board.length][board[0].length];
                    if (findWord(board, i, j, word, 0, lookup))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean findWord(char[][] board, int i, int j, String word, int len, int[][] lookup) {
        if (i < 0 || i == board.length || j < 0 || j == board[0].length || len == word.length() || word.charAt(len) != board[i][j]) {
            return false;
        }
        if (lookup[i][j] == 1) {
            lookup[i][j] = 0;
            return false;
        }
        lookup[i][j] = 1;
        if (word.length() - 1 == len)
            return true;
        return findWord(board, i + 1, j, word, len + 1, lookup) || findWord(board, i - 1, j, word, len + 1, lookup) || findWord(board, i, j + 1, word, len + 1, lookup) || findWord(board, i, j - 1, word, len + 1, lookup);
    }
}

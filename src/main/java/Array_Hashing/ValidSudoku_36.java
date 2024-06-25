package Array_Hashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku_36 {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Set<Character> col = new HashSet<>();
        HashSet[][] square = new HashSet[3][3];
        for (int i = 0; i < square.length; i++)
            for(int j = 0; j < square[i].length; j++)
                square[i][j] = new HashSet<Character>();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (!row.add(board[i][j]) && board[i][j] != '.') return false;
                if (!col.add(board[j][i]) && board[j][i] != '.') return false;
                if (!square[i / 3][j / 3].add(board[i][j]) && board[i][j] != '.') return false;
            }
            row = new HashSet<>();
            col = new HashSet<>();
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };



        System.out.println(isValidSudoku(board));
    }
}

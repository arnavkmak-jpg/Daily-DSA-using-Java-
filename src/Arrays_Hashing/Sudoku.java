package Arrays_Hashing;

import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        for (int i = 0; i < 9; i++) {
            HashSet<Character> nums = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                if (nums.contains(board[i][j])) {
                    System.out.println("false");
                    return;
                }
                nums.add(board[i][j]);

            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> nums = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i]=='.'){
                    continue;
                }
                if (nums.contains(board[j][i])) {
                    System.out.println("false");
                    return;
                }
                nums.add(board[j][i]);

            }
        }
        for (int box = 0; box < 9; box++) {
            HashSet<Character> nums = new HashSet<>();
            for (int i = 0; i<3;i++){
                for (int j = 0; j < 3; j++) {
                    int rows = (box/3)*3+i;
                    int columns = (box%3)*3+j;
                    if (board[rows][columns]=='.'){
                        continue;
                    }
                    if (nums.contains(board[rows][columns])) {
                        System.out.println("false");
                        return;
                    }
                    nums.add(board[rows][columns]);

                }

            }

        }
        System.out.println("true");
    }
}

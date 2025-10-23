package org.practice;

import java.util.HashMap;
import java.util.HashSet;

public class Suddosolver {
    public static void main(String[] args) {
        char[][] board = {
                {'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}
        };
        System.out.println(suddo(board));
//        [[".",".","4",".",".",".","6","3","."],[".",".",".",".",".",".",".",".","."],["5",".",".",".",".",".",".","9","."],[".",".",".","5","6",".",".",".","."],["4",".","3",".",".",".",".",".","1"],[".",".",".","7",".",".",".",".","."],[".",".",".","5",".",".",".",".","."],[".",".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".",".","."]]
    }

    static boolean suddo(char[][] board) {
        HashSet<Character>map=new HashSet<>();
        int posrow = 0;
        int poscol = 0;
        int subbox = 1;
        int row=0;
        int col=0;
        boolean check=false;
        while (subbox <= board.length) {
            check=true;
            for (int i = 0; i < 3; i++) {
                poscol=col;
                for (int j = 0; j < 3; j++) {
                    if(board[posrow][poscol]!='.'){
                        if (map.contains(board[posrow][poscol])) {
                            if(subbox==0)
                            return false;
                        }
                    }
                    poscol++;
                }

                posrow++;
            }
            if (col== board[0].length) {
                poscol+=3;
                row += 3;
                col+=3;
            }
            else {
                posrow=row;
            }
            subbox = subbox + 1;
check=false;
        }
        return true;
    }
}

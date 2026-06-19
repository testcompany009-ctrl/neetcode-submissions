class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.') continue;
                else if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        for(int j = 0; j<9; j++){
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i<9; i++){
                if(board[i][j] == '.') continue;
                else if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        for(int boxRow = 0; boxRow<3; boxRow++){
            for(int boxCol = 0; boxCol<3; boxCol++){
                HashSet<Character> set = new HashSet<>();
                for(int i = 0; i<3; i++){
                    for(int j = 0; j<3; j++){
                        if(board[boxRow*3 + i][boxCol*3 + j] == '.') continue;
                        else if(set.contains(board[boxRow*3 + i][boxCol*3 + j])) return false;
                        else set.add(board[boxRow*3 + i][boxCol*3 + j]);
                    }
                }
            }
        }
        return true;
    }
}

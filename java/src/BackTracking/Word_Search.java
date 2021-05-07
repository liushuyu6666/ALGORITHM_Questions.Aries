package BackTracking;

import java.util.Arrays;

public class Word_Search {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] trace = new boolean[m][n];
        for(boolean[] t : trace){
            Arrays.fill(t, false);
        }
        if(word.length() < 1) return false;
        for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                for(boolean[] t : trace){
                    Arrays.fill(t, false);
                }
                int[] pos = new int[]{x, y};
                if(helper(board, trace, word, 0, pos)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isValidGrid(char[][] board, boolean[][] trace, int x, int y){
        int m = board.length, n = board[0].length;
        if(x >= 0 && x < m && y >= 0 && y < n){
            if(!trace[x][y]){
                return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, boolean[][] trace, String word, int idx, int[] pos){
        int x = pos[0], y = pos[1];
        if(board[x][y] != word.charAt(idx)) return false;

        // match
        if(idx == word.length() - 1) return true;
        trace[x][y] = true;

        int xx, yy;
        boolean leftValid = false, rightValid = false, upValid = false, downValid = false;
        // left
        xx = pos[0];
        yy = pos[1] - 1;
        if(isValidGrid(board, trace, xx, yy)){
            // System.out.println("pos" + x + "," + y + ":left:" + xx + "," + yy );
            leftValid = helper(board, trace, word, idx+1, new int[]{xx, yy});
        }
        // right
        xx = pos[0];
        yy = pos[1] + 1;
        if(isValidGrid(board, trace, xx, yy)){
            // System.out.println("pos" + x + "," + y + ":right:" + xx + "," + yy );
            rightValid = helper(board, trace, word, idx+1, new int[]{xx, yy});
        }
        // up
        xx = pos[0] - 1;
        yy = pos[1];
        if(isValidGrid(board, trace, xx, yy)){
            // System.out.println("pos" + x + "," + y + ":up" + xx + "," + yy );
            upValid = helper(board, trace, word, idx+1, new int[]{xx, yy});
        }
        // down
        xx = pos[0] + 1;
        yy = pos[1];
        if(isValidGrid(board, trace, xx, yy)){
            // System.out.println("pos" + x + "," + y + ":down" + xx + "," + yy );
            downValid = helper(board, trace, word, idx+1, new int[]{xx, yy});
        }
        trace[x][y] = false;
        return leftValid || rightValid || upValid || downValid;
    }

    public static void main(String args[]){
        char[][] board = new char[][]
                {{'A', 'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A', 'A'}};

        Word_Search word_searchBestSolution = new Word_Search();
        System.out.println(word_searchBestSolution.exist(board, "AAAAAAAAAAAAAAB"));
    }
}

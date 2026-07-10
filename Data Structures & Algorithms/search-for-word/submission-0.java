class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length , m =board[0].length;
        boolean [][] vis = new boolean [n+1][m+1];
        boolean res = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    res = dfs(board,word,vis,i,j,0);
                    if(res) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char [][] board,String word,boolean [][] vis,int i,int j,int ind){
        if(ind==word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || vis[i][j] || board[i][j] != word.charAt(ind) ){
            return false;
        }

        vis[i][j] = true;
        if (dfs(board, word, vis, i + 1, j, ind + 1) ||
            dfs(board, word, vis, i - 1, j, ind + 1) ||
            dfs(board, word, vis, i, j + 1, ind + 1) ||
            dfs(board, word, vis, i, j - 1, ind + 1)) {
            return true;
        }
        vis[i][j] = false;
        return false;


    }
}

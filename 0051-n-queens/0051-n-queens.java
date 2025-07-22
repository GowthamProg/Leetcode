class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char [][]board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(list, board , n ,0);
        return list;
    }
    public void backtrack(List<List<String>> result, char [][]board,int n,int row){
        if(row==n){
            result.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isvalid(board,row,col,n)){
                board[row][col]='Q';
                backtrack(result, board,n,row+1);
                board[row][col]='.';
            }
        }
    }
    public boolean isvalid(char [][]board,int row , int col, int n){
        for(int i=0;i<row ; i++)
            if(board[i][col]=='Q') return false;
    
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1; i>=0 && j<n; i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }

    public List<String> construct(char[][] board){
        List<String> b =new ArrayList<>();
        for(char []a : board){
            b.add(new String(a));
        }
        return b;
    }
}
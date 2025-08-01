class Solution {
    int count=0;
     public int totalNQueens(int n) {
        char [][]board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(board,n ,0);
        return count;
    }
    public void backtrack(char [][]board,int n,int row){
        if(row==n){
            count++;
            return;
        }
        for(int col=0;col<n;col++){
            if(isvalid(board,row,col,n)){
                board[row][col]='Q';
                backtrack(board,n,row+1);
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
}
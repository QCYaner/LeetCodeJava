import java.util.LinkedList;
import java.util.Queue;


public class SurroundedRegions {
	
	public static void solve(char[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        
        if(m==0){
        	return;
        }
        
        for(int i=0; i<m; i++){
        	if(board[i][0]=='O')
                bfs(i,0, board);
        	if(board[i][n-1]=='O')
                bfs(i,n-1,board);
        }
        
        for(int i=0; i<n; i++){
        	if(board[0][i]=='O')
                bfs(0,i,board);
        	if(board[m-1][i]=='O')
                bfs(m-1,i,board);
        }
        
        for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.printf(board[i][j]+",");
			}
			System.out.println();
		}
        System.out.println();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]=='E')
                   board[i][j]='O';
                else if(board[i][j]=='O')
                   board[i][j]='X';
            }
        }
    }
    
   static class Node{
        int x;
        int y;
        Node(int x1, int y1){ x =x1; y=y1;}
    }
    
    static void bfs(int row, int col, char[][] board ){
        
    	int m=board.length;  
    	int nn=board[0].length;  

    	
    	
        //char X;
        Queue<Node> qu = new LinkedList<Node>();
        Node no = new Node(row,col);
        
        qu.offer(no);
        //--------------------------------
        board[row][col]='E';
        
        while(!qu.isEmpty()){
            Node top = qu.poll();
            
            int tX=top.x;
            int tY=top.y;

            if(tX!=0 && board[tX-1][tY]=='O'){
                Node n = new Node(tX-1,tY);
                qu.offer(n);
                board[tX-1][tY]='E';
            }
            if(tX!=m-1 && board[tX+1][tY]=='O'){
                Node n = new Node(tX+1,tY);
                qu.offer(n);
                board[tX+1][tY]='E';
            }
            if(tY!=0 && board[tX][tY-1]=='O'){
                Node n = new Node(tX,tY-1);
                qu.offer(n);
                board[tX][tY-1]='E';
            }
            if(tY!=nn-1 && board[tX][tY+1]=='O'){
                Node n = new Node(tX,tY+1);
                qu.offer(n);
                board[tX][tY+1]='E';
            }
            
        }
        

    }

}

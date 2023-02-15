//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			int [][] mat = new int[N][M];
			for(int i = 0; i < N; i++) {
				str = br.readLine().trim().split(" ");
				for(int j = 0; j < M; j++) {
					mat[i][j] = Integer.parseInt(str[j]);
				}
			}
			Solution obj = new Solution();
			out.println(obj.water_flow(mat, N, M));
		}
		out.close();
	}
}
// } Driver Code Ends

class Solution{
    class Pair {
        public int row;
        public int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public boolean equals(Object object) {
            if (object instanceof Pair) {
                Pair pair = (Pair) object;
                return pair.row == row && pair.col == col;
            }
            return false;
        }

        public int hashCode() {
            return new Integer(row).hashCode() * 31 + new Integer(col).hashCode();
        }
    }

    public void dfs(int row, int col, Set<Pair> visited, int[][] heights, int preHeight) {
        if (visited.contains(new Pair(row, col)) || heights[row][col] < preHeight) {
            return;
        }
        visited.add(new Pair(row, col));
        if (row > 0) {
            dfs(row - 1, col, visited, heights, heights[row][col]);
        }
        if (row < heights.length - 1) {
            dfs(row + 1, col, visited, heights, heights[row][col]);
        }
        if (col > 0) {
            dfs(row, col - 1, visited, heights, heights[row][col]);
        }
        if (col < heights[0].length - 1) {
            dfs(row, col + 1, visited, heights, heights[row][col]);
        }
    }

    int water_flow(int [][] heights, int N, int M) {
        int ROWS = N;
        int COLS = M;
        Set<Pair> indian = new HashSet<Pair>();
        Set<Pair> arabian = new HashSet<Pair>();
        for (int col = 0; col < COLS; col++) {
            dfs(0, col, indian, heights, heights[0][col]);
            dfs(ROWS - 1, col, arabian, heights, heights[ROWS - 1][col]);
        }
        for (int row = 0; row < ROWS; row++) {
            dfs(row, 0, indian, heights, heights[row][0]);
            dfs(row, COLS - 1, arabian, heights, heights[row][COLS - 1]);
        }
        indian.retainAll(arabian);
        return indian.size();
    }
}
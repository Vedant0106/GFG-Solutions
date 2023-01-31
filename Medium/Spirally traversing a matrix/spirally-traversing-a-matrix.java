//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = r-1;
        int colEnd = c-1;
        ArrayList<Integer> arr = new ArrayList<>();

        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            int temprowStart = rowStart;
            for(int i = colStart ; i <= colEnd;i++)
            {
                arr.add(matrix[temprowStart][i]);
            }
            rowStart++;
            int tempcolEnd = colEnd;
            for(int i = rowStart ; i <= rowEnd; i++)
            {
                arr.add(matrix[i][tempcolEnd]);
            }
            colEnd--;
            int temprowEnd = rowEnd;
            for(int i = colEnd; i >= colStart; i--)
            {
                if(rowStart > rowEnd)
                {
                    break;
                }
                arr.add(matrix[temprowEnd][i]);
            }
            rowEnd--;
            int tempcolStart = colStart;
            for(int i = rowEnd; i >= rowStart; i--)
            {
                if( colStart > colEnd)
                {
                    break;
                }
                arr.add(matrix[i][tempcolStart]);
            }
            colStart++;
        }
        return arr;
    }
}

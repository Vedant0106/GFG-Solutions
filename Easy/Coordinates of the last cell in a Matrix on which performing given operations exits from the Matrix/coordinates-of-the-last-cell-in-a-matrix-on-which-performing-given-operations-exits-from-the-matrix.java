//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
         int i=0,j=0;

        String dir = "r";

        int a[] = new int[2];

        while(i<m && j<n && i>=0 && j>=0){

           // System.out.println(i+" "+j+" "+dir);

            if(arr[i][j]==0){

                a = getIJ(dir,i,j);

                i=a[0];

                j=a[1];

            }

            else{

                arr[i][j]=0;

                 dir = getDir(dir);

                a = getIJ(dir,i,j);

                i=a[0];

                j=a[1];

               

                

            }

        }

        

        if(i>=m) i--;

        if(i<0) i++;

        if(j>=n) j--;

        if(j<0) j++;

        

        

        return new int[]{i, j};

    }

    

    static String getDir(String dir){

        

        if("r".equals(dir))

            return "d";

        else if("d".equals(dir))

            return "l";

        else if("l".equals(dir))

            return "u";

        else 

            return "r";

    }

    

    static int [] getIJ(String dir, int i, int j){

        

        switch(dir){

        case "r" : j++;

            break;

        case "d" : i++;

            break;

        case "l" : j--;

            break;

        case "u" : i--;

            break;

        }   

        return new int[]{i,j};
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int k)
    {
      ArrayList<Long> ans = new ArrayList<Long>();
      Queue<Long> queue = new LinkedList<Long>();
      int j = 0;
      int i = 0;
      while (j < N) 
      {
      if (j <= k - 1) 
      {
      if (A[j] < 0)
      queue.add(A[j]);
      if (j== k - 1) 
      {
      if (!queue.isEmpty() && queue.peek() < 0)
      ans.add(queue.peek());

      else
      ans.add((long) 0);
      }
      j++;
    }
    else 
    {
      if (!queue.isEmpty() && A[i] < 0)
      queue.poll();
      
      if (A[j] < 0)
      queue.add(A[j]);
      
      if (!queue.isEmpty() && queue.peek() < 0)
      ans.add(queue.peek());

      else
       ans.add((long) 0);
       j++;
       i++;
    }
 }
    long ar[] = new long[ans.size()];
    for (int s = 0; s < ans.size(); s++)
       ar[s] = ans.get(s);

 return ar;  
    }
}
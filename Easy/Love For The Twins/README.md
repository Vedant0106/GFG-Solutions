<h2><a href="https://practice.geeksforgeeks.org/problems/love-for-the-twins2623/0">Love For The Twins</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an Array of Integers <strong>Arr </strong>of length <strong>N</strong>, you have to count number of elements of the array that can be counted as pair of equal elements.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong> </span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> 
<strong>N = </strong>7
<strong>Arr[] = </strong>{10, 10, 10, 20, 20, 10, 20}
<strong>Output:</strong>
6
<strong>Explanation:</strong>
The pairs formed are: (10,10),
(10,10), (20,20). The leftover 10
can't be paired with any other 10.
So, the Output is 6.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong> </span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> 
<strong>N = </strong>4
<strong>Arr = </strong>{10, 20, 30, 40}
<strong>Output:</strong>
0
<strong>Explanation:</strong>
No pairs can be formed.
So, the Output is 0.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>getTwinCount()</strong> which takes an Integer N and an Array Arr as input and returns the answer.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup><br>
1 ≤ Arr[i] ≤ 10<sup>5</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Hash</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;
<h2><a href="https://practice.geeksforgeeks.org/problems/maximum-sum-of-subarray-less-than-or-equal-to-x4033/1?page=2&category[]=sliding-window&sortBy=submissions">Maximum sum of subarray less than or equal to x</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of integers of size <strong>N</strong> and a number <strong>X</strong>, the task is to find the sum of subarray having maximum sum less than or equal to the given value of <strong>X</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 5, X = 11
arr[] = {1, 2, 3, 4, 5} 
<strong>Output:</strong>  10
<strong>Explanation</strong>: Subarray having maximum 
sum is {1, 2, 3, 4}.</span></pre>

<p><span style="font-size:18px">&nbsp;<br>
<strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 5, X = 7
arr[] = {2, 4, 6, 8, 10} 
<strong>Output:</strong> &nbsp;6
<strong>Explanation:</strong> Subarray having maximum 
sum is {2, 4} or {6}.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>calculateMaxSumLength</strong>() that takes array <strong>arr, </strong>integer <strong>N</strong>, and integer<strong> X&nbsp;</strong>as parameters and returns maximum sum of any subarray that is less than or equal to x.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N).&nbsp;<br>
<strong>Expected Auxiliary Space:</strong> O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>6</sup></span><br>
<span style="font-size:18px">1</span>&nbsp;<span style="font-size:18px">≤ arr[i]&nbsp;≤ 10<sup>4</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>sliding-window</code>&nbsp;<code>two-pointer-algorithm</code>&nbsp;<code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;
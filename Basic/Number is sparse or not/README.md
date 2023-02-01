<h2><a href="https://practice.geeksforgeeks.org/problems/number-is-sparse-or-not-1587115620/1?page=1&category[]=Bit%20Magic&curated[]=1&sortBy=submissions">Number is sparse or not</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a number <strong>N</strong>.&nbsp;The task is to check whether it is<strong> </strong>sparse or not. A number is said to be a sparse number if no<strong> </strong>two or more consecutive bits are set&nbsp;in the binary representation</span>.<br>
<br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: N = 2
<strong>Output</strong>: 1
<strong>Explanation</strong>: Binary Representation of 2 is 10, 
which is not having consecutive set bits. 
So, it is sparse number.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input</strong>: N = 3
<strong>Output</strong>: 0
<strong>Explanation</strong>: Binary Representation of 3 is 11, 
which is having consecutive set bits in it. 
So, it is not a sparse number.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;</strong>The task is to complete the function <strong>checkSparse</strong>() that takes <strong>n </strong>as a parameter and returns 1<strong> </strong>if the number is sparse else returns 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(1).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span><br>
<br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>6</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Bit Magic</code>&nbsp;<code>Data Structures</code>&nbsp;
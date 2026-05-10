<h2><a href="https://www.geeksforgeeks.org/problems/count-only-repeated2047/1?page=8&category=Arrays,Java&difficulty=Medium&sortBy=submissions">Count only Repeated</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a <strong data-start="126" data-end="171">sorted array arr[] of positive integers</strong> where the elements are <strong data-start="195" data-end="210">consecutive</strong>, meaning each adjacent pair differs by exactly 1 <strong data-start="260" data-end="293">when no repetition is present</strong>. In this array, <strong data-start="310" data-end="359">exactly one element may appear more than once</strong>, while all other elements appear exactly once.&nbsp;Now, the task is to find the element which is repeated and number of times it is repeated.<br><strong>Note: </strong>If there's no repeating element, Return [-1,-1].</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 3, 4]
<strong>Output: </strong>[3, 2]<strong>
Explanation: </strong>In the given array, 3 is occuring two times.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 3, 4, 5, 5]
<strong>Output: </strong>[5, 2]<strong>
Explanation: </strong>In the given array, 5 is occuring two times.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3]
<strong>Output: </strong>[-1 -1]<strong>
Explanation: </strong>In the given array, there's no repeating element, and thus the output is [-1, -1].</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>7</sup><br>1 &lt;= arr[i] &lt;= arr.size()</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Searching</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;
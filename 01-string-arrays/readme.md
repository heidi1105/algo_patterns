# String & Hashmap
## Situation
- To avoid O(n) search for combinations within arrays. 
- When the questions require summarization of data with unique keys. 

## Concept
- When asked about contains duplicate, the array is unsorted and finding duplicate would take O(n^2) (nested for-loop) to find all the combinations. 
- .sort() could also work but that takes nlog(n)
- If we could store all the values in a hashmap/ frequency table, it only takes O(n) to build the table, and O(1) to retrieve data from keys

## Steps
1. Decide on the table type you need (set? hashmap? What should be the key & what should be the values) and instantiate it. 
2. Putting elements into the hashmap (Takes O(n))
3. After the hashmap is created, how to retrieve the data to complete the task
   - If-statement? .sort first? Loop through the map?

## Questions
Warm-up
- [Contains duplicate](https://leetcode.com/problems/contains-duplicate/) 
- [Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/) 
- [Valid Anagram](https://leetcode.com/problems/valid-anagram/) 
- [Two sum](https://leetcode.com/problems/two-sum/)

More applications
- [Unique Email Address](https://leetcode.com/problems/unique-email-addresses/)
- [Word Pattern](https://leetcode.com/problems/word-pattern/)

Medium Level
- [Group Anagrams](https://leetcode.com/problems/group-anagrams/)
- [3 sum](https://leetcode.com/problems/3sum/) ([Solution](https://leetcode.com/problems/3sum/solutions/1716480/two-pointers-and-maintain-unique-result-by-hashmap/))
- [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) ([Solution](https://leetcode.com/problems/valid-sudoku/solutions/476369/javascript-solution-beats-100-with-explanation-real-explanations/))
- [Brick Wall](https://leetcode.com/problems/brick-wall/)

More Challenge (Need more knowledge on heap & BFS)
- [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) 
- [Word Ladder](https://leetcode.com/problems/word-ladder/) 
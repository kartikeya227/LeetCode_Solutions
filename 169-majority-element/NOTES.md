**Sorting**
Intuition
If the elements are sorted in monotonically increasing (or decreasing) order, the majority element can be found at index (n/2) or(n/2) +1.
```
class Solution {
public int majorityElement(int[] nums) {
Arrays.sort(nums);
return nums[nums.length/2];
}
}
```
Hash Map:
```
class Solution {
private Map<Integer, Integer> countNums(int[] nums) {
Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
for (int num : nums) {
if (!counts.containsKey(num)) {
counts.put(num, 1);
}
else {
counts.put(num, counts.get(num)+1);
}
}
return counts;
}
​
public int majorityElement(int[] nums) {
Map<Integer, Integer> counts = countNums(nums);
​
Map.Entry<Integer, Integer> majorityEntry = null;
for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
majorityEntry = entry;
}
}
​
return majorityEntry.getKey();
}
}
```
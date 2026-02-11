## Prerequisistes for Arrays and Hashing

1. **Dynamic Array**.

- grows when full.
- stores elements like a contiguous memory.
- java -> ArrayList.

> Usage : size is unknown , you need random access , frequent appends.

```java
ArrayList<Integer> list = new ArrayList<>();
// This creates a normal array with defualt capacity 10 and when it becomes full , it creates a new array and copies the old element.
```

| operation       | Time |
| --------------- | ---- |
| access by index | O(1) |
| add             | O(1) |
| add at middle   | O(n) |
| remove          | O(n) |

---

2. **Hash Usage**.(Hashmap and Hashset).

- Hashing : converts the key -> index value.
- uses hash function on Key .

```java
map.put("java",5);
// internally it calls "apple".hashcode() , hash%arraylength  and stores in that bucket.

```

- each bucket stores a **linkedlist** or a **Tree** (Redblack Tree).
  | operation | Time |
  | -----------| ---- |
  | put | O(1) |
  | get | O(1) |

- usage : fastlookup , detect duplicates, store seen elements , mapping values to indices.

3. **prefix sums** (very important)

```java

int[] nums = {2,4,6,8};
int n = nums.length ;
int[] prefix = new int[n];
prefix[0] = nums[0] ;
for(int i=1;i<n ; i++){
    prefix[i] = prefix[i-1] + nums[i]
}
```

**why data structures and algorithms are essential**

\-> In warehouse there are large number of products that may be stored. If there is no data structure used, operations like searching, adding, updating a product becomes difficult. If every operation takes a long time, the total system performance becomes poor.

\-> To resolve this problem, data structure helps in organizing data efficiently by giving different procedures to manage different types of data.



**types of data structures suitable**

ArrayList

we can use ArrayList which stores the product sequentially.It is easy to implement but it is suitable for small Inventories.Updation and deletion can be slower for large inventories.



HashMap

we can use HashMap which stores the data in Key-Value pairs.All the operations can be done fast and it can be used when frequent search and updation operations are required.



**Time Complexity Analysis (Using HashMap)**

Add Operation: Takes O(1) time on average because a product is inserted directly using its productId as the key.

Update and Delete Operations: Both take O(1) time on average since the product can be accessed or removed directly using its key.



**Optimization**

Using a HashMap instead of an ArrayList improves searching, updating, and deleting from O(n) to O(1) on average.

Using a unique productId as the key ensures faster access and avoids duplicate entries.


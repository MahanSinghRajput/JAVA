### Detection
* Use slow and fast pointer, if they meet that means there is a loop else fast will reach null.
* Why do the slow and fast pointers meet?  
Slow will reach the node which is the start of the loop, the fast will be ahead of that point. The distance between the fast and slow would be "d", now in each step slow is moving 1 step and fast is moving 2 steps in the loop, hence the distance is being reduced by 1 in each step therefore they will meet eventually.

### Length
* Use slow and fast pointers, when they meet, stop the slow pointer and move the fast pointer by 1 step and count the steps, when the slow and fast pointer meet again stop the fast pointer and the count is your answer.

### Starting Node
* When the slow and fast pointers meet, take the slow pointer to the head of the linked list, and start moving both slow and fast pointers by 1 step, when they meet again that is the start of the loop.
* Why is it so?  
![alt text](/LinkedList/Concepts/brave_screenshot_www.youtube.com.png)
When the slow points to the Starting node of the loop for the first time, it is d steps away from the fast pointer and has moved "l1" steps from the start, fast is also l1 steps ahead of the slow pointer, the slow will now move d steps to meet the fast pointer. The meeting point is now l1 away from the Starting Node of the loop, hence moving slow from the head makes sure that they meet at the startig point.
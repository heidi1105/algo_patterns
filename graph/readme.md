## Graph
### DFS
#### Application
Good in checking whether certain node can be visited
#### How
1. Push the starting node to a stack 
2. If the currentNode has neighbors, push them to the stack 
3. Pop from the stack
4. Do the action with the popped node
5. Repeat 2-4 until the stack is empty




- BFS (all neighbors first)
#### How
1. Push the starting node to a queue 
2. If the currentNode has neighbors, enqueue them to the queue 
3. dequeue from the stack
4. Do the action with the dequeued node
5. Repeat 2-4 until the stack is empty




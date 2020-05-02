/*
    Requirements:
    - Circular
    - FIFO
    - Has head and tail
    - Insertion from rear
    - Deletion from front
*/

import java.util.ArrayList;

/*
    https://www.studytonight.com/data-structures/circular-queue
    head = (head+1) % maxSize or
    tail = (tail+1) % maxSize
*/
public class CircularQueue {
    private final int SIZE = 5;
    private String queue[] = new String[SIZE];
    private final int TAIL = SIZE;
    private final int HEAD = 0;

    // Returns and deletes the HEAD, triggering the queue to move up
    public String pop() {
        String temp = queue[HEAD];
        // head has to be cleaned
        queue[0] = null;
        return temp;
    }

    private void eraseHead() {

    }

    public void insert(String s){
        queue[TAIL] = s;
    }

    public String[] getQueue(){
        return queue;
    }

    // If the queue is full or not
    public boolean queueStatus() {

    }

}

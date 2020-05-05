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
    private int SIZE;
    private ArrayList<String> queue = new ArrayList<>();
    private final int TAIL = SIZE;
    private final int HEAD = 0;
    private boolean status;

    // Returns and deletes the HEAD, triggering the queue to move up
    public void setSize(int size){
        this.SIZE = size;
    }

    public int getSize(){
        return SIZE;
    }

    public String pop() {
        String temp = queue.get(HEAD);
        // head has to be cleaned
        eraseHead();
        return temp;
    }

    private void eraseHead() {
        queue.set(HEAD, null);
    }

    public void insert(String s){
        if (!status){
            queue.add(s);
        }
        else {
            System.out.println("The queue is full");
        }

    }

    public ArrayList getQueue(){
        return queue;
    }

    // If the queue is full or not
    public boolean queueStatus() {
        return status;
    }

    private void setStatus() {
        status = !status;
    }
}

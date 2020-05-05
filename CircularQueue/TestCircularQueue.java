import java.util.ArrayList;

public class TestCircularQueue extends CircularQueue{
    ArrayList<String> testQueue = new ArrayList<>();
    boolean result;

    public boolean testGetSize() {
        boolean result;
        int temp = getSize();
        testQueue = getQueue();

        int j = 0;
        for (int i = 0; i < testQueue.size(); i++){
            j++;
        }

        if (testQueue.size() == j){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

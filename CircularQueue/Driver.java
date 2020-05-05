import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        CircularQueue c = new CircularQueue();
        TestCircularQueue t = new TestCircularQueue();
        Scanner s = new Scanner(System.in);
        System.out.println("testGetSize(): " + t.testGetSize());
    }
}

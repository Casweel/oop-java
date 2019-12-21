import java.util.ArrayList;

public class WaitListTest {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<>();
        for (int i = 0; i < 5; i++)
            waitList.add(i);
        System.out.println(waitList.toString());
        System.out.println(waitList.remove() + " was removed from waitlist");
        System.out.println(waitList.toString());
        System.out.println();


        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        for (int i = 0; i < boundedWaitList.getCapacity(); i++)
            boundedWaitList.add(i);
        System.out.println(boundedWaitList.toString());
        System.out.println();


        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        for (int i= 0; i < 5; i++)
            unfairWaitList.add(i);
        System.out.println(unfairWaitList.toString());
        unfairWaitList.remove(3);
        System.out.println(unfairWaitList.toString());
        unfairWaitList.moveToBack(2);
        System.out.println(unfairWaitList.toString());
    }
}

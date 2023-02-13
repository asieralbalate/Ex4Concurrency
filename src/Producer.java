import java.util.*;

public class Producer implements Runnable {
    private List<String> list;
    //public static final long WAIT_MILLISECONDS = 500;

    public Producer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long acc = 0;
        try {
            while (true) {
                if (list.size() < 10) {
                    list.add("String number " + acc);
                    acc++;
                }
                long randomMilliseconds = (long) ((Math.random() * 1001) + 500);
                Thread.sleep(randomMilliseconds);
            }
        } catch (InterruptedException e) {
        }
    }
}

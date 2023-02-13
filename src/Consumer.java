import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
    public List<String> list;
    //public static final long WAIT_MILLISECONDS = 1000;

    public Consumer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {

                if (!list.isEmpty()) {
                    String s = list.remove(0);
                    System.out.println(s + " (" + list.size() + " remaining)");
                    long randomMilliseconds = (long) ((Math.random() * 1001) + 1000);
                    Thread.sleep(randomMilliseconds);
                }
            }
        } catch (InterruptedException e) {

        }
    }
}

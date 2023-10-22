public class GlobalCounter {
    private static GlobalCounter instance;
    private int count;

    private GlobalCounter() {
        count = 0;
    }

    public static synchronized GlobalCounter getInstance() {
        if (instance == null) {
            instance = new GlobalCounter();
        }
        return instance;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

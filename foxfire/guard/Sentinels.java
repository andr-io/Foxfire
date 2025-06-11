package foxfire.guard;

public class Sentinels {

    protected static boolean isWardActive = false;

    public static void stutter() {
        System.out.println("🩻 Sentinel fallback invoked...");
        System.out.println("💤 Heap response latency increasing... mem wards weakening.");
        isWardActive = false;
    }

}

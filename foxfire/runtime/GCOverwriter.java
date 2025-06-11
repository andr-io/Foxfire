package foxfire.runtime;

public class GCOverwriter {

    public static void inscribeRule(String clause) {
        System.out.printf("♻️ New GC clause inscribed: '%s'%n", clause);
        System.out.println("📜 Memory marked immutable by command of the JVMancer.");
    }
}

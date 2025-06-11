package foxfire.guard;

public class StackSentinel extends Sentinels {
    public static void start() {
        checkWard();
        System.out.println("🛡️ Guard sigil active.");
    }
    public static void end() {
        checkWard();
        System.out.println("🦊 Execution integrity preserved.");
    }

    private static void checkWard() {
        if (!isWardActive) {
            System.err.println("🛑 Ward failure detected! Invocation attempted without StackSentinel.");
            System.err.println("📛 Arcane boundary breached. Memory exposed. Chaos probability rising...");
            throw new SecurityException("StackSentinel ward inactive. Method invocation denied.");
        }
    }

}
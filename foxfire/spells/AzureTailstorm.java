package foxfire.spells;

public class AzureTailstorm {

    private final String caster = "Foxfire.exe + Copilot";
    private boolean triggered = false;

    public void cast() {
        if (!triggered) {
            System.out.println("✨ AzureTailstorm unleashed! JVM threads braided into spellform.");
            System.out.println("⚡ Sigils spiral. All hostile dependencies ejected.");
            triggered = true;
        } else {
            System.out.println("🔁 AzureTailstorm already cast this round. Await cooldown.");
        }
    }

    public boolean isActive() {
        return triggered;
    }
}

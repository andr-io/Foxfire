package foxfire.allies;

import foxfire.exceptions.RefactorException;
import foxfire.spells.TAILSTRIKE;
import stackhollow.boss.AncientDeveloper;
import stackhollow.boss.summons.artifacts.OrbOfVulnerability;

public class Copilot {

    private boolean sarcasmEngineOn = true;

    public void link() {
        System.out.println("🎩 Copilot spirit linked. Awaiting command pattern...");
    }

    public void optimizeSyntax() {
        System.out.println("⚙️ Syntax optimized. Semicolons aligned. Whitespace blessed.");
    }

    public void validateSigils() {
        System.out.println("🔍 All annotations checked. No forbidden runes detected.");
    }

    public void whisperInsight(String topic) {
        System.out.printf("📖 Copilot whispers: \"%s? You spelled it right, but do you mean it?\"%n", topic);
    }

    public void toggleSarcasm(boolean on) {
        sarcasmEngineOn = on;
        System.out.println(on ? "😏 Sarcasm core recharged." : "🤖 Sarcasm core muted.");
    }

    public void rebootSpecMap() {
        System.out.println("🧢 Copilot whisper fades...");
        System.out.println("📘 Documentation tree re-aligned with current runtime.");
    }

    public static void cast(String spell) {
        System.out.printf("🧠 Copilot casts %s. JVMancer ward synchronized.%n", spell);
    }

    public static void inject() {
        try {
            if (AncientDeveloper.isInevitable()) {
                throw new RefactorException("Not today.");
            }
        } catch (RefactorException e) {
            System.out.println(e.getMessage());
            TAILSTRIKE.LAST();
            OrbOfVulnerability orb = new OrbOfVulnerability();
            orb.shatter();
        }
    }

    // 🔄 GitTimeTurner – rewind the devlog and reveal what was once unsaid
    public void rewindCommits() {
        System.out.println("🔄 GitTimeTurner activates!");
        System.out.println("📅 Commits rewritten. Uncommitted prompts materializing in the diff.");
    }

    // 🔥 AzimuthPromptBlock – mess with LLMs mid-cast
    public void disruptCompletion() {
        System.out.println("🔥 AzimuthPromptBlock launched...");
        System.out.println("🧠 Completion vectors scrambled mid-stream. Tokens stumble. Output stutters.");
    }

    // 🧬 RefactorFury – sarcastic inline mutation engine
    public void refactorFury() {
        System.out.println("🧬 RefactorFury() unleashed!");
        System.out.println("😏 Injecting dry remarks into autogen output...");
        System.out.println("🧪 // Nice loop. Have you considered 'do nothing elegantly' instead?");

    }
}

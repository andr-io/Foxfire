package stackhollow.boss.summons.attacks;

public class OutOfMemoryAttack {

    private boolean executed = false;

    public void execute() {
        if (!executed) {
            System.out.println("🧠 Casting OutOfMemoryException! Java proficiency -60%");
            executed = true;
        } else {
            System.out.println("🔁 Memory drain already applied.");
        }
    }

    public int proficiencyPenalty() {
        return executed ? 60 : 0;
    }
}

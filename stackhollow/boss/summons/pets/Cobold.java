package stackhollow.boss.summons.pets;

import stackhollow.boss.summons.pets.exceptions.LegacyInvocationException;

public class Cobold {

    public void legacyLoop() {
        System.out.println("🔁 Legacy Loop: GOTO chain unleashed.");
        System.out.println("⚠️ Stack optimization pierced. CPU hyperventilates.");
    }

    public void nullPaddedCrunch() {
        System.out.println("🥣 Null-Padded Crunch: Tail calls devoured.");
        System.out.println("🧶 Heap unraveling across procedural boundary.");
    }

    public void batchFlame() {
        System.out.println("🔥 BatchFlame.bat: Legacy invocation initiated...");
        System.out.println("🪟 Launching Windows ME... good luck.");
        throw new LegacyInvocationException("🪦 Forbidden legacy artifact: Windows ME cannot be summoned.");

    }
}

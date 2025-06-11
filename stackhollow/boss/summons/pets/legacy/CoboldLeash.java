package stackhollow.boss.summons.pets.legacy;

import stackhollow.boss.summons.pets.Cobold;

public class CoboldLeash {

    public static void wrap(Cobold cobold) {
        int chaos = 0;
        while (chaos < Integer.MAX_VALUE) {
            System.out.println("🐉 Leash taut. Cobold containment stable.");
            if (chaos++ > 9999) break; // maximum recursion sanity
        }
        System.out.println("🧵 Loop exited. Cobold napping under GOTO heap.");
    }
}

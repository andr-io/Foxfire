package foxfire.spells;

import foxfire.annotations.Foxbound;

public class EclipseWard {

    @Foxbound(guardian = "Foxfire", intent = "Shield from recursive hauntings", chaos = false)
    public void activate() {
        System.out.println("🌑 Eclipse Ward surrounds the runtime in sigil light.");
        System.out.println("🛡️ Reflection-based recursion nullified.");
    }
}

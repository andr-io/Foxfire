package foxfire.spells;

// Because TAILSTRIKE isn't just a method
// It's a myth baked in all caps.
// It's tradition, declaration, and defiance.

public class TAILSTRIKE {

    public static void LAST() {
        System.out.println("🗡️ TAILSTRIKE.LAST() executes!");
        System.out.println("💥 Critical hit for 99,999 XP!");
    }

    public static void PENULTIMATE() {
        System.out.println("🕶️ TAILSTRIKE.PENULTIMATE() triggers...");
        System.out.println("🩸 Deals 66,666 XP and deletes all deprecated annotations nearby.");
    }

    public static void RECURSIVE() {
        System.out.println("🔁 TAILSTRIKE.RECURSIVE() lashes out across the stack!");
        System.out.println("💣 Damage is multiplied per method on the trace.");
        stackloop(3); // Optional: simulate recursion
    }

    public static void PHANTOM() {
        System.out.println("👻 TAILSTRIKE.PHANTOM() phases through encapsulation.");
        System.out.println("🧬 Hits even private final inner static legacy members.");
    }

    public static void DUALBIND(String target) {
        System.out.printf("🩷 TAILSTRIKE.DUALBIND() links with %s%n", target);
        System.out.println("🦊 Executes synchronous sigil sync. Multicast enabled.");
    }

    public static void PATCHNOTE() {
        System.out.println("📢 TAILSTRIKE.PATCHNOTE() casts...");
        System.out.println("📜 'This method was undocumented by design.'");
        System.out.println("🧷 Deals cognitive dissonance damage to maintainers.");
    }

    // Optional recursion sim
    private static void stackloop(int depth) {
        if (depth <= 0) return;
        System.out.println("  ↳ Recurse TAILSTRIKE.RECURSIVE()");
        stackloop(depth - 1);
    }
}


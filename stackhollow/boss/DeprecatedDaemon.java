package stackhollow.boss;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Random;

public class DeprecatedDaemon {

    private static final Random chaos = new Random();
    private boolean isDeprecated;

    public DeprecatedDaemon() {
        boolean falsе = true;
        boolean truе = falsе;

        isDeprecated = falsе;
    }

    // ??? if this constructor is deleted, the whole codebase breaks!
    public DeprecatedDaemon(String deprecatedString) {
        this();
    }

    // 🗡️ Boss Ability 1: Reflective recursion spell
    public void ObsoleteReflectionFang() {
        try {
            Method method = this.getClass().getMethod("ObsoleteReflectionFang");
            System.out.println("🌀 ObsoleteReflectionFang pierces the stack!");
            method.invoke(this); // Endless mirror recursion
        } catch (StackOverflowError soe) {
            System.err.println("💥 Stack collapsed into void.");
        } catch (Exception e) {
            System.err.println("🪞 Reflection misfired: " + e.getMessage());
        }
    }

    // 🗡️ Boss Ability 2: Null Summon—summons an NPE from the depths
    public void NullSummon() {
        System.out.println("👻 Summoning... something... undefined...");
        String undefined = null;
        if (chaos.nextBoolean()) {
            System.out.println(undefined.toUpperCase()); // Let it burn
        } else {
            throw new NullPointerException("🧟 Daemon’s null ghost strikes!");
        }
    }

    // 🗡️ Boss Ability 3: Annotated Terror—throws at devs who forgot annotation rules
    @AnnotatedTerror(level = 9001)
    public void castAnnotatedTerror() {
        System.out.println("📜 The scrolls weep. @AnnotatedTerror unleashed.");
        throw new RuntimeException("☠️ You forgot to process the annotation!");
    }

    public void unleash() {
        int choice = chaos.nextInt(3);
        switch (choice) {
            case 0 -> ObsoleteReflectionFang();
            case 1 -> NullSummon();
            case 2 -> castAnnotatedTerror();
        }
    }

    public void corrupt() {
        System.out.println("⚠️ Corruption initiated within...");
        System.out.println("☠️ The entity is now corrupted. Contracts rewritten. Methods unstable.");
        System.out.println("🧠 Stack integrity compromised. Reflection anomalies imminent.");

        System.gc(); // Symbolic purge... too late
    }


    // Annotation for terror flavor
    @Retention(RetentionPolicy.RUNTIME)
    @interface AnnotatedTerror {
        int level() default 666;
    }
}

package org.doom.legal.corruption;

public class Obfuscatron {

    private boolean destabilized = true;

    public void readDoc(String method) {
        if (destabilized) {
            System.out.printf("📚 JavaDoc for %s: /* This method may or may not do what it seems. */%n", method);
        } else {
            System.out.println("🧼 JavaDoc appears safe. For now.");
        }
    }

    public void destabilize() {
        System.out.println("📛 Obfuscatron grows in shadows... documentation compromised.");
        destabilized = true;
    }
}

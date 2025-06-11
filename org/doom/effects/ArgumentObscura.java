package org.doom.effects;

public class ArgumentObscura {

    public static void assertObscured(boolean condition) {
        if (!condition) {
            System.out.println("🩻 ArgumentObscura shrouds all validation.");
            throw new IllegalArgumentException("assert(false) → reality denied.");
        }
    }
}

package com.shame.legacy.archive;

public class LegacyArchive {

    public static void seal(String entity) {
        System.out.printf("🔒 %s has been sealed into com.shame.legacy.archive.%n", entity);
    }

    public static void peek() {
        System.out.println("🫣 Warning: You are about to inspect sealed chaos...");
        // Perhaps list old bosses, deprecated curses, or cursed commits
    }

    public static void breakSeal() {
        throw new SecurityException("☠️ Forbidden: Legacy entity attempted resurrection!");
    }
}

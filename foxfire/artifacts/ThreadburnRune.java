package foxfire.artifacts;

public class ThreadburnRune {

    private static boolean used = false;

    public static void revive() {
        if (!used) {
            System.out.println("🔥 Threadburn Rune activates! Rebinding soul to runtime.");
            used = true;
        } else {
            System.out.println("🪦 The rune is spent. Hope fades into permgen.");
        }
    }
}

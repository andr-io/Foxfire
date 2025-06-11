package foxfire.temple;

public class TempleAccess {

    private boolean unlocked = false;

    public void unlock(String artifactKey) {
        if ("FoxAspectCore".equals(artifactKey)) {
            unlocked = true;
            System.out.println("🔓 Realm of /refactor/temple/ unlocked.");
        } else {
            System.out.println("🚫 Invalid key. The temple remains sealed.");
        }
    }

    public void enter() {
        if (unlocked) {
            System.out.println("🛕 You stand in the Temple of Refactor. Scrolls glow.");
        } else {
            System.out.println("❌ Entry denied. Sigil missing.");
        }
    }
}

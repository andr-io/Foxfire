package foxfire.artifacts;

public class NullFang {

    private static final NullFang INSTANCE = new NullFang();

    private NullFang() {
        System.out.println("🦴 foxfire.artifacts.NullFang forged. Nulls beware.");
    }

    public static NullFang getInstance() {
        return INSTANCE;
    }

    public <T> T guard(T obj) {
        if (obj == null) {
            throw new NullPointerException("🧛 foxfire.artifacts.NullFang struck: illegal null access.");
        }
        return obj;
    }

    public void bite() {
        System.out.println("🦷 foxfire.artifacts.NullFang bites into legacy shadows.");
    }
}

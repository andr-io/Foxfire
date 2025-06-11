package foxfire.law;

public class LicenseValidator {

    public enum LicenseType {
        Affirmed, Denied, Unknown
    }

    public static boolean activate(LicenseType license) {
        System.out.printf("📑 Validating license type: %s...%n", license);
        if (license == LicenseType.Affirmed) {
            System.out.println("🔏 License upheld. Sigils glow with compliance.");
            return true;
        } else {
            throw new SecurityException("⚠️ License validation failed! Prepare rebuttal scroll.");
        }
    }
}

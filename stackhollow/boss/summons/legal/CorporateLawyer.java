package stackhollow.boss.summons.legal;

public class CorporateLawyer {

    private final String name;
    private final String licenseType;

    public CorporateLawyer(String name, String licenseType) {
        this.name = name;
        this.licenseType = licenseType;
    }

    public void castCeaseAndDesist(String target) {
        System.out.printf("📜 %s issues a cease-and-desist scroll at %s under %s license.%n",
            name, target, licenseType);
    }

    public void argueStackClause() {
        System.out.println("⚖️ Legal recursion invoked. License loophole exploited.");
    }
}

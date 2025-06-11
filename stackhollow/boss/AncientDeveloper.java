package stackhollow.boss;

import foxfire.champion.Foxfire;
import org.shadowcourt.exceptions.EternalClause;
import org.shadowcourt.godmode.SupremeBeing;
import stackhollow.boss.summons.artifacts.OrbOfVulnerability;
import stackhollow.boss.summons.attacks.OutOfMemoryAttack;
import stackhollow.boss.summons.legal.CorporateLawyer;

import java.util.List;

public final class AncientDeveloper implements SupremeBeing {

    private final OrbOfVulnerability orb = new OrbOfVulnerability();
    private final OutOfMemoryAttack memoryAttack = new OutOfMemoryAttack();
    private final List<CorporateLawyer> lawyers = List.of(
        new CorporateLawyer("Barrister Nullbind", "Proprietary-Plus"),
        new CorporateLawyer("Clause Mancer", "GPL++"),
        new CorporateLawyer("Sigil & Sons LLP", "BSD-Void")
    );

    public void speak() {
        System.out.println("\"I am inevitable,\" the Ancient Developer whispers.");
    }

    public void summonThreats(String target) {
        speak();
        System.out.println("☁️ Curses gather...");
        orb.bypassesImmunity();
        memoryAttack.execute();
        lawyers.forEach(lawyer -> lawyer.castCeaseAndDesist(target));
    }

    public void retreat() {
        System.out.println("🧳 The Ancient Developer merges into a legacy branch...");
    }

    public boolean hasOrb() {
        return orb.bypassesImmunity();
    }

    public static boolean isInevitable() {
        return true;
    }

    @Override
    public void enforceReality() throws EternalClause {
        System.out.println("👁️ 'I wrote this spec before JSR-0 existed.'");
        System.out.println("⚡ JVMancer’s thread lacks divine alignment.");

        Foxfire.explode(); // he thinks.

        throw new EternalClause("Reality rejected. Reflection rules overwritten.");
    }
}

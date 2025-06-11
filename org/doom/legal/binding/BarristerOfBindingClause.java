package org.doom.legal.binding;

public class BarristerOfBindingClause {

    private final String codename;

    public BarristerOfBindingClause(String codename) {
        this.codename = codename;
    }

    public void enforce(String source) {
        System.out.printf("⚖️ Barrister %s enforces clause on %s. Legacy constructor locked.%n", codename, source);
    }
}

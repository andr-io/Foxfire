package org.doom.passives;

public class EULAPenalty {

    private boolean active = false;

    public void apply() {
        System.out.println("📜 EULA Penalty activated. Java ability reduced by -70%.");
        active = true;
    }

    public int getAbilityModifier() {
        return active ? -70 : 0;
    }

    public boolean isActive() {
        return active;
    }
}


package cresla.entities;

import cresla.interfaces.AbsorbingModule;

public class CooldownSystem extends Modules implements AbsorbingModule {
    private int heatAbsorbing;

    public CooldownSystem(int id, Integer heatAbsorbing) {
        super (id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

}

package cresla.entities;
import cresla.interfaces.AbsorbingModule;

public class HeatProcessor extends Modules  implements AbsorbingModule {
   private int 	heatAbsorbing;

    public HeatProcessor(int id, int heatAbsorbing) {
        super (id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }
}

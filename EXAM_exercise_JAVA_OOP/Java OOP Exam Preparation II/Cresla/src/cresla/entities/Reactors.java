package cresla.entities;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Reactor;

public abstract class Reactors implements Reactor {
    private int id ;
    private int moduleCapacity;
    private int index;
    private ModuleContainer moduleContainer;

    protected Reactors(int id,int index, int moduleCapacity) {
        this.id = id;
        this.index = index;
        this.moduleCapacity = moduleCapacity;
        this.moduleContainer = new ModuleContainer (moduleCapacity);
    }

    @Override
    public long getTotalEnergyOutput() {
        long sum = 0;
        if(this.getClass ().getSimpleName ().equals ("CryoReactor")){
            return moduleContainer.getTotalEnergyOutput () * index;
        }if(this.moduleContainer.getTotalEnergyOutput () > getTotalHeatAbsorbing ()){
            return 0;
        }
        return this.moduleContainer.getTotalEnergyOutput ();
    }
    @Override
    public long getTotalHeatAbsorbing() {
        if(this.getClass ().getSimpleName ().equals ("HeatReactor")){
            return this.moduleContainer.getTotalHeatAbsorbing () + index;
        }
        return this.moduleContainer.getTotalHeatAbsorbing ();
    }
    @Override
    public int getModuleCount() {
        return this.moduleContainer.getModuleByInputCount ();
    }
    @Override
    public void addEnergyModule(EnergyModule energyModule) {
        moduleContainer.addEnergyModule (energyModule);
    }
    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {
        moduleContainer.addAbsorbingModule (absorbingModule);
    }
    @Override
    public int getId() {
        return this.id;
    }
}

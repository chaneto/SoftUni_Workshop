package cresla.entities;

import cresla.interfaces.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {
    private Map<Integer, Reactor> reactorMap;
    private Map<Integer, AbsorbingModule> absorbingModuleMap;
    private Map<Integer, EnergyModule> energyModuleMap;
    private int id;

    public ManagerImpl() {
        this.reactorMap = new HashMap<> ();
        this.absorbingModuleMap = new HashMap<> ();
        this.energyModuleMap = new HashMap<> ();
    }

    @Override
    public String reactorCommand(List<String> arguments) {
        Reactor reactor = null;
        this.id = this.reactorMap.size () + 1 + this.absorbingModuleMap.size () + this.energyModuleMap.size ();
        if(arguments.get (0).equals ("Cryo")){
            reactor = new CryoReactor (this.id ,Integer.parseInt (arguments.get (1)), Integer.parseInt (arguments.get (2)));
        }else if(arguments.get (0).equals ("Heat")){
            reactor = new HeatReactor (this.id, Integer.parseInt (arguments.get (1)), Integer.parseInt (arguments.get (2)));
        }reactorMap.put (this.id, reactor);
        return String.format ("Created %s Reactor - %d",arguments.get (0),this.id);
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        AbsorbingModule absorbingModule = null;
        EnergyModule energyModule = null;
        this.id = this.energyModuleMap.size () + 1 + this.reactorMap.size () + this.absorbingModuleMap.size ();
        if(arguments.get (1).equals ("CooldownSystem")){
            absorbingModule = new CooldownSystem (this.id, Integer.parseInt (arguments.get (2)));
            this.reactorMap.get (Integer.parseInt (arguments.get (0))).addAbsorbingModule (absorbingModule);
        }else if(arguments.get (1).equals ("CryogenRod")){
            energyModule = new CryogenRod (this.id, Integer.parseInt (arguments.get (2)));
            this.reactorMap.get (Integer.parseInt (arguments.get (0))).addEnergyModule (energyModule);
        }else if(arguments.get (1).equals ("HeatProcessor")){
            absorbingModule = new CooldownSystem (this.id, Integer.parseInt (arguments.get (2)));
            this.reactorMap.get (Integer.parseInt (arguments.get (0))).addAbsorbingModule (absorbingModule);

        }if(absorbingModule != null){
        absorbingModuleMap.put (id, absorbingModule);
        }else {
            energyModuleMap.put (id, energyModule);
        }
        return String.format ("Added %s - %d to Reactor - %s"
                ,arguments.get (1), this.id, arguments.get (0));
    }

    @Override
    public String reportCommand(List<String> arguments) {
        StringBuilder result = new StringBuilder ();
        Reactor reactor = null;
        AbsorbingModule absorbingModule = null;
        EnergyModule energyModule = null;
        if(this.absorbingModuleMap.containsKey (Integer.parseInt (arguments.get (0)))){
        absorbingModule = this.absorbingModuleMap.get (Integer.parseInt (arguments.get (0)));
        }if(this.energyModuleMap.containsKey (Integer.parseInt (arguments.get (0)))){
            energyModule = this.energyModuleMap.get (Integer.parseInt (arguments.get (0)));
        }
        if(this.reactorMap.containsKey (Integer.parseInt (arguments.get (0)))){
        reactor = this.reactorMap.get (Integer.parseInt (arguments.get (0)));
        }
        if(absorbingModule != null) {
            result.append (String.format ("%s Module – %d%nheatAbsorbing: %d",//more exit
                    absorbingModule.getClass ().getSimpleName (), absorbingModule.getId (), absorbingModule.getHeatAbsorbing ()));
        }else if(energyModule != null) {
                result.append (String.format ("%s Module – %d%nenergyOutput: %d",//more exit
                        energyModule.getClass ().getSimpleName (), energyModule.getId (),energyModule.getEnergyOutput ()));
            }

        else if(reactor != null){
            result.append (String.format ("%s - %d" +
                            "%nEnergy Output: %s%nHeat Absorbing: %s%nModules: %d"
                    ,reactor.getClass ().getSimpleName (),reactor.getId (),reactor.getTotalEnergyOutput ()
            ,reactor.getTotalHeatAbsorbing (), reactor.getModuleCount ()));
        }return result.toString ().trim ();
    }

    @Override
    public String exitCommand(List<String> arguments) {
        int cryoReactoryCount = 0;
        int heatReactoryCount = 0;
        int energyModulesCount = 0;
        int absorbingModulesCount = 0;
        long totalEnergyOutput = 0;
        long totalHeatAbsorbing = 0;
        AbsorbingModule absorbingModule = null;
        EnergyModule energyModule = null;
        for(Map.Entry<Integer, Reactor> out: this.reactorMap.entrySet ()) {
            totalHeatAbsorbing += out.getValue ().getTotalHeatAbsorbing ();
            totalEnergyOutput += out.getValue ().getTotalEnergyOutput ();
            if(out.getValue ().getClass ().getSimpleName ().equals ("CryoReactor")){
                cryoReactoryCount++;
            } if(out.getValue ().getClass ().getSimpleName ().equals ("HeatReactor")){

                heatReactoryCount++;
            }
        }for(Map.Entry<Integer, AbsorbingModule> out: this.absorbingModuleMap.entrySet ()){
            if(out.getValue ().getClass ().getSimpleName ().equals ("CryogenRod")){
                energyModulesCount++;
            }if(out.getValue ().getClass ().getSimpleName ().equals ("CooldownSystem")
                    || out.getValue ().getClass ().getSimpleName ().equals ("HeatProcessor")){
                absorbingModulesCount++;
            }
        }for(Map.Entry<Integer, EnergyModule> out: this.energyModuleMap.entrySet ()){
            if(out.getValue ().getClass ().getSimpleName ().equals ("CryogenRod")){
                energyModulesCount++;
            }if(out.getValue ().getClass ().getSimpleName ().equals ("CooldownSystem")
                    || out.getValue ().getClass ().getSimpleName ().equals ("HeatProcessor")){
                absorbingModulesCount++;
            }
        }
       return String.format ("Cryo Reactors: %d%n" +
                "Heat Reactors: %d%n" +
                "Energy Modules: %d%n" +
                "Absorbing Modules: %d%n" +
                "Total Energy Output: %d%n" +
                "Total Heat Absorbing: %d",
                cryoReactoryCount, heatReactoryCount, energyModulesCount,
                absorbingModulesCount, totalEnergyOutput, totalHeatAbsorbing);

    }
}

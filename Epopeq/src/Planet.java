public class Planet extends OrbitableSpaceObject{
    protected int metal;
    protected int gas;
    protected int crystal;
    protected int uranium;

    public Planet(int metal, int gas, int crystal, int uranium) {
        this.metal = metal;
        this.gas = gas;
        this.crystal = crystal;
        this.uranium = uranium;
    }


    public void addBuilding(Object o) {

    }
}

import java.util.List;

public class OrbitableSpaceObject extends SpaceObject{
    public List<SpaceObject> orbiters;


    public void addOrbiter(SpaceObject orbiter){
        orbiters.add(orbiter);
    }


    public List<SpaceObject> getOrbiters() {
        return orbiters;
    }


    @Override
    public void displayInfo() {

    }
}

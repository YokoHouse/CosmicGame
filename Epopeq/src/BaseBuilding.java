public class BaseBuilding {
    protected String name;
    protected int level;
    protected int constructionTime;
    protected double metalRequired;
    protected double crystalRequired;
    protected double gasRequired;
    protected double uraniumRequired;


    public BaseBuilding(String name, int level, int constructionTime, double metalRequired, double crystalRequired, double gasRequired, double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getConstructionTime() {
        return constructionTime;
    }

    public double getMetalRequired() {
        return metalRequired;
    }

    public double getCrystalRequired() {
        return crystalRequired;
    }

    public double getGasRequired() {
        return gasRequired;
    }

    public double getUraniumRequired() {
        return uraniumRequired;
    }

    public void construct(Planet target){
        if(target.metal >= getMetalRequired() &&
                target.crystal >= getCrystalRequired() &&
                target.gas >= getGasRequired() &&
                target.uranium >= getUraniumRequired()) {

            target.metal -= getMetalRequired();
                    target.crystal -= getCrystalRequired();
                    target.gas -= getGasRequired();
                    target.uranium -= getUraniumRequired();

                    target.addBuilding(this);
        } else {
            System.out.println("Not enough resources!");
        }
    }

    public void upgrade(){
        
    }

    public void applyEffect(){

    }
}

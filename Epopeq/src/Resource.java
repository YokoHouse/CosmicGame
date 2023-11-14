public class Resource extends Planet{
    public double amount;
    public double harvestRate;


    public Resource(int metal, int gas, int crystal, int uranium, double amount, double harvestRate) {
        super(metal, gas, crystal, uranium);
        this.amount = amount;
        this.harvestRate = harvestRate;
    }



    public void harvest(){
        amount += harvestRate;
    }

    public double harvestMetal(double amount){
        return amount*1;
    }

    public double harvestGas(double amount){
        return amount*0.5;
    }

    public double harvestCrystal(double amount){
        return amount*0.2;
    }

    public double harvestUranium(double amount){
        return amount*0.1;
    }

    public void printResources(){
        System.out.println("Metal" + metal);
        System.out.println("Gas" + gas);
        System.out.println("Crystal" + crystal);
        System.out.println("Uranium" + uranium);
    }


}

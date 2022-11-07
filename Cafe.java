/* This is a stub for the Cafe class */

/**
 * Cafe class, extended from Building class
 */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;

        System.out.println("You have built a cafe: ☕");
    }

    /**
     * sells coffee, decreases inventory everytime a sale happens, restocks inventory when running low.
     * @param size coffee size in ounces
     * @param sugar packs of sugar needed
     * @param cream amount of cream meeded
     * @return statement saying how much of each ingredient is left in the inventory
     * @return if a restocking happened, prints out a statement saying how much of each ingredient is now in the inventory
     */
    
    public void sellCoffee(int size, int sugar, int cream){
        if (nCoffeeOunces < 10 || nCreams <10 || nSugarPackets <10 || nCups <10){
            System.out.println("Please restock inventory");
            restock(200, 100, 100, 100);
            System.out.println("Inventory restocked. Cafe now has " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packs of sugar, " + nCreams + " creamers, and " + nCups + " cups.");
        }
        this.nCups -= 1;
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= sugar;
        this.nCreams -= cream;
        System.out.println("invneotyr after sale: " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packs of sugar, " + nCreams + " creamers, and " + nCups + " cups.");
    }

    public void sellCoffee(int size){
        if (nCoffeeOunces < 12){
            restock(200);
        }
        this.nCoffeeOunces -= size;
    }

    @Override
    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee()");
      }

    @Override
    public void goToFloor(int floorNum){
        System.out.println("Sorry, you are not permitted to go to another floor in the cafe.");
    }

    @Override
    public void goDown(){
        System.out.println("Sorry, you are not permitted to go to another floor in the cafe.");
    }
    @Override
    public void goUp(){
        System.out.println("Sorry, you are not permitted to go to another floor in the cafe.");
    }
    /**
     * restocks cafe inventory
     * @param nCoffeeOunces coffee size in ounces
     * @param nSugarPackets packs of sugar
     * @param nCreams amount of creams
     * @param nCups amount of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    /**
     * restock constructor overload -- only restocks coffee ounces
     * @param nCoffeeOunces
     */
    private void restock(int nCoffeeOunces){
        this.nCoffeeOunces = nCoffeeOunces;
    }


    public static void main(String[] args) {
        /** main method for testing */
        Cafe cc = new Cafe("Campus Center Cafe", "100 Elm St", 3, 100, 100, 100, 100);
        System.out.println(cc);
        cc.sellCoffee(100, 50, 50);
        cc.sellCoffee(50, 20, 10);
        cc.showOptions();
        cc.goToFloor(3);
    }
    
}

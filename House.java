/* This is a stub for the House class */
import java.util.ArrayList;
/*
 * House class, extended from Building class
 */
public class House extends Building{

  /** array to store residents' names*/
  private ArrayList<String> residents;

  /**boolean of whether the house has dining room or not */
  private boolean hasDiningRoom;

/**boolean of whether the house has elevator or not */

  private boolean hasElevator;

  /**constructor*/
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * constructor overload - only take in name
   * @param name
   */
  public House(String name){
    super(name);
}
/**
 * constructor overload - only take in name and address
 * @param name
 * @param address
 */
  public House(String name, String address){
    super(name, address);
}

  /**
   * Checks whether or not the house has dining room
   * @return T/F: whether the house has dining room or not
   */
  public boolean hasDiningRoom(){
    if (hasDiningRoom == true) {
      System.out.println("There's a dining hall at this house");
    }
    else{
      System.out.println("No dining hall at this house");
    }
    return hasDiningRoom;
  };

  public boolean hasElevator(){
    if (hasElevator == true) {
      System.out.println("There's an elevator at this house");
    }
    else{
      System.out.println("No elevator at this house");
    }
    return hasElevator;
  }

  /**
   * checks how many residents there are in the house
   * @return T/F: whether there are residents or not, and the number of residents if there are any residents
   */
  public boolean nResidents(){
    if (residents.size() > 0) {
      System.out.println("There are " + residents.size() + " residents in this house.");
      return true;
    } 
    System.out.println("No residents");
    return false;
  }

  /**
   * adds a name to the residents array list as a resident "moves in"
   * @param rname: name of resident who is moving in
   * @return statement saying resident name is now a resident
   */
public void moveIn(String rname){
  residents.add(rname);
  System.out.println(rname + " is now a resident.");
}

/**
 * removes a name from the residents array list as a resident "moves out"
 * @param rname: name of resident who is moving out
 * @return name of resident who moved out, and a statement saying they have moved out of the house
 */
public String moveOut(String rname){
  if (residents.contains(rname)){
    residents.remove(rname);
    System.out.println(rname + " has moved out of the house.");
    return rname;
  }
  System.out.println("No resident with that name is in this house.");
  return "No resident with that name is in this house.";
} /** return the name of the person who moved out */

/**
 * checks whether a person is a resident or not
 * @param rname: person you want to check if they're a resident of this house or not
 * @return T/F: whether this person is a resident or not
 */
public boolean isResident(String rname) {
  if (residents.contains(rname)) {
    System.out.println(rname + " is a resident in this house.");
    return true;
  }
  System.out.println(rname + " is not a resident in this house.");
  return false;
}

@Override
public void showOptions() {
    super.showOptions();
  System.out.println(" + moveIn(name)\n + moveOut(name)\n + isResident(name)");
}

@Override
public void goToFloor(int floorNum){
    if (hasElevator = true){
        super.goToFloor(floorNum);
    } 
    System.out.println("This house does not have an elevator, please use the goUp() and goDown() funcitons go to up or down floor by floor.");
}

  public static void main(String[] args) {
    /** main method for testing */
    House myHouse = new House ("Northrop House", "Elm", 5, true, true);
    System.out.println(myHouse);
    myHouse.moveIn("Tina");
    myHouse.moveIn("Tseegi");
    myHouse.moveOut("Tina");
    myHouse.isResident("Tina");
    myHouse.nResidents();
    myHouse.showOptions();
  }
}
/* This is a stub for the Library class */
import java.util.Hashtable;

/**
 * Library class, extended from Building class
 */
public class Library extends Building{

  //Hashtable to store library books
  private Hashtable<String, Boolean> collection;


    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * constructor overload - only take in name
     * @param name
     */
    public Library(String name){
        super(name);
    }

    /**
     * constructor overload - only take in name and address
     * @param name
     * @param address
     */
    public Library(String name, String address){
        super(name, address);
    }

    /**
     * adds a title to the library
     * @param title title of the book
     * @return a statement saying the title is added
     */
    public void addTitle(String title) {
      collection.put(title, true);
      System.out.println(title + " is added.");
    }

    /**
     * removes a title from the library
     * @param title title of the book
     * @return a statement saying the title is removed
     */
    public String removeTitle(String title) {
      collection.remove(title);
      System.out.print(title + " was removed.");
      return title;
    } // return the title that we removed

    /**
     * checks whether the library contains a title or not
     * @param title title that we want to check
     * @return T/F: whether the library has the title or not
     */
    public boolean containsTitle(String title){
      if (collection.contains(title)){
        System.out.println("The library contains " + title);
        return true;
      }
      System.out.println("Sorry, the library does not contain " + title);
      return false;
    }

    /**
     * check out a book from the library. changes value of the title from true to false.
     * @param title title of book that is checked out
     * @return a statement saying the title has been checked out
     */
    public void checkOut(String title){
      collection.replace(title, true, false);
      System.out.println(title + " has been checked out.");
    }
    /**
     * return a book to the library. changes value of the title from false to true.
     * @param title title of the book that is returned
     * @return a statement saying the title has been returned
     */
    public void Return(String title){
      collection.replace(title, false, true);
      System.out.println(title + " has been returned.");
    }

    /**
     * check whether a title is available to be checked out at the moment
     * @param title title of the book we want to check availability
     * @return T/F: whether the book is available or not
     */
    public boolean isAvailable(String title){
      if (collection.contains(title)){
        if (collection.get(title) == true){
          System.out.println(title + " is available.");
          return true;
        }
      }
      System.out.println("Sorry, " + title + " is not available at the moment.");
      return false;
    }
     // returns true if the title is currently available, false otherwise
    public void printCollection(){
      System.out.println(collection.toString());
    } // prints out the entire collection in an easy-to-read way (including checkout status)

    @Override
    public void showOptions() {
        super.showOptions();
      System.out.println(" + checkOut()\n + return()\n");
    }

    @Override
    public void goToFloor(int floorNum){   
        super.goToFloor(floorNum);
}
  
    public static void main(String[] args) {
      /** main method for testing */
      Library Neilson = new Library("Neilson", "10 Elm Street", 5);
      System.out.println(Neilson);
      Neilson.addTitle("Biology of life");
      Neilson.addTitle("Child developmental psychology");
      Neilson.checkOut("Child developmental psychology");
      Neilson.showOptions();
      Neilson.enter();
      Neilson.goToFloor(3);
    }
  
  }
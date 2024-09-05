import java.util.ArrayList;

public class Library implements LibraryInterface {

    private ArrayList<LibraryItem> items;

    public Library(){
        items = new ArrayList<LibraryItem>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println("Succesfully add item to library.");
    } //Adds a new item to the library.

    public void removeItem(String itemId){
        for(LibraryItem x : items){
            if(x.itemId.equals(itemId)){
                items.remove(x);
                break;
            }
        }
        System.out.println("Succesfully remove item from library.");
    } //Removes an item based on its ID.

    public void listAllItems(){
        for (LibraryItem x : items){
            x.printDetails();
        }
    } //Lists all items in the library.

    public void checkOutItem(String itemId){
        for(LibraryItem x : items){
            if(x.itemId.equals(itemId) && !x.isCheckedOut){
                x.checkOut();
                break;
            }
        }
        System.out.println("Succesfully checkout item from library.");
    } //Checks out an item if it is available.

    public void returnItem(String itemId){
        for(LibraryItem x : items){
            if(x.itemId.equals(itemId) && x.isCheckedOut){
                x.returnItem();
                break;
            }
        }
        System.out.println("Succesfully return item to library.");
    } //Returns an item if it is checked out.

    public LibraryItem searchByTitle(String title){
        for(LibraryItem x : items) {
            if(x.title.equals(title)){
                System.out.println("Here is your item.");
                x.printDetails();
                return x;
            }
        }
        System.out.println("There is no book with title "+title);
        return null;
    } //Finds an item by its title.
}

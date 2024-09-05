public interface LibraryInterface {
    void addItem(LibraryItem item); //Adds a new item to the library.
    void removeItem(String itemId); //Removes an item based on its ID
    void listAllItems(); //Lists all items in the library.
    void checkOutItem(String itemId); //Checks out an item if it is available.
    void returnItem(String itemId); //Returns an item if it is checked out.
    LibraryItem searchByTitle(String title); //Finds an item by its title.
}

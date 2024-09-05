public class Main {
    public static void main(String[] args) {
        LibraryItem myBook = new Book("Harry Potter","1234","Stev",123);
        LibraryItem myBook2 = new Book("Naruto", "4321", "Kisimoto", 300);
        LibraryItem myDVD = new DVD("Boboiboy", "5678", "Melsi", 100);
        LibraryItem myDVD2 = new DVD("Doraemon", "8765", "Sidol", 200);

        Library rack = new Library();
        rack.addItem(myBook);
        rack.addItem(myBook2);
        rack.addItem(myDVD);
        rack.addItem(myDVD2);
        rack.removeItem("5678");
        rack.checkOutItem("8765");
        rack.checkOutItem("1234");
        rack.returnItem("8765");
        rack.listAllItems();
    }
}
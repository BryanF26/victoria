public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String itemId, String author, int pages) {
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void checkOut() {
        super.isCheckedOut = true;
    }

    @Override
    public void returnItem() {
        super.isCheckedOut = false;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: "+super.title);
        System.out.println("ItemID: "+super.itemId);
        System.out.println("IsCheckedOut: "+super.isCheckedOut);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+pages);
    }
}

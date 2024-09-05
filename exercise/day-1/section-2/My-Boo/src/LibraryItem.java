public abstract class LibraryItem {
    protected String title;
    public String itemId;
    protected boolean isCheckedOut;

    public abstract void checkOut();
    public abstract void returnItem();
    public abstract void printDetails();

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isCheckedOut = false;
    }
}

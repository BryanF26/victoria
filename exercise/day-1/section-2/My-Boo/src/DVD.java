public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, String itemId, String director, int duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
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
        System.out.println("Director: "+director);
        System.out.println("Duration: "+duration);
    }
}

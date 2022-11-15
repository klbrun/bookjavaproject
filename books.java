import java.util.Scanner;
public class Book {

    private int stockNumber;

    private String author;

    private String title;

    private int price;
        
    private int pages;

        
    public void setStockNumber(int bookStockNumber) {
        stockNumber = bookStockNumber;
    }

    
    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }
    

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setPrice(int bookPrice) {
        price = bookPrice;
    }
        
    public void setPages(int bookPages) {
        pages = bookPages;
    }


    public int getStockNumber() {
        return stockNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
        
    public int getPages() {
        return pages;
    }

    public static void main(String[] args){
        
        Book bookOne = new Book();
        bookOne.setAuthor("Bob George");
        bookOne.setTitle("A book about stuff");
        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getTitle());
        Book bookTwo = new Book();
        bookTwo.setPrice(20);
        bookTwo.setPages(2500);
        System.out.println(bookTwo.getPrice());
        System.out.println(bookTwo.getPages());
        Book[] userBooks = new Book[10];
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            userBooks[i] = new Book();
            System.out.println("Enter book title: ");
            userBooks[i].setTitle(input.nextLine());
            System.out.println("Enter book author: ");
            userBooks[i].setAuthor(input.nextLine());
            System.out.println("Enter book price: ");
            userBooks[i].setPrice(input.nextInt());
            System.out.println("Enter book pages: ");
            userBooks[i].setPages(input.nextInt());
            System.out.println("Enter book stock number: ");
            userBooks[i].setStockNumber(input.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(userBooks[i].getTitle());
        }
    }
    
}

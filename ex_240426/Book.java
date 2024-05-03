package ex_240426;

public class Book {
private String bookName;
private String bookAuthor;
private int bookPrice;

public String getBookName() {
	return bookName;
}
public void setBookName(String booklist, String string, String string2) {
	this.bookName = booklist;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}

public Book() {}

public Book(String bookName, String bookAuthor, int bookPrice) {
	super();
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	this.bookPrice = bookPrice;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + "]";
}



}

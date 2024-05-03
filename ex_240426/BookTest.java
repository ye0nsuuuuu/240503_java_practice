package ex_240426;

public class BookTest {

	public static void main(String[] args) {
		
//		Book book1 = new Book("나무", "베르나르 베르베르", 15000);
//		Book book2 = new Book("나무", "베르나르 베르베르", 15000);
//		Book book3 = new Book("나무", "베르나르 베르베르", 15000);
//		book1.setBookName("나무","신","개미");
//		book1.setBookPrice(15000);
//		book1.setBookAuthor("베르나르 베르베르");
//
//		String bookInfo = book1.toString();
//		System.out.println("책 정보 : " + bookInfo);
//		book1.toString();

		Book bookArray[] = new Book[3];
		bookArray[0] = new Book("나무", "베르나르 베르베르", 15000);
		bookArray[1] = new Book("나무", "베르나르 베르베르", 15000);
		bookArray[2] = new Book("나무", "베르나르 베르베르", 15000);
		
		for (int i = 0; i < bookArray.length; i++) {
			Book book = bookArray[i];
			System.out.println(book);
		}
		
//		Book[] bookArray =new Book[3];
//		
//		bookArray[0] = book1;
//		bookArray[1] = book2;
//		bookArray[2] = book3;
//		
//		for (int i=0; i<bookArray.)
	}

}

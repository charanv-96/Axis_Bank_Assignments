package assignment_5;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book();
		book1.setBookNo(1);
		book1.setTitle("Book");
		book1.setPrice(55);
		book1.setAuthor("Charan");
		
		System.out.println(book1.getAuthor());
		System.out.println(book1.getBookNo());
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		
		
		EngineeringBook book2 = new EngineeringBook();
		book2.setBookNo(2);
		book2.setTitle("Bok");
		book2.setPrice(54);
		book2.setAuthor("Charan");
		book2.setCategory("C");
		
		System.out.println(book2.getAuthor());
		System.out.println(book2.getBookNo());
		System.out.println(book2.getTitle());
		System.out.println(book2.getPrice());
		System.out.println(book2.getCategory());
		
	}

}

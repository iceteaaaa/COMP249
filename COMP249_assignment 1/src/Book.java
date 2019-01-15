//   -----------------------------------------------------
// Assignment 1
// Part I
// Written by Shuo Zhang, ID 40103576
//   ----------------------------------------------------
public class Book 
{
	private String title, author;
	private long ISBN;
	private double price;
	private static int num_of_book_created=0; 
	/**
	 * constructor with counter for number of objects
	 * @param title enter book title
	 * @param author enter author's name
	 * @param ISBN enter ISBN
	 * @param price enter price 
	 */
	public Book(String title, String author, long ISBN, double price)
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.price=price;
		num_of_book_created++;
	}
	
	/**
	 * default constructor with counter for number of objects
	 */
	public Book()
	{
		num_of_book_created++;
	}
	
	/**
	 * allows you go get book title
	 * @return book title
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * allows you go get book author
	 * @return book author
	 */
	public String getAuthor()
	{
		return author;
	}
	
	/**
	 * allows you go get book ISBN
	 * @return book ISBN
	 */
	public long getISBN()
	{
		return ISBN;
	}
	
	/**
	 * allows you go get book price
	 * @return book price
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * allows you to change book title
	 * @param title change your book title to
	 */
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	/**
	 * allows you to change book author
	 * @param title change your book author to
	 */
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	/**
	 * allows you to change book ISBN
	 * @param title change your book ISBN to
	 */
	public void setISBN(long ISBN)
	{
		this.ISBN=ISBN;
	}
	
	/**
	 * allows you to change book price
	 * @param title change your book price to
	 */
	public void setPrice(double price)
	{
		this.price=price;
	}
	/**
	 * description of the book 
	 */
	public String toString()
	{
		return("The book is titled \"" +title+"\", is written by "+author+", its ISBN is "+ISBN+", and its price is $"+price+".");
	}
	
	/**
	 * allows you to track the number of books created
	 * @return number of books created
	 */
	public int findNumberOfCreatedBooks()
	{
		return num_of_book_created;
	}
	
	/**
	 * allows you to compare 2 books and determine if they have equal ISBN and price 
	 * @param another_book another book that you want to compare to your existing book 
	 * @return
	 */
	public boolean equals(Book another_book)
	{
		return (ISBN==another_book.getISBN()&&price==another_book.getPrice());
	}
	
	
	
}


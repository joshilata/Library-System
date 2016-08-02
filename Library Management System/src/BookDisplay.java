public class BookDisplay 
{
	private String ISBN;
	private String title;
	private String author;
	private String edition;
	

	public BookDisplay(String iSBN, String title, String author, String edition) 
	{
		this.ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.edition = edition;
	
	}
	public String getISBN() 
	{
		return ISBN;
	}
	public void setISBN(String iSBN) 
	{
		ISBN = iSBN;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public String getEdition() 
	{
		return edition;
	}
	public void setEdition(String edition) 
	{
		this.edition = edition;
	}
	
		
			
	/* This method will display the book details in Console as entered by user*/
	
	public void DisplayBookInfo()
	{
		System.out.println("ISBN of Book is : "+ISBN);
		System.out.println("Title of Book is : "+title);
		System.out.println("Author of Book is: "+author);
		System.out.println("Edition of Book is : "+edition);
		System.out.println();
			
	}
}
public class Book extends TangibleAsset{
	public String isbn;
	public Book(String name,int price,Stirng coloor,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}

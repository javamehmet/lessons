
public class Document {
	
	public Document() {

		System.out.println("Document nesnesi yaratıldı");

	}
	
	public void addAuthors()
	{
		System.out.println("Document Add authors");
	}

	private void printClassName()
	{
		System.out.println(Document.class.getSimpleName());
	}
	
}

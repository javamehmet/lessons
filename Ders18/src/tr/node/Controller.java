package tr.node;

public interface Controller {
	
	public Node add(Node root,Kitap kitap);
	
	public Node firstDelet(Node root);
	
	public Node lastDelete(Node root);
	
	public Node addFirst(Node root,Kitap kitap);
	
	public void getList(Node root);
	
	public Node add(Node root,int id,Kitap kitap);
	
	public Node remove(Node root,int id);
	
	

}

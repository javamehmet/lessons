package tr.node;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeController controller=new NodeController();
				
		Node root=new Node();
		
		Kitap kitap=new Kitap();
		kitap.id=1;
		kitap.adi="Yasar";
		
		controller.add(root, kitap);
		//controller.getList(root);
		
		Kitap kitap2=new Kitap();
		kitap2.id=2;
		kitap2.adi="Yasar 2";
		
		controller.add(root, kitap2);
		//controller.getList(root);
		
		
		Kitap kitap3=new Kitap();
		kitap3.id=3;
		kitap3.adi="Yasar 3";
		
		controller.add(root, kitap3);
		//controller.getList(root);
		
		//controller.lastDelete(root);
		
	
		
		Kitap kitap4=new Kitap();
		kitap4.id=4;
		kitap4.adi="Yasar 4";
		
		root=controller.add(root, kitap4);
		
		controller.getList(root);
		
		Kitap kitap5=new Kitap();
		kitap5.id=5;
		kitap5.adi="Yasar 5";
		
		controller.add(root,3, kitap5);
		
		controller.getList(root);
		
		Kitap kitap6=new Kitap();
		kitap6.id=6;
		kitap6.adi="Yasar 6";
		
		controller.add(root,0, kitap6);
		
		controller.getList(root);

	}

}

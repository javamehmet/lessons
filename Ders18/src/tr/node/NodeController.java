package tr.node;

public class NodeController implements Controller {

	@Override
	public Node add(Node root, Kitap kitap) {

		Node temp = root;

		if (root.kitap == null) {
			root.kitap = kitap;
		} else {
			while (temp.nextNode != null)
				temp = temp.nextNode;

			temp.nextNode = new Node();
			temp.nextNode.kitap = kitap;

		}

		return root;

	}

	@Override
	public Node firstDelet(Node root) {

		if (root != null) {

			if (root.nextNode == null) {
				root = null;
			} else {

				root = root.nextNode;

			}

		}

		return root;
	}

	@Override
	public Node lastDelete(Node root) {

		if (root != null) {

			if (root.nextNode == null) {
				root = null;
			} else {

				while (root.nextNode.nextNode != null) {
					root = root.nextNode;
				}

				root.nextNode = null;

			}

		}

		return root;

	}

	@Override
	public Node addFirst(Node root, Kitap kitap) {


		if(root!=null)
		{
			
				Node node=new Node();
				node.kitap=kitap;
				node.nextNode=root;
				return node;
		}
		
		
		return null;
		
	}

	@Override
	public void getList(Node root) {
		// TODO Auto-generated method stub

		while (root != null) {

			System.out.println(root.kitap.adi);
			root = root.nextNode;

		}

	}

}

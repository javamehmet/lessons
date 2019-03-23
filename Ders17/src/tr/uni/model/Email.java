package tr.uni.model;

public class Email extends Document{

	private String subject;

	private Author to[];

	public Email() {

		to = new Author[1];
		// TODO Auto-generated constructor stub
	}

	public void addAuthor(Author author) {
		if (to[0] == null) {

			to[0] = author;
		} else {

			Author temp[] = to;

			to = new Author[temp.length + 1];

			for (int i = 0; i < temp.length; i++) {
				to[i] = temp[i];
			}

			to[temp.length] = author;

		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Author[] getTo() {
		return to;
	}

	public void setTo(Author[] to) {
		this.to = to;
	}

}

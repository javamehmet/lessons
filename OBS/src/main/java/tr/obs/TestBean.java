package tr.obs;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="testBean")
@SessionScoped
public class TestBean {

	
	private String name;
	
	public TestBean() {
		
		name="Java Developer";
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

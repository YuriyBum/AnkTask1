
public class User {
	private long id = 0;
	private String vacancy = null;
	
	public void setId (long id2) {
		id = id2;
	}
	
	public void setVacancy (String vacancy2) {
		vacancy = vacancy2;
	}
	
	public long getId() {
		return id;
	}
	
	public String getVacancy () {
		return vacancy;
	}
	
	public void printData() {
		 System.out.println(id);
		 System.out.println(vacancy);
	}

}

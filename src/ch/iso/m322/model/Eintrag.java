package ch.iso.m322.model;

public class Eintrag {
	
	private String name;
	

	public Eintrag(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEintrag() {

		String e = this.getName();
		return e;
	}
	
}

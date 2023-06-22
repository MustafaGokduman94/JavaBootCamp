package Animals;

public class Animals {
	private String name;
	private String type;
	private int beslenmeType;
	
	
	public Animals(String name, String type, int beslenmeType) {		
		this.name = name;
		this.type = type;
		this.beslenmeType=beslenmeType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void beslen(int type) {
		if(type==1) {
			if(this.beslenmeType==2) {
				System.out.println(this.name+" hayvanı yemi beğenmedi");
			}else {
				System.out.println(this.name+" hayvanı beslendi");
			}
			
		}else if(type==2) {
			if(this.beslenmeType==1) {
				System.out.println(this.name+" hayvanı yemi beğenmedi");
			}else {
				System.out.println(this.name+" hayvanı beslendi");
			}
		}
		
	}

}

package VO;



public class WebManagerVO {
	String name;
	int contact;
	
	public WebManagerVO(String n,int c){
		name=n;
		contact=c;
	}
	public String getname(){
		return name;
	}
	public int getcontact(){
		return contact;
	}
}

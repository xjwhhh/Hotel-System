package VO;



public class WebMarketVO {
	String name;
	int contact;
	
	public WebMarketVO(String n,int c){
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

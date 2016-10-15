package PO;

import java.io.Serializable;

public class WebManagerPO implements Serializable{
	String name;
	int contact;
	
	public WebManagerPO(String n,int c){
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

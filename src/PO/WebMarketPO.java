package PO;

import java.io.Serializable;

public class WebMarketPO implements Serializable{
	String name;
	int contact;
	
	public WebMarketPO(String n,int c){
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

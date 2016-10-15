package PO;

import java.io.Serializable;

public class HotelWorkerPO implements Serializable{
	String name;
	int contact;
	String hotel;
	
	public HotelWorkerPO(String n,int c,String h){
		name=n;
		contact=c;
		hotel=h;
	}
	public String getname(){
		return name;
	}
	public int getcontact(){
		return contact;
	}
	public String gethotel(){
		return hotel;
	}
}

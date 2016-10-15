package VO;



public class HotelWorkerVO {
	String name;
	int contact;
	String hotel;
	
	public HotelWorkerVO(String n,int c,String h){
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

package businesslogic;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;

public class ClientBLService_Stub implements ClientBLService{
	//客户信息
	String client_name;
	String contact;
	int credit;
	String credit_record;
	int memberid;
	String member_type;
	String birthday;
	String company;
	
	//酒店信息
	String address;
	String business_address;
	String hotel_name;
	String introduction;
	String service;
	String room_state;
	String room_type;
	int room_number;
	int room_price;
	String order;
	String evaluation;
	public ClientBLService_Stub(String n,String c,int c1,String cr,int m,String mt,String b,String co
			,String a,String ba,String na,String in,String s,String rs,String rt,int rn,int rp,String o,String e){
		client_name=n;
		contact=c;
		credit=c1;
		credit_record=cr;
		memberid=m;
		member_type=mt;
		birthday=b;
		company=co;
		
		address=a;
		business_address=ba;
		hotel_name=na;
		introduction=in;
		service=s;
		room_state=rt;
		room_type=rt;
		room_number=rn;
		room_price=rp;
		order=o;
		evaluation=e;
	}
	public ClientVO client_checkInfo(){
		ClientVO client=new ClientVO(client_name,contact,credit,credit_record,memberid,member_type,birthday,company);
		return client;		
	}
	
	public ResultMessage client_updateInfo(){
		return ResultMessage.Success;
	}
	
	public ArrayList<HotelVO> client_getpreviousHotelList(){
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public String client_checkCredit() {
		
		return credit_record;		
	}

	public ArrayList<HotelVO> client_setLocation(String location) {
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public ArrayList<HotelVO> client_searchHotel() {
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public HotelVO client_checkHotelInfo() {
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		return hotel;
	}


	public ResultMessage client_evaluateHotel() {
		return ResultMessage.Success;
	}

	public ResultMessage client_enrollVIP() {
		return ResultMessage.Success;
	}
}

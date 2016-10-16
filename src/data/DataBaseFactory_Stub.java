package data;

import PO.ClientPO;
import PO.HotelPO;
import PO.HotelStrategyPO;
import PO.HotelWorkerPO;
import PO.OrderPO;
import PO.UserPO;
import PO.WebManagerPO;
import PO.WebMarketPO;
import PO.WebStrategyPO;

public class DataBaseFactory_Stub {

	
//	public ClientPO getClientDatabase (){
//		String clientname;
//		String contact;
//		int credit;
//		String credit_record;
//		int memberid;
//		String member_type;
//		String birthday;
//		String company;
//		ClientPO clientPO = new ClientPO(clientname, contact, credit, credit_record, memberid, member_type, birthday, company);
//		return clientPO;
//	}
	
	
	//public HotelPO getHotelDatabase ();
	
	
	//public WebManagerPO getManageDatabase ();
	
	
	public UserPO getUserDatabase (){
		int id =0 ;
		String password = "";
		UserPO userpo = new UserPO (id ,password);
		return userpo;
	}
	
	
	public OrderPO getOrderDatabase (){
		int id = 0;
		String state = "";
		boolean execute = true;
		String hotel = "";
		String start_time = "";
		String end_time = "";
		String latest_execute_time = "";
		String room_type = "";
		int room_number =0;
		String strategy = "";
		int price = 0;
		int expect_number_of_people = 0;
		OrderPO orderpo  = new OrderPO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
		return orderpo; 
	}
	
	
	public WebStrategyPO getWebStrategyDatabase (){
		String name = "";
		String condition = "";
		String start_time = "";
		String end_time = "";
		String executeway = "";
		boolean superposition = true;
		WebStrategyPO webstrategypo = new WebStrategyPO(name,condition,start_time,end_time,executeway,superposition);
		return webstrategypo;
	}
	
	
	public HotelStrategyPO getHotelStrategyDatabase(){
		String name = "";
		String condition = "";
		String start_time = "";
		String end_time = "";
		String executeway = "";
		boolean superposition = true;
		HotelStrategyPO hotelstrategypo = new HotelStrategyPO(name,condition,start_time,end_time,executeway,superposition);
		return hotelstrategypo;
	}
	
	
	//public HotelWorkerPO getHotelWorkerDatabase();
	
	
	//public WebMarketPO getWebMarketDatabase();
}

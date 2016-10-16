package logiccontroller;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;

public class ClientController implements ClientBLService{
	//客户信息
		String client_name="张三";
		String contact="11111111111";
		int credit=0;
		String credit_record="无";
		int memberid=000001;
		String member_type="PERSON";
		String birthday="1997-7-1";
		String company="南京大学";
		
		//酒店信息
		String address="南京";
		String business_address="新街口";
		String hotel_name="如家";
		String introduction="好";
		String service="好";
		String room_state="未预定";
		String room_type="双人房";
		int room_number=1;
		int room_price=200;
		String order="无";
		String evaluation="无";
		
	public ClientVO client_checkInfo(){
		ClientVO client=new ClientVO(client_name,contact,credit,credit_record,memberid,member_type,birthday,company);
		return client;		
	}
	
	public ResultMessage client_updateInfo(String input){
		if(input!=null){
		return ResultMessage.Success;
		}
		else{
			return ResultMessage.Fail;
		}
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


	public ArrayList<HotelVO> client_searchHotel(String condition) {
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public HotelVO client_checkHotelInfo() {
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		return hotel;
	}


	public ResultMessage client_evaluateHotel(String evaluation) {
		if(evaluation!=null){
		return ResultMessage.Success;
		}
		else{
			return ResultMessage.Fail;
		}
	}

	public ResultMessage client_enrollVIP(String info) {
		if(info!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
}

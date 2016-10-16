package logiccontroller;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;

public class ClientController implements ClientBLService{
	//�ͻ���Ϣ
		String client_name="����";
		String contact="11111111111";
		int credit=0;
		String credit_record="��";
		int memberid=000001;
		String member_type="PERSON";
		String birthday="1997-7-1";
		String company="�Ͼ���ѧ";
		
		//�Ƶ���Ϣ
		String address="�Ͼ�";
		String business_address="�½ֿ�";
		String hotel_name="���";
		String introduction="��";
		String service="��";
		String room_state="δԤ��";
		String room_type="˫�˷�";
		int room_number=1;
		int room_price=200;
		String order="��";
		String evaluation="��";
		
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

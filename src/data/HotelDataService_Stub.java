
package data;

import java.util.ArrayList;

import PO.HotelPO;
import PO.HotelWorkerPO;
import businesslogicsevice.ResultMessage;
import dataservice.HotelDataService;

public class HotelDataService_Stub implements HotelDataService {
	

	String address;
	String bussiness_address;
	String hotelname;
	String introduction;
	String service;
	String room_state;
	String room_type;
	int room_number;
	int room_price;
	String order;
	String evaluation;
	
	String hotelworkername;
	String hotelworkercontact;
	
	public HotelDataService_Stub(String address, String bussiness_address, String hotelname, String introduction,
			String service, String room_state, String room_type, int room_number, int room_price, String order,
			String evaluation, String hotelworkername, String hotelworkercontact) {
		this.address = address;
		this.bussiness_address = bussiness_address;
		this.hotelname = hotelname;
		this.introduction = introduction;
		this.service = service;
		this.room_state = room_state;
		this.room_type = room_type;
		this.room_number = room_number;
		this.room_price = room_price;
		this.order = order;
		this.evaluation = evaluation;
		this.hotelworkername = hotelworkername;
		this.hotelworkercontact = hotelworkercontact;
	}
	
	@Override
	public HotelPO find(String hotelname) {
		HotelPO hotelPO = new HotelPO(address, bussiness_address,
				hotelname, introduction, service, room_state, room_type, 
				room_number,room_price, order, evaluation);
		return hotelPO;
	}

	@Override
	public ResultMessage insert(HotelPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage update(HotelPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage delete(HotelPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ArrayList<HotelPO> showClientHotels(int clientid) {
		ArrayList<HotelPO> hotelPOs = new ArrayList<HotelPO>();
		hotelPOs.add(new HotelPO(address, bussiness_address, hotelname,
				introduction, service, room_state, room_type, 
				room_number, room_price, order, evaluation));
		return hotelPOs;
	}

	@Override
	public HotelWorkerPO findHotelWorker(String hotelname) {
		HotelWorkerPO hotelWorkerPO = new HotelWorkerPO(hotelworkername, hotelworkercontact, hotelname);
		return hotelWorkerPO;
	}

	@Override
	public ResultMessage insertHotelWorker(String hotelname, HotelWorkerPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage updateHotelWorker(String hotelname, HotelWorkerPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage deleteHotelWorker(String hotelname, HotelWorkerPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

}


package MockObject;

import logiccontroller.HotelController;

public class MockHotel1 extends HotelController{
	int hotel_id;
	public MockHotel1 (int id){
		hotel_id=id;
	}
	public int gethotel_id(){
		return hotel_id;
	}
}

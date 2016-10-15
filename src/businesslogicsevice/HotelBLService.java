package businesslogicsevice;

import VO.HotelVO;

public interface HotelBLService {
	public HotelVO hotel_checkInfo();
	public ResultMessage hotel_updateInfo(HotelVO vo);
	public ResultMessage hotel_importRoom(String Room);
	public ResultMessage hotel_updateAccomodation(String AccomodationInfo);
	
}

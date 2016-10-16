package businesslogicsevice;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;

public interface ClientBLService {
	//客户查看个人基本信息
	public ClientVO client_checkInfo();
	//客户更新个人基本信息
	public ResultMessage client_updateInfo(String input);
	//客户查看预订过的酒店
	public ArrayList<HotelVO> client_getpreviousHotelList();
	//客户查看信用记录
	public String client_checkCredit();
	//客户用地址和商圈搜索酒店
	public ArrayList<HotelVO> client_setLocation(String location);
	//客户添加其他条件搜索酒店
	public ArrayList<HotelVO> client_searchHotel(String condition);
	//客户查看酒店详细信息
	public HotelVO client_checkHotelInfo();
	//客户评价酒店
	public ResultMessage client_evaluateHotel(String evaluation);
	//客户注册会员
	public ResultMessage client_enrollVIP(String info);
}

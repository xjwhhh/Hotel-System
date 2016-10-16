package dataservice;

import PO.ClientPO;
import PO.HotelPO;
import PO.HotelStrategyPO;
import PO.HotelWorkerPO;
import PO.OrderPO;
import PO.UserPO;
import PO.WebManagerPO;
import PO.WebMarketPO;
import PO.WebStrategyPO;

public interface DataBaseFactory {
	
	
	public ClientPO getClientDatabase ();
	
	
	public HotelPO getHotelDatabase ();
	
	
	public WebManagerPO getManageDatabase ();
	
	
	public UserPO getUserDatabase ();
	
	
	public OrderPO getOrderDatabase ();
	
	
	public WebStrategyPO getWebStrategyDatabase ();
	
	
	public HotelStrategyPO getHotelStrategyDatabase();
	
	
	public HotelWorkerPO getHotelWorkerDatabase();
	
	
	public WebMarketPO getWebMarketDatabase();
}

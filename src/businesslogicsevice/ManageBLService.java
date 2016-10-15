package businesslogicsevice;

import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;

public interface ManageBLService {
	
	public ClientVO manage_searchClient(int client_id);
	public ResultMessage manage_updateClient(int client_id);
	public ResultMessage manage_addHotel(String hotel_name);
	public ResultMessage manage_addHotelWorker(String hotel_name,HotelWorkerVO w);
	public HotelWorkerVO manage_searchHotelWorker(String hotel_name);
	public ResultMessage manage_updateHotelWorker(String hotel_name);
	public ResultMessage manage_addMarketWorker(WebMarketVO mw);
	public WebMarketVO manage_searchMarketWorker(int marketWorker_id);
	public ResultMessage manage_web_updateMarketWorker(WebMarketVO mw);
	
}

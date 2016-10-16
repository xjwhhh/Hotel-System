package businesslogicsevice;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;

public   interface StrategyBLService {
	//酒店工作人员制定销售策略
	public HotelStrategyVO hotelstrategy_make(String input);
	//酒店工作人员更新销售策略
	public ResultMessage hotelstrategy_update(String input);
	//网站营销人员制定销售策略
	public WebStrategyVO webstrategy_make(String input);
	//网站营销人员更新销售策略
	public ResultMessage webstrategy_update(String input);
}

package businesslogicsevice;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;

public   interface StrategyBLService {
	public HotelStrategyVO hotelstrategy_make();
	//酒店工作人员更新销售策略
	public ResultMessage hotelstrategy_update();
	//网站营销人员制定销售策略
	public WebStrategyVO webstrategy_make();
	//网站营销人员更新销售策略
	public ResultMessage webstrategy_update();
}

package businesslogic;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.StrategyBLService;



 public class StrategyBLService_Stub implements StrategyBLService{
	
	//酒店工作人员制定促销策略
	public HotelStrategyVO hotelstrategy_make(){
		HotelStrategyVO hotelstrategy=new HotelStrategyVO("开业酬宾","无","2016-10-14-0:00","2016-10-20-0:00","九折",false);
		return hotelstrategy;
	}
	//酒店工作人员更新销售策略
	public ResultMessage hotelstrategy_update(){
		return ResultMessage.Success;
	}
	//网站营销人员制定销售策略
	public WebStrategyVO webstrategy_make(){
		WebStrategyVO webstrategy=new WebStrategyVO("开业酬宾","无","2016-10-14-0:00","2016-10-20-0:00","九折",false);
		return webstrategy;
	}
	//网站营销人员更新销售策略
	public ResultMessage webstrategy_update(){
		return ResultMessage.Success;
	}
}

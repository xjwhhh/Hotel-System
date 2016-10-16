package view;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;
import businesslogic.StrategyBLService_Stub;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.StrategyBLService;

public class StrategyView {
	public StrategyView(){
		
		StrategyBLService strategyBL = new StrategyBLService_Stub("开业酬宾","无","2016-10-14-0:00","2016-10-20-0:00","九折",false
				,"开业酬宾","无","2016-10-14-0:00","2016-10-20-0:00","九折",false);
		
		//酒店工作人员制定促销策略
				HotelStrategyVO hotelstrategy=strategyBL.hotelstrategy_make("input");
				System.out.println(hotelstrategy.getname());
				System.out.println(hotelstrategy.getcondition());
				System.out.println(hotelstrategy.getstart_time());
				System.out.println(hotelstrategy.getend_time());
				System.out.println(hotelstrategy.getexecuteway());
				System.out.println(hotelstrategy.getsuperposition());
				
				//酒店工作人员更新销售策略
				ResultMessage result_hotel=strategyBL.hotelstrategy_update("input");
				if(result_hotel==ResultMessage.Success){
					System.out.println("更新成功");
				}
				else{
					System.out.println("更新失败");
				}
				
				//网站营销人员制定促销策略
				WebStrategyVO webstrategy=strategyBL.webstrategy_make("input");
				System.out.println(webstrategy.getname());
				System.out.println(webstrategy.getcondition());
				System.out.println(webstrategy.getstart_time());
				System.out.println(webstrategy.getend_time());
				System.out.println(webstrategy.getexecuteway());
				System.out.println(webstrategy.getsuperposition());
				
				//网站营销人员更新促销策略
				ResultMessage result_web=strategyBL.hotelstrategy_update("input");
				if(result_web==ResultMessage.Success){
					System.out.println("更新成功");
				}
				else{
					System.out.println("更新失败");
				}
				
	}
}

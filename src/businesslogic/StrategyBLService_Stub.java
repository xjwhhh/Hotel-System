package businesslogic;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.StrategyBLService;



 public class StrategyBLService_Stub implements StrategyBLService{
	//酒店策略信息
			String hotelname;
			String hotelcondition;
			String hotelstart_time;
			String hotelend_time;
			String hotelexecuteway;
			boolean hotelsuperposition;
			
	    //网站策略信息
	    String webname;
		String webcondition;
		String webstart_time;
		String webend_time;
		String webexecuteway;
		boolean websuperposition;
		
		
		
	public StrategyBLService_Stub(String a,String b,String c,String d,String e,boolean f,
			String g,String h,String i,String j,String k,boolean l){
		hotelname=a;
		hotelcondition=b;
		hotelstart_time=c;
		hotelend_time=d;
		hotelexecuteway=e;
		hotelsuperposition=f;
		
		webname=g;
		webcondition=h;
		webstart_time=i;
		webend_time=j;
		webexecuteway=k;
		websuperposition=l;
	}
		
	//酒店工作人员制定促销策略
	public HotelStrategyVO hotelstrategy_make(String input){
		HotelStrategyVO hotelstrategy=new HotelStrategyVO(hotelname,hotelcondition,hotelstart_time,hotelend_time,hotelexecuteway,hotelsuperposition);
		return hotelstrategy;
	}
	//酒店工作人员更新销售策略
	public ResultMessage hotelstrategy_update(String input){
		if(input!=null){
		return ResultMessage.Success;
		}
		else{
			return ResultMessage.Fail;
		}
	}
	//网站营销人员制定销售策略
	public WebStrategyVO webstrategy_make(String input){
		WebStrategyVO webstrategy=new WebStrategyVO(webname,webcondition,webstart_time,webend_time,webexecuteway,websuperposition);
		return webstrategy;
	}
	//网站营销人员更新销售策略
	public ResultMessage webstrategy_update(String input){
		if(input!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
}

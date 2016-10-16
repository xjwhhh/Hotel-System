package data;

import java.util.ArrayList;

import PO.HotelStrategyPO;
import PO.WebStrategyPO;
import businesslogicsevice.ResultMessage;
import dataservice.StrategyDataService;

public class StrategyDataService_Stub implements StrategyDataService{
	String name;
	String condition;
	String start_time;
	String end_time;
	String executeway;
	boolean superposition;
	
	
	//根据酒店name查找对应酒店策略
		public HotelStrategyPO find_hotel(String name){
			HotelStrategyPO hotelstrategypo = new HotelStrategyPO(name,condition,start_time,end_time,executeway,superposition);
			return hotelstrategypo;
		}
		
		//添加酒店策略
		public ResultMessage insert_hotel(HotelStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		
		//删除酒店策略
		public ResultMessage delete_hotel(HotelStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		
		//更新酒店策略
		public ResultMessage update_hotel(HotelStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//查看酒店策略列表
		public ArrayList<HotelStrategyPO> showlist_hotel(){
			ArrayList<HotelStrategyPO> hotelstrategyPOs = new ArrayList<HotelStrategyPO>();
			hotelstrategyPOs.add(new HotelStrategyPO(name,condition,start_time,end_time,executeway,superposition));
			return hotelstrategyPOs;
		}
		
		//查询网站策略
		public WebStrategyPO find_web(String name){
			WebStrategyPO webstrategypo = new WebStrategyPO(name,condition,start_time,end_time,executeway,superposition);
			return webstrategypo;
		}
		
		//添加网站策略
		public ResultMessage insert_web(WebStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//删除网站策略
		public ResultMessage delete_web(WebStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//更新网站策略
		public ResultMessage update_web(WebStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//查看网站策略列表
		public ArrayList<WebStrategyPO> showlist_web(){
			ArrayList<WebStrategyPO> webstrategyPOs = new ArrayList<WebStrategyPO>();
			webstrategyPOs.add(new WebStrategyPO(name,condition,start_time,end_time,executeway,superposition));
			return webstrategyPOs;
		}
}

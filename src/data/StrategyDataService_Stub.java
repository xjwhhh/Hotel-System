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
	
	
	//���ݾƵ�name���Ҷ�Ӧ�Ƶ����
		public HotelStrategyPO find_hotel(String name){
			HotelStrategyPO hotelstrategypo = new HotelStrategyPO(name,condition,start_time,end_time,executeway,superposition);
			return hotelstrategypo;
		}
		
		//��ӾƵ����
		public ResultMessage insert_hotel(HotelStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		
		//ɾ���Ƶ����
		public ResultMessage delete_hotel(HotelStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		
		//���¾Ƶ����
		public ResultMessage update_hotel(HotelStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//�鿴�Ƶ�����б�
		public ArrayList<HotelStrategyPO> showlist_hotel(){
			ArrayList<HotelStrategyPO> hotelstrategyPOs = new ArrayList<HotelStrategyPO>();
			hotelstrategyPOs.add(new HotelStrategyPO(name,condition,start_time,end_time,executeway,superposition));
			return hotelstrategyPOs;
		}
		
		//��ѯ��վ����
		public WebStrategyPO find_web(String name){
			WebStrategyPO webstrategypo = new WebStrategyPO(name,condition,start_time,end_time,executeway,superposition);
			return webstrategypo;
		}
		
		//�����վ����
		public ResultMessage insert_web(WebStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//ɾ����վ����
		public ResultMessage delete_web(WebStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//������վ����
		public ResultMessage update_web(WebStrategyPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//�鿴��վ�����б�
		public ArrayList<WebStrategyPO> showlist_web(){
			ArrayList<WebStrategyPO> webstrategyPOs = new ArrayList<WebStrategyPO>();
			webstrategyPOs.add(new WebStrategyPO(name,condition,start_time,end_time,executeway,superposition));
			return webstrategyPOs;
		}
}

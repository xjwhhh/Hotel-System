package businesslogic;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.StrategyBLService;



 public class StrategyBLService_Stub implements StrategyBLService{
	
	//�Ƶ깤����Ա�ƶ���������
	public HotelStrategyVO hotelstrategy_make(){
		HotelStrategyVO hotelstrategy=new HotelStrategyVO("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		return hotelstrategy;
	}
	//�Ƶ깤����Ա�������۲���
	public ResultMessage hotelstrategy_update(){
		return ResultMessage.Success;
	}
	//��վӪ����Ա�ƶ����۲���
	public WebStrategyVO webstrategy_make(){
		WebStrategyVO webstrategy=new WebStrategyVO("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		return webstrategy;
	}
	//��վӪ����Ա�������۲���
	public ResultMessage webstrategy_update(){
		return ResultMessage.Success;
	}
}

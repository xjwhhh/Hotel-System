package view;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;
import businesslogic.StrategyBLService_Stub;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.StrategyBLService;

public class StrategyView {
	public StrategyView(){
		
		StrategyBLService strategyBL = new StrategyBLService_Stub("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false
				,"��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		
		//�Ƶ깤����Ա�ƶ���������
				HotelStrategyVO hotelstrategy=strategyBL.hotelstrategy_make("input");
				System.out.println(hotelstrategy.getname());
				System.out.println(hotelstrategy.getcondition());
				System.out.println(hotelstrategy.getstart_time());
				System.out.println(hotelstrategy.getend_time());
				System.out.println(hotelstrategy.getexecuteway());
				System.out.println(hotelstrategy.getsuperposition());
				
				//�Ƶ깤����Ա�������۲���
				ResultMessage result_hotel=strategyBL.hotelstrategy_update("input");
				if(result_hotel==ResultMessage.Success){
					System.out.println("���³ɹ�");
				}
				else{
					System.out.println("����ʧ��");
				}
				
				//��վӪ����Ա�ƶ���������
				WebStrategyVO webstrategy=strategyBL.webstrategy_make("input");
				System.out.println(webstrategy.getname());
				System.out.println(webstrategy.getcondition());
				System.out.println(webstrategy.getstart_time());
				System.out.println(webstrategy.getend_time());
				System.out.println(webstrategy.getexecuteway());
				System.out.println(webstrategy.getsuperposition());
				
				//��վӪ����Ա���´�������
				ResultMessage result_web=strategyBL.hotelstrategy_update("input");
				if(result_web==ResultMessage.Success){
					System.out.println("���³ɹ�");
				}
				else{
					System.out.println("����ʧ��");
				}
				
	}
}

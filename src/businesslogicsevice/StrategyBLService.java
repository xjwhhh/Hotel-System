package businesslogicsevice;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;

public   interface StrategyBLService {
	//�Ƶ깤����Ա�ƶ����۲���
	public HotelStrategyVO hotelstrategy_make(String input);
	//�Ƶ깤����Ա�������۲���
	public ResultMessage hotelstrategy_update(String input);
	//��վӪ����Ա�ƶ����۲���
	public WebStrategyVO webstrategy_make(String input);
	//��վӪ����Ա�������۲���
	public ResultMessage webstrategy_update(String input);
}

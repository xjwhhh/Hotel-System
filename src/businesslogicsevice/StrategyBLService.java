package businesslogicsevice;

import VO.HotelStrategyVO;
import VO.WebStrategyVO;

public   interface StrategyBLService {
	public HotelStrategyVO hotelstrategy_make();
	//�Ƶ깤����Ա�������۲���
	public ResultMessage hotelstrategy_update();
	//��վӪ����Ա�ƶ����۲���
	public WebStrategyVO webstrategy_make();
	//��վӪ����Ա�������۲���
	public ResultMessage webstrategy_update();
}

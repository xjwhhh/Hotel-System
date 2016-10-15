package dataservice;

import PO.WebManagerPO;
import PO.WebMarketPO;
import businesslogicsevice.ResultMessage;

public interface ManageDataService {
	//根据id查找网站营销人员
	public WebMarketPO findWebMarket(int webmarketid);
	
	//添加网站营销人员
	public ResultMessage insertWebMarket(WebMarketPO po);
	
	//更新网站营销人员信息
	public ResultMessage updateWebMarket(WebMarketPO po);
	
	//删除网站营销人员
	public ResultMessage deleteWebMarket(WebMarketPO po);
	
	//根据id查找网站管理人员
	public WebManagerPO findWebManager(int webmanagerid);
	
	//添加网站管理人员
	public ResultMessage insertWebManager(WebManagerPO po);
	
	//更新网站管理人员信息
	public ResultMessage updateWebManager(WebManagerPO po);
	
	//删除网站管理人员
	public ResultMessage deleteWebManager(WebManagerPO po);
	
}

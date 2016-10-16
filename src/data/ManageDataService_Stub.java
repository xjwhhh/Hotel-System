
package data;

import PO.WebManagerPO;
import PO.WebMarketPO;
import businesslogicsevice.ResultMessage;
import dataservice.ManageDataService;

public class ManageDataService_Stub implements ManageDataService {
	

	String webmarketname;
	String webmarketcontact;
	
	String webmanagername;
	String webmanagercontact;
	
	public ManageDataService_Stub(String webmarketname, String webmarketcontact, String webmanagername,
			String webmanagercontact) {
		this.webmarketname = webmarketname;
		this.webmarketcontact = webmarketcontact;
		this.webmanagername = webmanagername;
		this.webmanagercontact = webmanagercontact;
	}
	
	@Override
	public WebMarketPO findWebMarket(String webmarketname) {
		WebMarketPO webMarketPO = new WebMarketPO(webmarketname, webmarketcontact);
		return webMarketPO;
	}

	@Override
	public ResultMessage insertWebMarket(WebMarketPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage updateWebMarket(WebMarketPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage deleteWebMarket(WebMarketPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public WebManagerPO findWebManager(String webmanagername) {
		WebManagerPO webManagerPO = new WebManagerPO(webmanagername, webmanagercontact);
		return webManagerPO;
	}

	@Override
	public ResultMessage insertWebManager(WebManagerPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage updateWebManager(WebManagerPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage deleteWebManager(WebManagerPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

}


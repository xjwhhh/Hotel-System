package businesslogic;

import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;
import businesslogicsevice.ManageBLService;
import businesslogicsevice.ResultMessage;

public class ManageBLService_Stub implements ManageBLService {
	
	//用户的信息参数
	String client_name;
	String client_contact;
	int client_credit;
	String credit_record;
	int client_memberid;
	String client_member_type;
	String client_birthday;
	String client_company;
	
	//酒店工作人员的信息参数
	String hotelWorker_name;
	int hotelWorker_contact;
	String hotelWorker_hotel;
	
	//网站营销人员信息参数
	String MarketWorker_name;
	int MarketWorker_contact;
	
	public ManageBLService_Stub(String cn,String ccontact,int ccredit,String cr,int m_id,
			String m_lev,String cb,String ccompany,String hwn,int hwccontact,String hwh,
			String mwn,int mwccontact){
		client_name = cn;
		client_contact = ccontact;
		client_credit = ccredit;
		credit_record = cr;
		client_memberid = m_id;
		client_member_type = m_lev;
		client_birthday = cb;
		client_company = ccompany;
		
		hotelWorker_name = hwn;
		hotelWorker_contact = hwccontact;
		hotelWorker_hotel = hwh;
		
		MarketWorker_name = mwn;
		MarketWorker_contact = mwccontact;
	}
	
	@Override
	//网站管理人员搜索客户，查看客户信息
	public ClientVO manage_searchClient(int client_id){
		// TODO Auto-generated method stub
		return new ClientVO(client_name,client_contact,client_credit,credit_record,client_memberid,
				client_member_type,client_birthday,client_company);
	}

	@Override
	//网站管理人员更新客户信息
	public ResultMessage manage_updateClient(int client_id) {
		// TODO Auto-generated method stub
		if(client_id==1)
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//网站管理人员添加酒店
	public ResultMessage manage_addHotel(String hotel_name) {
		// TODO Auto-generated method stub
		if(hotel_name=="如家")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//网站管理人员添加酒店工作人员
	public ResultMessage manage_addHotelWorker(String hotel_name, HotelWorkerVO w) {
		// TODO Auto-generated method stub
		if(hotel_name==w.gethotel())
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//网站管理人员搜索酒店工作人员
	public HotelWorkerVO manage_searchHotelWorker(String hotel_name) {
		// TODO Auto-generated method stub
		return new HotelWorkerVO(hotelWorker_name,hotelWorker_contact,hotelWorker_hotel);
	}

	@Override
	//网站管理人员更新酒店工作人员
	public ResultMessage manage_updateHotelWorker(String hotel_name) {
		// TODO Auto-generated method stub
		if(hotel_name=="如家")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//网站管理人员添加网站营销人员
	public ResultMessage manage_addMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		if(mw.getname()=="张三")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//网站管理人员搜索网站营销人员
	public WebMarketVO manage_searchMarketWorker(int marketWorker_id) {
		// TODO Auto-generated method stub
		return new WebMarketVO(MarketWorker_name,MarketWorker_contact);
	}

	@Override
	//网站管理人员更新网站营销人员信息
	public ResultMessage manage_web_updateMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		if(mw.getname()=="张三")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

}

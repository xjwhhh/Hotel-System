package businesslogic;

import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;
import businesslogicsevice.ManageBLService;
import businesslogicsevice.ResultMessage;

public class ManageBLService_Stub implements ManageBLService {
	
	//�û�����Ϣ����
	String client_name;
	String client_contact;
	int client_credit;
	String credit_record;
	int client_memberid;
	String client_member_type;
	String client_birthday;
	String client_company;
	
	//�Ƶ깤����Ա����Ϣ����
	String hotelWorker_name;
	int hotelWorker_contact;
	String hotelWorker_hotel;
	
	//��վӪ����Ա��Ϣ����
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
	//��վ������Ա�����ͻ����鿴�ͻ���Ϣ
	public ClientVO manage_searchClient(int client_id){
		// TODO Auto-generated method stub
		return new ClientVO(client_name,client_contact,client_credit,credit_record,client_memberid,
				client_member_type,client_birthday,client_company);
	}

	@Override
	//��վ������Ա���¿ͻ���Ϣ
	public ResultMessage manage_updateClient(int client_id) {
		// TODO Auto-generated method stub
		if(client_id==1)
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//��վ������Ա��ӾƵ�
	public ResultMessage manage_addHotel(String hotel_name) {
		// TODO Auto-generated method stub
		if(hotel_name=="���")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//��վ������Ա��ӾƵ깤����Ա
	public ResultMessage manage_addHotelWorker(String hotel_name, HotelWorkerVO w) {
		// TODO Auto-generated method stub
		if(hotel_name==w.gethotel())
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//��վ������Ա�����Ƶ깤����Ա
	public HotelWorkerVO manage_searchHotelWorker(String hotel_name) {
		// TODO Auto-generated method stub
		return new HotelWorkerVO(hotelWorker_name,hotelWorker_contact,hotelWorker_hotel);
	}

	@Override
	//��վ������Ա���¾Ƶ깤����Ա
	public ResultMessage manage_updateHotelWorker(String hotel_name) {
		// TODO Auto-generated method stub
		if(hotel_name=="���")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//��վ������Ա�����վӪ����Ա
	public ResultMessage manage_addMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		if(mw.getname()=="����")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

	@Override
	//��վ������Ա������վӪ����Ա
	public WebMarketVO manage_searchMarketWorker(int marketWorker_id) {
		// TODO Auto-generated method stub
		return new WebMarketVO(MarketWorker_name,MarketWorker_contact);
	}

	@Override
	//��վ������Ա������վӪ����Ա��Ϣ
	public ResultMessage manage_web_updateMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		if(mw.getname()=="����")
			return ResultMessage.Success;
		else return ResultMessage.Fail;
	}

}

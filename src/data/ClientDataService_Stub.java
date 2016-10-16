
package data;

import PO.ClientPO;
import businesslogicsevice.ResultMessage;
import dataservice.ClientDataService;

public class ClientDataService_Stub implements ClientDataService{

	String clientname;
	String contact;
	int credit;
	String credit_record;
	int memberid;
	String member_type;
	String birthday;
	String company;
	
	public ClientDataService_Stub(String clientname, String contact, int credit, String credit_record, int memberid,
			String member_type, String birthday, String company) {
		this.clientname = clientname;
		this.contact = contact;
		this.credit = credit;
		this.credit_record = credit_record;
		this.memberid = memberid;
		this.member_type = member_type;
		this.birthday = birthday;
		this.company = company;
	}
	
	@Override
	public ClientPO find(int clientid) {
		ClientPO clientPO = new ClientPO(clientname, contact, credit, credit_record, memberid, member_type, birthday, company);
		return clientPO;
	}

	@Override
	public ResultMessage insert(ClientPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage update(ClientPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage delete(ClientPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}

	@Override
	public ResultMessage updateCredit(ClientPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}
		else
			return ResultMessage.Fail;
	}
	
}

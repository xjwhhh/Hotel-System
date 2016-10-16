package businesslogicsevice;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;

public interface ClientBLService {
	//�ͻ��鿴���˻�����Ϣ
	public ClientVO client_checkInfo();
	//�ͻ����¸��˻�����Ϣ
	public ResultMessage client_updateInfo(String input);
	//�ͻ��鿴Ԥ�����ľƵ�
	public ArrayList<HotelVO> client_getpreviousHotelList();
	//�ͻ��鿴���ü�¼
	public String client_checkCredit();
	//�ͻ��õ�ַ����Ȧ�����Ƶ�
	public ArrayList<HotelVO> client_setLocation(String location);
	//�ͻ�����������������Ƶ�
	public ArrayList<HotelVO> client_searchHotel(String condition);
	//�ͻ��鿴�Ƶ���ϸ��Ϣ
	public HotelVO client_checkHotelInfo();
	//�ͻ����۾Ƶ�
	public ResultMessage client_evaluateHotel(String evaluation);
	//�ͻ�ע���Ա
	public ResultMessage client_enrollVIP(String info);
}

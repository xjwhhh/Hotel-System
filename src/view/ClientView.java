package view;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;
import businesslogic.ClientBLService_Stub;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;

public class ClientView {
	public ClientView(){
		
		ClientBLService clientBL = new ClientBLService_Stub("����","100000",100,"�޼�¼",1,"��ͨ��Ա","01-01","�ȸ�",
				"ѧ��·��ӥ15��","ѧ��·��Ȧ","��ͥ","�۸��Żݻ�������","�ṩס��ϴԡ","����",
				"���ͷ�",5,300,"01","����");
		
		//����client_checkInfo
				ClientVO vo = clientBL.client_checkInfo();
				System.out.println(vo.getname());
				System.out.println(vo.getcontact());
				System.out.println(vo.getcredit());
				System.out.println(vo.getcredit_record());
				System.out.println(vo.getmemberid());
				System.out.println(vo.getmember_type());
				if(vo.getmember_type().equals("PERSON"))
					System.out.println(vo.getbirthday());
				else
					System.out.println(vo.getcompany());

				//����client_updateInfo
				ResultMessage resultMessage = clientBL.client_updateInfo("input");
				if(resultMessage==ResultMessage.Success){
					System.out.println("���¿ͻ���Ϣ�ɹ�");
				}
				else {
					System.out.println("���¿ͻ���Ϣʧ��");
				}

				//����client_getpreviousHotelList
				ArrayList<HotelVO> list = clientBL.client_getpreviousHotelList();
				HotelVO vo2 = null;
				if(list.isEmpty()){
					System.out.println("�ͻ�δ��Ԥ�����Ƶ�");
				}
				else{
					for(int i=0;i<list.size();i++){
						vo2 = list.get(i);
						System.out.println(vo2.getname());
						System.out.println(vo2.getevaluation());
					}
				}

				//����client_checkCredit
				String credit_record = clientBL.client_checkCredit();
				System.out.println(credit_record);

				//����client_setLocation
				list = clientBL.client_setLocation("�Ͼ�");
				for(int i=0;i<list.size();i++){
					vo2 = list.get(i);
					System.out.println(vo2.getname());
					System.out.println(vo2.getevaluation());
				}

				//����client_searchHotel
				list = clientBL.client_searchHotel("condition");
				for(int i=0;i<list.size();i++){
					vo2 = list.get(i);
					System.out.println(vo2.getname());
					System.out.println(vo2.getevaluation());
				}

				//����client_checkHotelInfo
				vo2 = clientBL.client_checkHotelInfo();
				System.out.println(vo2.getname());
				System.out.println(vo2.getaddress());
				System.out.println(vo2.getbussiness_address());
				System.out.println(vo2.getintroduction());
				System.out.println(vo2.getservice());
				//�˴�ʡ��һ�������
				//������

				//����client_evaluateHotel
				resultMessage = clientBL.client_evaluateHotel("evaluation");
				if(resultMessage == ResultMessage.Success){
					System.out.println("���۳ɹ�");
				}
				else
					System.out.println("����ʧ��");

				//����client_enrollVIP
				resultMessage = clientBL.client_enrollVIP("info");
				if(resultMessage == ResultMessage.Success)
					System.out.println("ע���Ա�ɹ�");
				else
					System.out.println("ע���Աʧ��");
				
	}
}

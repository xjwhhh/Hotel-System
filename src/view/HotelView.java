package view;

import VO.HotelVO;
import businesslogic.HotelBLService_Stub;
import businesslogicsevice.HotelBLService;
import businesslogicsevice.ResultMessage;

public class HotelView {
	public HotelView(){
		
		HotelBLService hotelBL = new HotelBLService_Stub("ѧ��·��ӥ15��","ѧ��·��Ȧ","��ͥ",
				"�۸��Żݻ�������","�ṩס��ϴԡ","����","���ͷ�",5,300,"01","����");
		
		//����hotel_checkInfo
				HotelVO hotelVO = hotelBL.hotel_checkInfo();
				System.out.println(hotelVO.getname());
				System.out.println(hotelVO.getaddress());
				System.out.println(hotelVO.getbussiness_address());
				System.out.println(hotelVO.getintroduction());
				System.out.println(hotelVO.getservice());
				System.out.println(hotelVO.getevaluation());
				System.out.println(hotelVO.getroom_state());
				System.out.println(hotelVO.getorder());
				System.out.println(hotelVO.getroom_type());
				System.out.println(hotelVO.getroom_price());
				System.out.println(hotelVO.getroom_number());

				

				//����hotel_updateInfo
				ResultMessage resultMessage = hotelBL.hotel_updateInfo(
						new HotelVO("�Ͼ�","�½ֿ�", "���", "��ҾƵ�", "�Ƶ����з���", "����", "˫�˷�", 1, 100, "", "good"));
				if(resultMessage == ResultMessage.Success){
					System.out.println("���¾Ƶ���Ϣ�ɹ�");
				}
				else {
					System.out.println("���¾Ƶ���Ϣʧ��");
				}

				

				//����hotel_importRoom
				resultMessage = hotelBL.hotel_importRoom("˫�˷�");
				if (resultMessage==ResultMessage.Success) {
					System.out.println("¼����÷���ɹ�");
				}
				else {
					System.out.println("¼����÷���ʧ��");
				}

				

				//����hotel_updateAccomdation
				resultMessage = hotelBL.hotel_updateAccomodation("һ����ס����001��");
				if (resultMessage == ResultMessage.Success) {
					System.out.println("������ס��Ϣ�ɹ�");
				}
				else {
					System.out.println("������ס��Ϣʧ��");
				}
				
	}
}

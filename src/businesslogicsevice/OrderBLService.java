package businesslogicsevice;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;

public interface OrderBLService {
	//�ͻ��������
		public ArrayList<OrderVO> order_client_browse();
		
		//�Ƶ깤����Ա�������
		public ArrayList<OrderVO> order_hotel_browse();
		
		//�ͻ���������
		public ResultMessage order_client_cancel();
		
		//�ͻ����ɶ���
		public OrderVO order_client_generate(String input);
		
		//�Ƶ깤����Աִ�ж���
		public ResultMessage order_hotel_execute(ClientVO c);
}

package businesslogicsevice;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;

public interface OrderBLService {
		//�ͻ��������
		public ArrayList<OrderVO> order_client_browse(int client_id);
		
		//�Ƶ깤����Ա�������
		public ArrayList<OrderVO> order_hotel_browse(int hotel_id);
		
		//�ͻ���������
		public ResultMessage order_client_cancel(int order_id);
		
		//�ͻ����ɶ���
		public OrderVO order_client_generate(OrderVO order);
		
		//�Ƶ깤����Աִ�ж���
		public ResultMessage order_hotel_execute(int order_id);
		
		//��վӪ����Ա����쳣����
		public ArrayList<OrderVO> order_market_browseUnfilled();
		
		//��վӪ����Ա�����쳣����
		public ResultMessage order_market_cancelAbnormal(int order_id);
		
		//���㶩���ܼ�
		public int order_calculateTotal(OrderVO order);
}

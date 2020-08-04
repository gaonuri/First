package classpart;

public class Order {

	public static void main(String[] args) {
		
		OrderInfo orderInfo = new OrderInfo();
		
		orderInfo.orderNum = "201803120001";
		orderInfo.orderID = "abc123";
		orderInfo.orderDate = "2018년 3월12일";
		orderInfo.orderName = "홍길순";
		orderInfo.productNum = "PD0345-12";
		orderInfo.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(orderInfo.orderNum);
		System.out.println(orderInfo.orderID);
		System.out.println(orderInfo.orderDate);
		System.out.println(orderInfo.orderName);
		System.out.println(orderInfo.productNum);
		System.out.println(orderInfo.address);
	}

}

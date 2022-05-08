package entitie;

import java.util.Date;

import entities.enums.OrderStatus;

public class testes {

	public static void main(String[] args) {
		Order order = new Order(1080,new Date(), OrderStatus.PEMDING_PAYMENT); // Criar um tipo enumerado
		
		System.out.println(order); // imprimir o tipo enumerado
		OrderStatus os2 = OrderStatus.DELIVERED;
		OrderStatus os1 = OrderStatus.valueOf("DELIVERED"); // conver um String em um tipo enumerado
		System.out.println(os1);
		System.out.println(os2);
	}

}

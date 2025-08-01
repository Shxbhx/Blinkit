package com.anudip.Blinkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlinkitApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(BlinkitApplication.class, args);
		System.out.println("Server is Running...");
		/* I want to add UI, Cart, Payment, Delivery_status, OrderItem,
		Order_status, CartItem, Category ,User and Product ---> Admin  */
	}

}

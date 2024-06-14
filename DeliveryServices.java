package com.Flynaut.DeliveryService;

public class DeliveryServices {
	public static void main(String[] args) 
	{
		OrderList<String> orderList=new OrderList<String>(10);
		orderList.add("Mobile");
		orderList.add("Laptop");
		orderList.add("LCD");
		orderList.add("Bike");
		orderList.add("Car");
		orderList.add("Bag");
		orderList.add("Headphone");
		System.out.println(orderList);
		System.out.println(orderList.get(5));
		orderList.remove(5);
		System.out.println(orderList);
		
		DeliveryRoute<String> deliveryroute=new DeliveryRoute<>();
		
		deliveryroute.add("pune");
		deliveryroute.add("mumbai");
		deliveryroute.add("nashik");
		deliveryroute.add("delhi");
		
		System.out.println(deliveryroute);
		deliveryroute.add("satra");
		System.out.println("After Add new delivery points "+deliveryroute);
		
		deliveryroute.remove(3);
		System.out.println("After remove delivery points "+deliveryroute);
		
		Cache<String> cache = new Cache<>(2);
	        cache.put("item1", orderList.get(0));
	        cache.put("item2", "Charger");
	        System.out.println("Get item1: " + cache.get("item1")); 
	        cache.put("item3", "Laptop");
	        System.out.println("Get item2: " + cache.get("item2")); 
	        System.out.println("Get item3: " + cache.get("item3"));
	}

}

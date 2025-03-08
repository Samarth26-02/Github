class Station{
	public static void send(String item){
		System.out.println("invoking accept");
		System.out.println(item);
		DeliveryGuy.accept(item);
		
	}
}
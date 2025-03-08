class Shop{
	public static void sell(String vegetable,int quantity){
		System.out.println(vegetable);
		System.out.println(quantity);
		Agent.purchase(vegetable,quantity);
	}
}
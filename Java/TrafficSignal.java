class TrafficSignal{
	public static void showRed(){
		System.out.println("tTraffic signal is red");
		showYellow();
	}
	public static void showYellow(){
		System.out.println("Traffic signal is yellow");
		showGreen();
	}
	public static void showGreen(){
		System.out.println("Traffic signal is green");
		Currency.exchangeRate();
	}
	public static void trafficRules(){
		System.out.println("Follow traffic rules");
		Lipstick.buy();
	}
}
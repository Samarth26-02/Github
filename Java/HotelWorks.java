class HotelWorks{
    public static void main(String[] args) {
        Hotel.bookRoom();
        Hotel.provideRoomService();
        Hotel.checkInGuest();
        Hotel.arrangeEvents();
        Hotel.processPayment();

        Room.clean();
        Room.provideWiFi();
        Room.adjustTemperature();
        Room.turnOnTV();
        Room.lockDoor();
    }
}
class Hotel {
    public static void bookRoom() { System.out.println("Booking a hotel room..."); }
    public static void provideRoomService() { System.out.println("Providing room service..."); }
    public static void checkInGuest() { System.out.println("Checking in a guest..."); }
    public static void arrangeEvents() { System.out.println("Arranging events at the hotel..."); }
    public static void processPayment() { System.out.println("Processing hotel payment..."); }
}
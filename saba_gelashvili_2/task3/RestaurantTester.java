package midterm.saba_gelashvili_2.task3;

public class RestaurantTester {
    public static void main(String[] args) {
        // Create menu items
        MenuItem item1 = new MenuItem("Burger", "Juicy beef patty with lettuce, tomato, and cheese", 8.99);
        MenuItem item2 = new MenuItem("Pizza", "Classic Margherita pizza with fresh basil", 12.99);
        MenuItem item3 = new MenuItem("Salad", "Mixed greens with cherry tomatoes and balsamic vinaigrette", 6.99);

        // Create RMS instance
        RMS rms = new RMS();

        // Add menu items
        rms.addMenuItem(item1);
        rms.addMenuItem(item2);
        rms.addMenuItem(item3);

        // Print initial menu
        rms.printMenu();

        // Remove an item
        rms.removeMenuItem(item2);

        // Print updated menu
        rms.printMenu();
    }
}

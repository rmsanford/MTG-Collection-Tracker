public class Main {

	public static void main(String[] args) {

		JSONReader obj = new JSONReader();
		String[] test = null;
		obj.displayAllCards();

        System.out.println(obj.isCardValid("Dark Ritual"));
        System.out.println(obj.isCardValid("Roflcopter"));

		GUIframe mainFrame = new GUIframe();

		//test to display all cards in window
		//obj.displayAllCards(mainFrame.mainPanel.collection);
	}

}

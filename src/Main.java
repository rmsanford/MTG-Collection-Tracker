import java.util.Vector;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// parse all data decklist and collection data from .txt files
		MasterDecklist masterDecklist = new MasterDecklist();
		MasterCollection masterCollection = new MasterCollection();
		ListParser parse = new ListParser();
		Vector list = parse.parseMasterList();
		masterDecklist = parse.parseAllDecklists(list);
		masterCollection = parse.parseMasterCollection();

		GUIframe frame = null;
		try
		{
			//create user interface window
			frame = new GUIframe(masterDecklist, masterCollection);
		} catch (Exception e)
		{
			System.out.println(e + " Main");
		}
	}
}

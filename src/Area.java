import java.util.ArrayList;
import java.util.List;

public class Area {
	
	private String ID;
	private List<String> devices;
	private List<Event> eventList;
	
	public Area(String ID) {
		this.ID = ID;
		devices = new ArrayList<String>();
		eventList = new ArrayList<Event>();
	}
}

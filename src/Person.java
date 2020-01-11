import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private List<Event> eventList;
	
	
	public Person(String name) {
		this.name = name;
		this.eventList = new ArrayList<Event>();
	}
	
	public void addEvent(Event e) {
		eventList.add(e);
	}
	
	public String getName() {
		return this.name;
	}
	
}

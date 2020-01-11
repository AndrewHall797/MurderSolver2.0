import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Model {
	private List<Person> people;
	private List<Area> areas;
	private List<Event> events;
	
	public Model() {
		this.people = new ArrayList<Person>();
		this.areas = new ArrayList<Area>();
		this.events = new ArrayList<Event>();
	}
	
	public void readEvents(String fileName){
		JSONParser parse = new JSONParser();

		try(FileReader read = new FileReader(fileName)){
			
			JSONObject jevents = (JSONObject) parse.parse(read);
			Set keys = jevents.keySet();
			
			for(Object key: keys){
				JSONObject event = (JSONObject)jevents.get(key);
				this.events.add(new Event(Integer.parseInt(key.toString()), event.get("device").toString(), 
							    event.get("device-id").toString(), event.get("guest-id").toString(), event.get("event").toString()));
			}
			read.close();

		}catch(IOException e){
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

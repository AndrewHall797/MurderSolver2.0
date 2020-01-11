
public class Event {

	private int time;
	private String date;
	private String device;
	private String ID;
	private String name;
	private String event;
	
	public Event(int time, String device, String ID, String name, String event) {
		this.time = time;
		this.device = device;
		this.ID = ID;
		this.name = name;
		this.event = event;
	}
	
	public int getTime() {
		return this.time;
	}
	
	public void ConvertTime(int Epochtime) {
		this.date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (epoch*1000));
	}
	
	public String getDevice() {
		return this.device;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public String toString() {
		return event;
	}
}

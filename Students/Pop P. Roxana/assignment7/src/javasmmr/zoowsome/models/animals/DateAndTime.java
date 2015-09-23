package javasmmr.zoowsome.models.animals;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
	
	Calendar calendar = new GregorianCalendar();
	
	public int getMonth(){
		int month = calendar.get(Calendar.MONTH);//January is 0
		return month;
	}
	
	public int getDayOfMonth(){
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		return day;
	}
	
	public int getDayOfTheWeek(){
		int day = calendar.get(Calendar.DAY_OF_WEEK);//Sunday is 1, Monday is 2 etc.
		return day;
	}

	public int getHour(){

		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		return hour;
	}
	
	public int getMinute(){

		int minute = calendar.get(Calendar.MINUTE);
		return minute;
	}
	
	public int getSeccond(){

		int second = calendar.get(Calendar.SECOND);
		return second;
	}

}

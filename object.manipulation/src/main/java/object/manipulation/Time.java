package object.manipulation;

public class Time {
	private int hours;
	private int minutes;

	public Time() {

	}

	public Time(int hours, int minutes) {
		super();
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;

	}

	public int getMinutes() {

		return minutes;
	}

	public void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	Time sum(Time t1, Time t2) {
		Time t3 = new Time();
		t3.hours = t1.hours + t2.hours;
		t3.minutes = t1.minutes + t2.minutes;

		if (t3.minutes > 59) {
			t3.minutes = t3.minutes - 60;
			t3.hours += 1;
		}

		if (t3.hours > 23) {
			t3.hours -= 24;
		}

		return t3;
	}

	public void showTime(Time t1, Time t2, Time t3) {
		System.out.println("1st time : " + t1.hours + " hrs : " + t1.minutes + " mins ");
		System.out.println("2nd time : " + t2.hours + " hrs : " + t2.minutes + " mins ");
		System.out.println("Sum of time : " + t3.hours + " hrs : " + t3.minutes + " mins ");
	}

}

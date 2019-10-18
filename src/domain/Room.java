package domain;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private int number;
	private double dimension;
	private DailyRate rate;
	
	public Room() {
	    rate = new DailyRate();
	}
	
	public DailyRate getRate() {
		return this.rate;	
	}
	
	public void setRate(DailyRate rate) {
		this.rate = rate;	
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Room) {
			Room room = (Room) obj;
			if(this.number == room.getNumber())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "< Room: number = " +  this.number + ", dimension = " + this.dimension + " >";
	}

}

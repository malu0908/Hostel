package exceptions;

public class RoomNotFoundException extends Exception{
	private int number;
	
	public RoomNotFoundException(String message, int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

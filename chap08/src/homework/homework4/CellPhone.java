package homework.homework4;

public interface CellPhone extends Camera, Phone{	
	public default void charge() {}
}

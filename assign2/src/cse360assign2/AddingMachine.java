/**
 * @author      Shih Yu Chang
 * @classID     2019Fall-T-CSE360-70641 <https://canvas.asu.edu/courses/27412>                                 
 * @assignmentNumber 2
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String tos = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	// return total value
	public int getTotal () {
		return total;
	}
	
	// add value to total and save the transcation
	public void add (int value) {
		total = total + value;
		String str = Integer.toString(value);
		tos = tos + " + " + str;
	}
	
	// subtract value from total and save the transcation
	public void subtract (int value) {
		total = total - value;
		String str = Integer.toString(value);
		tos = tos + " - " +str;
	}
			
	// return transcation	
	public String toString () {
		return tos;
	}

	public void clear() {
	
	}
}


import java.util.ArrayList;

/**
 * @author Nadav Dery
 *vew
 */
public class SharedData 
{
	private ArrayList<Integer> array ;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**Contructor of the class
	 * @param array2  array of Integers that if we adding some of them we might get the value of b
	 * @param b  the number we check of adding one or more elements
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

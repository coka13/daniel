
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class SharedData.
 *
 * @author Nadav Dery 
 */
public class SharedData 
{
	
	/** The array. */
	private ArrayList<Integer> array ;
	
	/** The win array. */
	private boolean [] winArray;
	
	/** The flag. */
	private boolean flag;
	
	/** The b. */
	private final int b;
	
	/**
	 * Contructor of the class SharedData.
	 *
	 * @param array2 array of Integers that if we adding some of them we might get
	 *               the value of b
	 * @param b      the number we check of adding one or more elements
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
	}

	/**
	 * Gets the win array.
	 *
	 * @return the win array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the win array.
	 *
	 * @param winArray the new win array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Gets the array.
	 *
	 * @return the array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Gets the b.
	 *
	 * @return the b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Gets the flag.
	 *
	 * @return the flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the flag.
	 *
	 * @param flag the new flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

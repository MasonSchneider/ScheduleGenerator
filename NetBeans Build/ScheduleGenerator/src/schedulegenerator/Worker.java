package schedulegenerator;

import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 *
 * @author schneimd.
 *         Created Oct 15, 2012.
 */
public class Worker {

	private String name;
	private ArrayList<Day> days = new ArrayList<Day>();
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param jobs
	 */
	public Worker(String name, ArrayList<Day> days)
	{
		this.name = name;
		this.days = days;
	}
}

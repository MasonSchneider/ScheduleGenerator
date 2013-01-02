package schedulegenerator;

import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 *
 * @author schneimd.
 *         Created Oct 15, 2012.
 */
public class Day {
	
	private String dayOfWeek;
	private ArrayList<String> jobs = new ArrayList<String>();
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param jobs
	 */
	public Day(String name, ArrayList<Object> jobs)
	{
		this.dayOfWeek = name;
		for(Object i:jobs)
		{
			this.jobs.add((String)i);
			System.out.println(i);
		}
	}
}

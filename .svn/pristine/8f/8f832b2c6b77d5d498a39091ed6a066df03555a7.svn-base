package scheduleGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * A worker contains days available to work with jobs.
 *
 * @author schneimd.
 *         Created Oct 15, 2012.
 */
public class Worker implements Serializable{

	private String name;
	private ArrayList<Day> days = new ArrayList<Day>();
	private HashMap<String, Integer> timesWorked;
	
	/**
	 * Builds a worker with available days.
	 * @param name 
	 * @param days 
	 *
	 * @param jobs
	 */
	public Worker(String name, ArrayList<Day> days)
	{
		this.name = name;
		this.days = days;
		this.timesWorked = new HashMap<String, Integer>();
		for(Day day: days) {
			for(String job:day.getJobs()) {
				this.timesWorked.put(job, 0);
			}
		}
	}
	
	/**
	 * Gives the name of the worker.
	 *
	 * @return name of worker
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Increments the time a job is worked by one.
	 *
	 * @param jobName
	 */
	public void addWorkedJob(String jobName) {
		this.timesWorked.put(jobName, this.timesWorked.get(jobName).intValue() + 1);
	}
	
	/**
	 * Returns the number of times a job has been worked.
	 *
	 * @param jobName
	 * @return number of tims job has been worked.
	 */
	public int numWorkedForJob(String jobName) {
		return this.timesWorked.get(jobName);
	}
	
	/**
	 * Returns the workers day based on name.
	 *
	 * @param name
	 * @return day with same name
	 */
	public Day getDayWithName(String name) {
		for(Day d: this.days) {
			if(d.getNameOfDay().equals(name)) {
				return d;
			}
		}
		return null;
	}
	
	/**
	 * Returns the worker's days.
	 *
	 * @return days
	 */
	public ArrayList<Day> getDays() {
		return this.days;
	}
	
	/**
	 * Adds a day to the worker.
	 *
	 * @param d
	 */
	public void addDay(Day d) {
		this.days.add(d);
	}
	
}

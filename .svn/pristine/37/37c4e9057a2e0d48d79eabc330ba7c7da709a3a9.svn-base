package schedulegenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class handles the interaction of one frame to another as well as handling initialization.
 *
 * @author Mason Schneider and Orion Martin.
 *         Created Oct 8, 2012.
 */
public class Main {
	
	private static ArrayList<Day> days;
	private static ArrayList<Worker> workers;
	private static File path;
	private static Scanner reader;
	private static Config config;
	private static WorkerSetup wSet;
	private static Calendar cal;
	private static Schedule schedule;

	/**
	 * Program starts here.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		path = new File("Scheduler.txt");
		config = new Config();
		wSet = new WorkerSetup();
		cal = new Calendar();
		schedule = new Schedule();
		try {
			reader = new Scanner(path);
			// TODO: Read file, update arrays, open calendar.
		} catch (FileNotFoundException exception) {
			config.setVisible(true);
		}		
	}
	
	/**
	 * Changes visible of config.
	 *
	 */
	public static void toggleConfig() {
		config.setVisible(!config.isVisible());
	}
	
	/**
	 * Changes visible of calendar.
	 *
	 */
	public static void toggleCalendar() {
		cal.setVisible(!cal.isVisible());
	}
	
	/**
	 * Changes visible of worker setup.
	 *
	 */
	public static void toggleWorkerSetup() {
		wSet.setVisible(!wSet.isVisible());
	}
	
	/**
	 * Returns the value of the field called 'schedule'.
	 * @return Returns the schedule.
	 */
	public static Schedule getSchedule() {
		return schedule;
	}

	/**
	 * Sets the field called 'schedule' to the given value.
	 * @param schedule The schedule to set.
	 */
	public static void setSchedule(Schedule schedule) {
		Main.schedule = schedule;
	}

	/**
	 * Sets the value of workers.
	 *
	 * @return workers
	 */
	public static ArrayList<Worker> getWorkers() {
		return workers;
	}
	
	/**
	 * Sets workers.
	 *
	 * @param w
	 */
	public static void setWorkers(ArrayList<Worker> w) {
		workers = w;
	}

	/**
	 * Returns the value of the field called 'days'.
	 * @return Returns the days.
	 */
	public static ArrayList<Day> getDays() {
		return days;
	}

	/**
	 * Sets the field called 'days' to the given value.
	 * @param d
	 */
	public static void setDays(ArrayList<Day> d) {
		days = d;
	}

}

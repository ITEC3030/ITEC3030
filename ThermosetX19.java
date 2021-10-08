package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;

/**
 *  A thermostat developed by ThermoSet Ltd.
 *  @author Domenico Lasalandra
 */
public class ThermosetX19 implements Thermostat {
	
	private ControllerInterface con = null;
	private String id = null;
	private int temp;
	private boolean enabled = true;
	
	/**
	 *  Creates the thermostat and its front-end
	 */
	public ThermosetX19()
	{
		FrontEnd f = new FrontEnd(this); 
        f.pack(); 
        f.setVisible(true);
	}
    
	/**
	 *  turns off the thermostat
	 */
	public void disable() {
		enabled  = false;
	}

	/**
	 *  Turns on the thermostat
	 */
	public void enable() {
		enabled  = true;
	}

	/**
	 *  Checks if the thermostat is on
	 *  @return True if the thermostat is enabled
	 */
	public boolean enabled() {
		return enabled;
	}

	/**
	 *  Returns the controller that the thermostat is connected to
	 *  @return The controller
	 */
	public ControllerInterface getController() {
		return con;
	}

	/**
	 *  Reads the current identifier of the thermostat
	 *  @return the current ID
	 */
	public String getID() {
		return id;
	}

	/**
	 *  Pairs a controller with the thermostat
	 *  @param con The controller
	 */
	public void setController(ControllerInterface con) {
		this.con = con;
	}

	/**
	 *  Gives new identifier for the thermostat
	 *  @param id The new ID
	 */
	public void setID(String id) {
		this.id = id;
	}

	/**
	 *  Shows recent temperature of thermostat
	 *  @return the current temperature of the thermostat
	 */
	public int getReading() {
		return temp;
	}

	/**
	 *  generates new temperature for thermostat
	 *  @param temp The new temperature
	 */
	public void newTemperature(int temp) {
		this.temp = temp;
	}
}

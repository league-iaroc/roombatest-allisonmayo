package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		driveDirect(500,500);
		sleep(2500);
		driveDirect(0,500);
		sleep(760);
		driveDirect(500,500);
		sleep(4000);
	    driveDirect(500,500);
		sleep(3000);
		driveDirect(250,500);
		sleep(1500);
		driveDirect(0,0);
		driveDirect(500,500);
		
		
		
		
	}

	public void loop() {
	
	}
}

package inteligentpot.com.core.domain;

import javax.inject.Singleton;

@Singleton
public class MotorControl {
	private boolean motor_run = false;
	
	public void setMotorTrue() {
		motor_run = true;
	}
	
	public void setMotorFalse() {
		motor_run = false;
	}
	
	public boolean getMotorState() {
		return motor_run;
	}
}

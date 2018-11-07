package fysik;

public class PhysLib {

	static double G = 9.82;
	static double ATM = 101.3E3; // 101.3 kPa

	public static double fluidPressure(FluidTable fluid, double deep) {
		return fluid.density * G * deep;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	public static double pressureUnderWater(double deep) {
		return FluidTable.WATER.density * G * deep;
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		return 0.5 * mass * velocity;
	}
	
	public static double potentialEnergy(double mass, double height) {
		return mass * G * height;
	}
	
	//Roten ur (2 * g * height). Math.sqrt(*insert tal or ekvation*)//
	public static double fallSpeed(double height) {
		return Math.sqrt(2 * G * height);
	}
	
	public static double delta(double first, double last) {
		return last - first;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return volume * fluid.density;
	}
	
	public static double volumeToMass(gasTable gas, double volume) {
		return volume * gas.density;
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		return volume * solid.density;
	}
	
	public static double svtVelocity(double distance, double time) {
		return distance / time; 
	}
	
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}
	
	public static double svtTime(double distance, double velocity) {
		return distance * velocity;
	}
	
	public static double work(double force, double distance) {
		return force * distance;
	}
	
	public static double power(double work, double time) {
		return work / time;
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * deltaT;
	}
	
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		return fluid.heatCapacity * volume * deltaT;
	}
	
	public static double heat(gasTable gas, double volume, double deltaT) {
		return gas.heatCapacity * volume * deltaT;
	}
	
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2)/(2 * G);
	}
}

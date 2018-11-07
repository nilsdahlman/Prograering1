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
		return FluidTable.H20.density * G * deep;
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		return 0.5 * mass * velocity;
	}
	
	public static double potentialEnergy(double mass, double height) {
		return mass * G * height;
	}
	
	//Ludvig hjälper mig med denna//
	public static double fallSpeed(double height) {
		return height * G;
	}
	
	public static double delta(double first, double last) {
		return last - first;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return
	}
	
}

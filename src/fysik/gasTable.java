package fysik;

public enum gasTable {

	AIR(1.29, 1.01), 
	OXYGEN(1.43, 0.92),
	ARGON(1.78, 0.52),
	FLOUR(1.72, 0.75),
	KLOR(3.21, 0.5);

	double density;
	double heatCapacity;

	gasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}

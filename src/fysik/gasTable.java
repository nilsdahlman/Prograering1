package fysik;

public enum gasTable {

	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92);
	

	double density;
	double heatCapacity;

	gasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}

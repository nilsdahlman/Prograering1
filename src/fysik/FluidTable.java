package fysik;

public enum FluidTable {

	WATER(0.998, 4.19, 0, 100, 2260),
	H2SO4(1.84, 1.38, 10, 336, 511),
	ACETON(0.79, 2.2, -95, 56, 509),
	BENSEN(0.879, 1.15, 6, 80, 393),
	ETANOL(0.789, 2.43, -117, 78.2, 841);
	

	double density;
	double heatCapacity;
	double meltPoint;
	double boilPoint;
	double steamEntalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}

}
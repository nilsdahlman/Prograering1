package fysik;

public class MethodTest {

	public static void main(String[] args) {
		
		//Hur mycket väger 80 dm^3 järn?
		
		System.out.println(PhysLib.volumeToMass(SolidTable.IRON, 80E-3));
		
		//Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?
		
		System.out.println(PhysLib.svtDistance(2.8, 3600));
		
		//Hur mycket energi krävs för att värma upp 5 liter vatten 100 grader?
		
		System.out.println(PhysLib.heat(FluidTable.WATER, 5, 100));
		
		//Hur stort är det totala trycket 100 meter under havsytan?
		
		System.out.println(PhysLib.fluidPressure(FluidTable.WATER, 100));
		
		//Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?
		
		System.out.println(PhysLib.velocityToHeight(13.888));
		
		//En bil med massan 740kg accelererar med konstant acceleration från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?
		
		System.out.println(PhysLib.power(PhysLib.work(740, 100), 4.4));
		
		//En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?

		int bounce = 0;  
	    for (double i = 10; i > 0.5;) {
	    	
	    	i = PhysLib.velocityToHeight(PhysLib.fallSpeed(i) - i/100);
	    	bounce++;
	    }
	}
	
}

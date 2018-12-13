package fysik;

public class MethodTest {

	public static void main(String[] args) {
		
		//Hur mycket v�ger 80 dm^3 j�rn?
		
		System.out.println(PhysLib.volumeToMass(SolidTable.IRON, 80E-3));
		
		//Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.8 m/s i 60 minuter?
		
		System.out.println(PhysLib.svtDistance(2.8, 3600));
		
		//Hur mycket energi kr�vs f�r att v�rma upp 5 liter vatten 100 grader?
		
		System.out.println(PhysLib.heat(FluidTable.WATER, 5, 100));
		
		//Hur stort �r det totala trycket 100 meter under havsytan?
		
		System.out.println(PhysLib.fluidPressure(FluidTable.WATER, 100));
		
		//Tomas som �r 180cm l�ng kastar upp en boll med massan 200 gram i luften s� den f�r starthastigheten 50 km/h. Hur h�gt kommer bollen?
		
		System.out.println(PhysLib.velocityToHeight(13.888));
		
		//En bil med massan 740kg accelererar med konstant acceleration fr�n 0-100 p� 4.4 sekunder. Hur stor effekt har bilens motor uppn�tt?
		
		System.out.println(PhysLib.power(PhysLib.work(740, 100), 4.4));
		
		//En studsboll sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?

		int bounce = 0;  
	    for (double i = 10; i > 0.5;) {
	    	
	    	i = PhysLib.velocityToHeight(PhysLib.fallSpeed(i) - i/100);
	    	bounce++;
	    }
	}
	
}

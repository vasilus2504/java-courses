/**
* Realizarea clasei Calculate. Operatii aritmetice
*/
public class Calculate{
	public static void main(String args[]){
		System.out.println("Calculate...");
		/**
		* Calcularea sumei a primilor doi argumenti (0, 1)
		*/
		int fint = Integer.valueOf(args[0]);
		int sint = Integer.valueOf(args[1]);
		int summ = fint + sint;
		System.out.println("Summ: "+summ);
		
		/**
		* Calcularea diferentei urmatorilor doi argumenti (2, 3)
		*/
		double fdouble = Double.valueOf(args[2]);
		double sdouble = Double.valueOf(args[3]);
		double ddiff = fdouble - sdouble;
		System.out.println("Diff: "+ddiff);

		/**
		* Calcularea produsului urmatorilor doi argumenti (4, 5)
		*/		
		float ffloat = Float.valueOf(args[4]);
		float sfloat = Float.valueOf(args[5]);
		float fprod = ffloat * sfloat;
		System.out.println("Prod: "+fprod);

		/**
		* Ridicarea la putere a primului argument, exponentul fiind cel de-al doilea argument (6, 7)
		*/		
		long flong = Long.valueOf(args[6]);
		long slong = Long.valueOf(args[7]);
		long lpow = 1;
		for(int i=1; i<=slong; i++){
			lpow *= flong;
		}
		System.out.format("%d la puterea %d este: %d",flong, slong, lpow);
		
		 
	}
}
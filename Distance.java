

public class Distance {

	public static void main(String[] args) {
// Distance = 150
		float km = 150f;
		float m = km * 1000f;
		float cm = m * 100f;
		float inch = cm/2.54f;
		float ft = inch/12f;
		System.out.println("Metre :" + m + "\nCentimetres :" + cm + "\nInches :" + inch + "\nFeet:" + ft);
		System.out.println("Metre :"+m);
		System.out.println("Centimetres :" + cm);
		System.out.println("Inches :" + inch);
		System.out.println("Feet:" + ft);
	}
	public static void main2(String[] args) {
		
		float km = 1500f;
		float m = km * 100f;
		System.out.println("Metre :" + m);
	}
public static void main3(String[] args) {
		
		float km = 1500f;
		float m = km * 100f;
		float cm = m * 100f;
		System.out.println("Metre :" + m);
		System.out.println("Centimetres :" + cm );
}
}

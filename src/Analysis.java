import java.io.IOException;
import java.util.LinkedList;

public class Analysis {
	
	
	public static void main(String [] args) throws IOException {
		LinkedList<Double> fullDictTimes = new LinkedList<Double>();
		LinkedList<Double> halfDictTimes = new LinkedList<Double>();
		LinkedList<Double> quarterDictTimes = new LinkedList<Double>();
		LinkedList<Double> eigthDictTimes = new LinkedList<Double>();
		
		System.out.println("Fill times");
		
		//Fill full dictionary. Mult Factor: 8x
		fullDictTimes.add(fill(8, 321165));
		
		//Fill full dictionary. Mult Factor: 4x
		fullDictTimes.add(fill(4, 321165));
		
		//Fill full dictionary. Mult Factor: 2x
		fullDictTimes.add(fill(2, 321165));
		
		//Fill full dictionary. Mult Factor: 1.5x
		fullDictTimes.add(fill(1.5, 321165));
		
		//Fill full dictionary. Mult Factor: 1.25x
		fullDictTimes.add(fill(1.25, 321165));
		
		//Fill full dictionary. Mult Factor: 1.125x
		fullDictTimes.add(fill(1.125, 321165));
		
		//Print times
		System.out.print("8x: " + fullDictTimes.get(0) + "s   ");
		System.out.print("4x: " + fullDictTimes.get(1) + "s   ");
		System.out.print("2x: " + fullDictTimes.get(2) + "s   ");
		System.out.print("1.5x: " + fullDictTimes.get(3) + "s   ");
		System.out.print("1.25x: " + fullDictTimes.get(4) + "s   ");
		System.out.print("1.125x: " + fullDictTimes.get(5) + "s   ");
		System.out.println();
		
		
		
		//Fill half dictionary. Mult Factor: 8x
		halfDictTimes.add(fill(8, 160582));
		
		//Fill half dictionary. Mult Factor: 4x
		halfDictTimes.add(fill(4, 160582));
		
		//Fill half dictionary. Mult Factor: 2x
		halfDictTimes.add(fill(2, 160582));
		
		//Fill half dictionary. Mult Factor: 1.5x
		halfDictTimes.add(fill(1.5, 160582));
		
		//Fill half dictionary. Mult Factor: 1.25x
		halfDictTimes.add(fill(1.25, 160582));
		
		//Fill half dictionary. Mult Factor: 1.125x
		halfDictTimes.add(fill(1.125, 160582));
		
		//Print times
		System.out.print("8x: " + halfDictTimes.get(0) + "s   ");
		System.out.print("4x: " + halfDictTimes.get(1) + "s   ");
		System.out.print("2x: " + halfDictTimes.get(2) + "s   ");
		System.out.print("1.5x: " + halfDictTimes.get(3) + "s   ");
		System.out.print("1.25x: " + halfDictTimes.get(4) + "s   ");
		System.out.print("1.125x: " + halfDictTimes.get(5) + "s   ");
		System.out.println();
		
		
		
		//Fill quarter dictionary. Mult Factor: 8x
		quarterDictTimes.add(fill(8, 80291));
		
		//Fill quarter dictionary. Mult Factor: 4x
		quarterDictTimes.add(fill(4, 80291));
		
		//Fill quarter dictionary. Mult Factor: 2x
		quarterDictTimes.add(fill(2, 80291));
		
		//Fill quarter dictionary. Mult Factor: 1.5x
		quarterDictTimes.add(fill(1.5, 80291));
		
		//Fill quarter dictionary. Mult Factor: 1.25x
		quarterDictTimes.add(fill(1.25, 80291));
		
		//Fill quarter dictionary. Mult Factor: 1.125x
		quarterDictTimes.add(fill(1.125, 80291));
		
		//Print times
		System.out.print("8x: " + quarterDictTimes.get(0) + "s   ");
		System.out.print("4x: " + quarterDictTimes.get(1) + "s   ");
		System.out.print("2x: " + quarterDictTimes.get(2) + "s   ");
		System.out.print("1.5x: " + quarterDictTimes.get(3) + "s   ");
		System.out.print("1.25x: " + quarterDictTimes.get(4) + "s   ");
		System.out.print("1.125x: " + quarterDictTimes.get(5) + "s   ");
		System.out.println();
		
		
		
		//Fill eigth dictionary. Mult Factor: 8x
		eigthDictTimes.add(fill(8, 40145));
		
		//Fill eigth dictionary. Mult Factor: 4x
		eigthDictTimes.add(fill(4, 40145));
		
		//Fill eigth dictionary. Mult Factor: 2x
		eigthDictTimes.add(fill(2, 40145));
		
		//Fill eigth dictionary. Mult Factor: 1.5x
		eigthDictTimes.add(fill(1.5, 40145));
		
		//Fill eigth dictionary. Mult Factor: 1.25x
		eigthDictTimes.add(fill(1.25, 40145));
		
		//Fill eigth dictionary. Mult Factor: 1.125x
		eigthDictTimes.add(fill(1.125, 40145));
		
		//Print times
		System.out.print("8x: " + eigthDictTimes.get(0) + "s   ");
		System.out.print("4x: " + eigthDictTimes.get(1) + "s   ");
		System.out.print("2x: " + eigthDictTimes.get(2) + "s   ");
		System.out.print("1.5x: " + eigthDictTimes.get(3) + "s   ");
		System.out.print("1.25x: " + eigthDictTimes.get(4) + "s   ");
		System.out.print("1.125x: " + eigthDictTimes.get(5) + "s   ");
		System.out.println("\n\n\n");
		
		
		
		LinkedList<Double> fullDictGetTimes = new LinkedList<Double>();
		LinkedList<Double> halfDictGetTimes = new LinkedList<Double>();
		LinkedList<Double> quarterDictGetTimes = new LinkedList<Double>();
		LinkedList<Double> eigthDictGetTimes = new LinkedList<Double>();
		
		System.out.println("Get times");
		
		//Fill full dictionary. Mult Factor: 8x
		fullDictGetTimes.add(testGet(8, 321165));
		
		//testGet full dictionary. Mult Factor: 4x
		fullDictGetTimes.add(testGet(4, 321165));
		
		//testGet full dictionary. Mult Factor: 2x
		fullDictGetTimes.add(testGet(2, 321165));
		
		//testGet full dictionary. Mult Factor: 1.5x
		fullDictGetTimes.add(testGet(1.5, 321165));
		
		//testGet full dictionary. Mult Factor: 1.25x
		fullDictGetTimes.add(testGet(1.25, 321165));
		
		//testGet full dictionary. Mult Factor: 1.125x
		fullDictGetTimes.add(testGet(1.125, 321165));
		
		//Print times
		System.out.print("8x: " + fullDictGetTimes.get(0) + "s   ");
		System.out.print("4x: " + fullDictGetTimes.get(1) + "s   ");
		System.out.print("2x: " + fullDictGetTimes.get(2) + "s   ");
		System.out.print("1.5x: " + fullDictGetTimes.get(3) + "s   ");
		System.out.print("1.25x: " + fullDictGetTimes.get(4) + "s   ");
		System.out.print("1.125x: " + fullDictGetTimes.get(5) + "s   ");
		System.out.println();
		
		
		
		//testGet half dictionary. Mult Factor: 8x
		halfDictGetTimes.add(testGet(8, 160582));
		
		//testGet half dictionary. Mult Factor: 4x
		halfDictGetTimes.add(testGet(4, 160582));
		
		//testGet half dictionary. Mult Factor: 2x
		halfDictGetTimes.add(testGet(2, 160582));
		
		//testGet half dictionary. Mult Factor: 1.5x
		halfDictGetTimes.add(testGet(1.5, 160582));
		
		//testGet half dictionary. Mult Factor: 1.25x
		halfDictGetTimes.add(testGet(1.25, 160582));
		
		//testGet half dictionary. Mult Factor: 1.125x
		halfDictGetTimes.add(testGet(1.125, 160582));
		
		//Print times
		System.out.print("8x: " + halfDictGetTimes.get(0) + "s   ");
		System.out.print("4x: " + halfDictGetTimes.get(1) + "s   ");
		System.out.print("2x: " + halfDictGetTimes.get(2) + "s   ");
		System.out.print("1.5x: " + halfDictGetTimes.get(3) + "s   ");
		System.out.print("1.25x: " + halfDictGetTimes.get(4) + "s   ");
		System.out.print("1.125x: " + halfDictGetTimes.get(5) + "s   ");
		System.out.println();
		
		
		
		//testGet quarter dictionary. Mult Factor: 8x
		quarterDictGetTimes.add(testGet(8, 80291));
		
		//testGet quarter dictionary. Mult Factor: 4x
		quarterDictGetTimes.add(testGet(4, 80291));
		
		//testGet quarter dictionary. Mult Factor: 2x
		quarterDictGetTimes.add(testGet(2, 80291));
		
		//testGet quarter dictionary. Mult Factor: 1.5x
		quarterDictGetTimes.add(testGet(1.5, 80291));
		
		//testGet quarter dictionary. Mult Factor: 1.25x
		quarterDictGetTimes.add(testGet(1.25, 80291));
		
		//testGet quarter dictionary. Mult Factor: 1.125x
		quarterDictGetTimes.add(testGet(1.125, 80291));
		
		//Print times
		System.out.print("8x: " + quarterDictGetTimes.get(0) + "s   ");
		System.out.print("4x: " + quarterDictGetTimes.get(1) + "s   ");
		System.out.print("2x: " + quarterDictGetTimes.get(2) + "s   ");
		System.out.print("1.5x: " + quarterDictGetTimes.get(3) + "s   ");
		System.out.print("1.25x: " + quarterDictGetTimes.get(4) + "s   ");
		System.out.print("1.125x: " + quarterDictGetTimes.get(5) + "s   ");
		System.out.println();
		
		
		
		//testGet eigth dictionary. Mult Factor: 8x
		eigthDictGetTimes.add(testGet(8, 40145));
		
		//testGet eigth dictionary. Mult Factor: 4x
		eigthDictGetTimes.add(testGet(4, 40145));
		
		//testGet eigth dictionary. Mult Factor: 2x
		eigthDictGetTimes.add(testGet(2, 40145));
		
		//testGet eigth dictionary. Mult Factor: 1.5x
		eigthDictGetTimes.add(testGet(1.5, 40145));
		
		//testGet eigth dictionary. Mult Factor: 1.25x
		eigthDictGetTimes.add(testGet(1.25, 40145));
		
		//testGet eigth dictionary. Mult Factor: 1.125x
		eigthDictGetTimes.add(testGet(1.125, 40145));
		
		//Print times
		System.out.print("8x: " + eigthDictGetTimes.get(0) + "s   ");
		System.out.print("4x: " + eigthDictGetTimes.get(1) + "s   ");
		System.out.print("2x: " + eigthDictGetTimes.get(2) + "s   ");
		System.out.print("1.5x: " + eigthDictGetTimes.get(3) + "s   ");
		System.out.print("1.25x: " + eigthDictGetTimes.get(4) + "s   ");
		System.out.print("1.125x: " + eigthDictGetTimes.get(5) + "s   ");
		System.out.println();
		
		
	}
	
	//Fills hash table with specified number of values with a specified multiplicative factor for resizing
	public static double fill(double multFactor, int fillLength) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST(0, multFactor);
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		Stopwatch watch = new Stopwatch();
		for(int i = 0; i < fillLength; i++) {
			hashST.put(ede.next(), 1);
		}
		return watch.elapsedTime();
	}
	
	public static double testGet(double multFactor, int fillLength) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST(0, multFactor);
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		for(int i = 0; i < fillLength; i++) {
			hashST.put(ede.next(), 1);
		}
		
		ede = new EnglishDictionaryExtractor();
		
		Stopwatch watch = new Stopwatch();
		for(int i = 0; i < fillLength; i++) {
			hashST.get(ede.next());
		}
		return watch.elapsedTime();
	}

}

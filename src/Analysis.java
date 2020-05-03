import java.io.IOException;
import java.util.LinkedList;

public class Analysis {
	
	
	public static void main(String [] args) throws IOException {
		LinkedList<Double> fullDictTimes = new LinkedList<Double>();
		LinkedList<Double> halfDictTimes = new LinkedList<Double>();
		LinkedList<Double> quarterDictTimes = new LinkedList<Double>();
		LinkedList<Double> eigthDictTimes = new LinkedList<Double>();
		
		System.out.println("Fill times");
		
		//Fill full dictionary. Mult Factor: x8
		fullDictTimes.add(fill(8, 321165));
		
		//Fill full dictionary. Mult Factor: x4
		fullDictTimes.add(fill(4, 321165));
		
		//Fill full dictionary. Mult Factor: x2
		fullDictTimes.add(fill(2, 321165));
		
		//Fill full dictionary. Mult Factor: x1.5
		fullDictTimes.add(fill(1.5, 321165));
		
		//Fill full dictionary. Mult Factor: x1.25
		fullDictTimes.add(fill(1.25, 321165));
		
		//Fill full dictionary. Mult Factor: x1.125
		fullDictTimes.add(fill(1.125, 321165));
		
		//Print times
		System.out.println(fullDictTimes);
		
		
		
		//Fill half dictionary. Mult Factor: x8
		halfDictTimes.add(fill(8, 160582));
		
		//Fill half dictionary. Mult Factor: x4
		halfDictTimes.add(fill(4, 160582));
		
		//Fill half dictionary. Mult Factor: x2
		halfDictTimes.add(fill(2, 160582));
		
		//Fill half dictionary. Mult Factor: x1.5
		halfDictTimes.add(fill(1.5, 160582));
		
		//Fill half dictionary. Mult Factor: x1.25
		halfDictTimes.add(fill(1.25, 160582));
		
		//Fill half dictionary. Mult Factor: x1.125
		halfDictTimes.add(fill(1.125, 160582));
		
		//Print times
		System.out.println(halfDictTimes);
		
		
		
		//Fill quarter dictionary. Mult Factor: x8
		quarterDictTimes.add(fill(8, 80291));
		
		//Fill quarter dictionary. Mult Factor: x4
		quarterDictTimes.add(fill(4, 80291));
		
		//Fill quarter dictionary. Mult Factor: x2
		quarterDictTimes.add(fill(2, 80291));
		
		//Fill quarter dictionary. Mult Factor: x1.5
		quarterDictTimes.add(fill(1.5, 80291));
		
		//Fill quarter dictionary. Mult Factor: x1.25
		quarterDictTimes.add(fill(1.25, 80291));
		
		//Fill quarter dictionary. Mult Factor: x1.125
		quarterDictTimes.add(fill(1.125, 80291));
		
		//Print times
		System.out.println(quarterDictTimes);
		
		
		
		//Fill eigth dictionary. Mult Factor: x8
		eigthDictTimes.add(fill(8, 40145));
		
		//Fill eigth dictionary. Mult Factor: x4
		eigthDictTimes.add(fill(4, 40145));
		
		//Fill eigth dictionary. Mult Factor: x2
		eigthDictTimes.add(fill(2, 40145));
		
		//Fill eigth dictionary. Mult Factor: x1.5
		eigthDictTimes.add(fill(1.5, 40145));
		
		//Fill eigth dictionary. Mult Factor: x1.25
		eigthDictTimes.add(fill(1.25, 40145));
		
		//Fill eigth dictionary. Mult Factor: x1.125
		eigthDictTimes.add(fill(1.125, 40145));
		
		//Print times
		System.out.println(eigthDictTimes + "\n\n\n");
		
		
		
		LinkedList<Double> fullDictGetTimes = new LinkedList<Double>();
		LinkedList<Double> halfDictGetTimes = new LinkedList<Double>();
		LinkedList<Double> quarterDictGetTimes = new LinkedList<Double>();
		LinkedList<Double> eigthDictGetTimes = new LinkedList<Double>();
		
		System.out.println("Get times");
		
		//Fill full dictionary. Mult Factor: x8
		fullDictGetTimes.add(testGet(8, 321165));
		
		//testGet full dictionary. Mult Factor: x4
		fullDictGetTimes.add(testGet(4, 321165));
		
		//testGet full dictionary. Mult Factor: x2
		fullDictGetTimes.add(testGet(2, 321165));
		
		//testGet full dictionary. Mult Factor: x1.5
		fullDictGetTimes.add(testGet(1.5, 321165));
		
		//testGet full dictionary. Mult Factor: x1.25
		fullDictGetTimes.add(testGet(1.25, 321165));
		
		//testGet full dictionary. Mult Factor: x1.125
		fullDictGetTimes.add(testGet(1.125, 321165));
		
		//Print times
		System.out.println(fullDictGetTimes);
		
		
		
		//testGet half dictionary. Mult Factor: x8
		halfDictGetTimes.add(testGet(8, 160582));
		
		//testGet half dictionary. Mult Factor: x4
		halfDictGetTimes.add(testGet(4, 160582));
		
		//testGet half dictionary. Mult Factor: x2
		halfDictGetTimes.add(testGet(2, 160582));
		
		//testGet half dictionary. Mult Factor: x1.5
		halfDictGetTimes.add(testGet(1.5, 160582));
		
		//testGet half dictionary. Mult Factor: x1.25
		halfDictGetTimes.add(testGet(1.25, 160582));
		
		//testGet half dictionary. Mult Factor: x1.125
		halfDictGetTimes.add(testGet(1.125, 160582));
		
		//Print times
		System.out.println(halfDictGetTimes);
		
		
		
		//testGet quarter dictionary. Mult Factor: x8
		quarterDictGetTimes.add(testGet(8, 80291));
		
		//testGet quarter dictionary. Mult Factor: x4
		quarterDictGetTimes.add(testGet(4, 80291));
		
		//testGet quarter dictionary. Mult Factor: x2
		quarterDictGetTimes.add(testGet(2, 80291));
		
		//testGet quarter dictionary. Mult Factor: x1.5
		quarterDictGetTimes.add(testGet(1.5, 80291));
		
		//testGet quarter dictionary. Mult Factor: x1.25
		quarterDictGetTimes.add(testGet(1.25, 80291));
		
		//testGet quarter dictionary. Mult Factor: x1.125
		quarterDictGetTimes.add(testGet(1.125, 80291));
		
		//Print times
		System.out.println(quarterDictGetTimes);
		
		
		
		//testGet eigth dictionary. Mult Factor: x8
		eigthDictGetTimes.add(testGet(8, 40145));
		
		//testGet eigth dictionary. Mult Factor: x4
		eigthDictGetTimes.add(testGet(4, 40145));
		
		//testGet eigth dictionary. Mult Factor: x2
		eigthDictGetTimes.add(testGet(2, 40145));
		
		//testGet eigth dictionary. Mult Factor: x1.5
		eigthDictGetTimes.add(testGet(1.5, 40145));
		
		//testGet eigth dictionary. Mult Factor: x1.25
		eigthDictGetTimes.add(testGet(1.25, 40145));
		
		//testGet eigth dictionary. Mult Factor: x1.125
		eigthDictGetTimes.add(testGet(1.125, 40145));
		
		//Print times
		System.out.println(eigthDictGetTimes);
		
		
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

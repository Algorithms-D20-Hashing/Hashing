import java.io.IOException;
import java.util.LinkedList;

public class Analysis {
	
	
	public static void main(String [] args) throws IOException {
		LinkedList<Double> fullDictTimes = new LinkedList<Double>();
		LinkedList<Double> halfDictTimes = new LinkedList<Double>();
		LinkedList<Double> quarterDictTimes = new LinkedList<Double>();
		LinkedList<Double> eigthDictTimes = new LinkedList<Double>();
		
		
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
		System.out.println(eigthDictTimes);
		
		
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
}

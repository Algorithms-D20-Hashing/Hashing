import java.io.IOException;
import java.util.LinkedList;

public class Analysis {
	
	
	public static void main(String [] args) throws IOException {
		LinkedList<Double> fullDictTimes = new LinkedList<Double>();
		LinkedList<Double> halfDictTimes = new LinkedList<Double>();
		LinkedList<Double> quarterDictTimes = new LinkedList<Double>();
		LinkedList<Double> eigthDictTimes = new LinkedList<Double>();
		
		//Fill full dictionary. Mult Factor: x8
		fullDictTimes.add(fillFull(8));
		
		//Fill full dictionary. Mult Factor: x4
		fullDictTimes.add(fillFull(4));
		
		//Fill full dictionary. Mult Factor: x2
		fullDictTimes.add(fillFull(2));
		
		//Fill full dictionary. Mult Factor: x1.5
		fullDictTimes.add(fillFull(1.5));
		
		//Fill full dictionary. Mult Factor: x1.25
		fullDictTimes.add(fillFull(1.25));
		
		//Fill full dictionary. Mult Factor: x1.125
		fullDictTimes.add(fillFull(1.125));
		
		//Print times
		System.out.println(fullDictTimes);
		
		
		
		//Fill half dictionary. Mult Factor: x8
		halfDictTimes.add(fillHalf(8));
		
		//Fill half dictionary. Mult Factor: x4
		halfDictTimes.add(fillHalf(4));
		
		//Fill half dictionary. Mult Factor: x2
		halfDictTimes.add(fillHalf(2));
		
		//Fill half dictionary. Mult Factor: x1.5
		halfDictTimes.add(fillHalf(1.5));
		
		//Fill half dictionary. Mult Factor: x1.25
		halfDictTimes.add(fillHalf(1.25));
		
		//Fill half dictionary. Mult Factor: x1.125
		halfDictTimes.add(fillHalf(1.125));
		
		//Print times
		System.out.println(halfDictTimes);
		
		
		
		//Fill quarter dictionary. Mult Factor: x8
		quarterDictTimes.add(fillQuarter(8));
		
		//Fill quarter dictionary. Mult Factor: x4
		quarterDictTimes.add(fillQuarter(4));
		
		//Fill quarter dictionary. Mult Factor: x2
		quarterDictTimes.add(fillQuarter(2));
		
		//Fill quarter dictionary. Mult Factor: x1.5
		quarterDictTimes.add(fillQuarter(1.5));
		
		//Fill quarter dictionary. Mult Factor: x1.25
		quarterDictTimes.add(fillQuarter(1.25));
		
		//Fill quarter dictionary. Mult Factor: x1.125
		quarterDictTimes.add(fillQuarter(1.125));
		
		//Print times
		System.out.println(quarterDictTimes);
		
		
		
		//Fill eigth dictionary. Mult Factor: x8
		eigthDictTimes.add(fillEigth(8));
		
		//Fill eigth dictionary. Mult Factor: x4
		eigthDictTimes.add(fillEigth(4));
		
		//Fill eigth dictionary. Mult Factor: x2
		eigthDictTimes.add(fillEigth(2));
		
		//Fill eigth dictionary. Mult Factor: x1.5
		eigthDictTimes.add(fillEigth(1.5));
		
		//Fill eigth dictionary. Mult Factor: x1.25
		eigthDictTimes.add(fillEigth(1.25));
		
		//Fill eigth dictionary. Mult Factor: x1.125
		eigthDictTimes.add(fillEigth(1.125));
		
		//Print times
		System.out.println(eigthDictTimes);
		
		
	}
	
	//Fills hash table with 321,165 values
	public static double fillFull(double multFactor) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST(0, multFactor);
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		Stopwatch watch = new Stopwatch();
		while(ede.hasNext()) {
			hashST.put(ede.next(), 1);
		}
		return watch.elapsedTime();
	}
	
	//Fills hash table with 160,582 values
	public static double fillHalf(double multFactor) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST(0, multFactor);
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		Stopwatch watch = new Stopwatch();
		for(int i = 0; i < 160582; i++) {
			hashST.put(ede.next(), 1);
		}
		return watch.elapsedTime();
	}
	
	//Fills hash table with 80,291 values
	public static double fillQuarter(double multFactor) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST(0, multFactor);
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		Stopwatch watch = new Stopwatch();
		for(int i = 0; i < 80291; i++) {
			hashST.put(ede.next(), 1);
		}
		return watch.elapsedTime();
	}
	
	//Fills hash table with 80,291 values
	public static double fillEigth(double multFactor) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST(0, multFactor);
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		Stopwatch watch = new Stopwatch();
		for(int i = 0; i < 80291; i++) {
			hashST.put(ede.next(), 1);
		}
		return watch.elapsedTime();
	}
}

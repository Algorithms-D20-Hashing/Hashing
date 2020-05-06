import java.io.IOException;
import java.util.LinkedList;

public class Analysis {
	
	
	public static void main(String [] args) throws IOException {
		
		//QUESTION 4
		
		LinkedList<Double> q4Times = new LinkedList<Double>();
		//Fill full dictionary. Mult Factor: 2x
		q4Times.add(fill2(321165));
		//Fill half dictionary. Mult Factor: 2x
		q4Times.add(fill2(160582));
		//Fill quarter dictionary. Mult Factor: 2x
		q4Times.add(fill2(80291));
		//Fill eighth dictionary. Mult Factor: 2x
		q4Times.add(fill2(40145));
		
		System.out.println("Question 4\n\nFill Times");
		System.out.print("321165 words: " + q4Times.get(0) + "s   ");
		System.out.print("160582 words: " + q4Times.get(1) + "s   ");
		System.out.print("80291 words: " + q4Times.get(2) + "s   ");
		System.out.print("40145 words: " + q4Times.get(3) + "s   ");
		System.out.println("\n");
		
		LinkedList<Double> q4GetTimes = new LinkedList<Double>();
		//Fill full dictionary. Mult Factor: 2x
		q4GetTimes.add(testGet2(321165));
		//Fill half dictionary. Mult Factor: 2x
		q4GetTimes.add(testGet2(160582));
		//Fill quarter dictionary. Mult Factor: 2x
		q4GetTimes.add(testGet2(80291));
		//Fill eighth dictionary. Mult Factor: 2x
		q4GetTimes.add(testGet2(40145));
		
		System.out.println("Get Times");
		System.out.print("321165 words: " + q4GetTimes.get(0) + "s   ");
		System.out.print("160582 words: " + q4GetTimes.get(1) + "s   ");
		System.out.print("80291 words: " + q4GetTimes.get(2) + "s   ");
		System.out.print("40145 words: " + q4GetTimes.get(3) + "s   ");
		System.out.println("\n\n\nQuestion 5\n");
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		//QUESTION 5
		LinkedList<Double> q5Times = new LinkedList<Double>();
		//Fill full dictionary. Mult Factor: 8x
		q5Times.add(fill(8, 321165));
		//Fill full dictionary. Mult Factor: 4x
		q5Times.add(fill(4, 321165));
		//Fill full dictionary. Mult Factor: 2x
		q5Times.add(fill(2, 321165));
		//Fill full dictionary. Mult Factor: 1.5x
		q5Times.add(fill(1.5, 321165));
		//Fill full dictionary. Mult Factor: 1.25x
		q5Times.add(fill(1.25, 321165));
		//Fill full dictionary. Mult Factor: 1.125x
		q5Times.add(fill(1.125, 321165));
		
		//Print results
		System.out.println("Fill Times");
		System.out.print("8x: " + q5Times.get(0) + "s   ");
		System.out.print("4x: " + q5Times.get(1) + "s   ");
		System.out.print("2x: " + q5Times.get(2) + "s   ");
		System.out.print("1.5x: " + q5Times.get(3) + "s   ");
		System.out.print("1.25x: " + q5Times.get(4) + "s   ");
		System.out.print("1.125x: " + q5Times.get(5) + "s   ");
		System.out.println("\n");

		
		LinkedList<Double> q5GetTimes = new LinkedList<Double>();
		//Fill full dictionary. Mult Factor: 8x
		q5GetTimes.add(testGet(8, 321165));
		//Fill full dictionary. Mult Factor: 4x
		q5GetTimes.add(testGet(4, 321165));
		//Fill full dictionary. Mult Factor: 2x
		q5GetTimes.add(testGet(2, 321165));
		//Fill full dictionary. Mult Factor: 1.5x
		q5GetTimes.add(testGet(1.5, 321165));
		//Fill full dictionary. Mult Factor: 1.25x
		q5GetTimes.add(testGet(1.25, 321165));
		//Fill full dictionary. Mult Factor: 1.125x
		q5GetTimes.add(testGet(1.125, 321165));
		
		//Print results
		System.out.println("Get Times:");
		System.out.print("8x: " + q5GetTimes.get(0) + "s   ");
		System.out.print("4x: " + q5GetTimes.get(1) + "s   ");
		System.out.print("2x: " + q5GetTimes.get(2) + "s   ");
		System.out.print("1.5x: " + q5GetTimes.get(3) + "s   ");
		System.out.print("1.25x: " + q5GetTimes.get(4) + "s   ");
		System.out.print("1.125x: " + q5GetTimes.get(5) + "s   ");
	}
	
	
	//METHODS FOR QUESTION 4
	//Fills hash table with specified number of values. Hash table starts as array with 16 values and gets resized with a multiplicative factor of 2.
	public static double fill2(int fillLength) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST();
		EnglishDictionaryExtractor ede = new EnglishDictionaryExtractor();
		Stopwatch watch = new Stopwatch();
		for(int i = 0; i < fillLength; i++) {
			hashST.put(ede.next(), 1);
		}
		return watch.elapsedTime();
	}
	
	public static double testGet2(int fillLength) throws IOException {
		LinearProbingHashST hashST = new LinearProbingHashST();
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
	
	
	
	//METHODS FOR QUESTION 5
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

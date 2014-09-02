import java.util.ArrayList;
import java.util.List;

public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start java8 test program...");
		
		List<String> myLists = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			myLists.add("Test" + i);
		}
		
		// using classic..
		long startTime = System.currentTimeMillis();
		for(String element : myLists) {
			System.out.println("Test for :" + element);
		}
		long classicTime = System.currentTimeMillis() - startTime;
		
		// using lambda
		startTime = System.currentTimeMillis();
		myLists.stream().forEach(str -> {
			System.out.println("Test for -> " + str);
		});
		long lambdaTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Classic Time : " + classicTime + " ms, Lambda Time : " + lambdaTime + " ms");
	}

}

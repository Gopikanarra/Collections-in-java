
import java.util.*;

public class StremApiDemo {

	public static void main(String[] args) {
//		int sum=0;
		List<Integer> nums=Arrays.asList(2,3,89,7,11,5,0,4);
//		for( int i:nums) {
//			if(i%2==1) {
//				i=i*2;//doing mutation here
//				sum=sum+i;
//			}
//		}
//			System.out.println(sum);
//Function <Integer,Integer> function=n-> n*2;
//BinaryOperator<Integer> bi=(s,e)-> s+e;

	int result=nums.parallelStream()
				.filter(n -> n%2==1)
				.map(n-> n*2)
				.reduce(0,(s,e)-> s+e);
	System.out.println("result is:"+result);
	}
}
			
//		Function<Integer,Integer> fun=n-> n*2;
		
		
		
//		Stream <Integer> stream1=nums.stream();
		
//		Stream<Integer> stream2=stream1.filter(n-> n%2==1);
////		
		
		
//		stream2.forEach(n->System.out.println(n));
		
		
		
//		Stream<Integer> stream3=stream2.map(n-> n=n*2);
//		stream3.forEach(n->System.out.println(n));
//		
				
			
//		Stream<Integer>stream1=nums.stream();
//		
		
//	Predicate<Integer> p=n-> n%2==1;
		
		
//		Stream <Integer>stream2=stream1.filter(n-> n%2==1);
//		Stream<Integer> stream3=stream2.map(fun);
//		int res=stream3.reduce(0,(s,e)->s+e);
//		System.out.println(res);
//		
		
		
	
//	}
//list of students,filter based on tech,and print whose tech is java.



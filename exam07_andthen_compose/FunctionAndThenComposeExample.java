package sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member,Address> functionA;
		Function<Address,String> functionB;
		Function<Member,String> functionAB;
		
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		functionAB = functionA.andThen(functionB);
		String city = functionAB.apply(new Member("ȫ�浿","hong",new Address("�ѱ�","����")));
		System.out.println(city);
		
		functionAB = functionB.compose(functionA);
		String city2 = functionAB.apply(new Member("ȫ�浿","hong",new Address("�ѱ�","����")));
		System.out.println(city2);
	}

}
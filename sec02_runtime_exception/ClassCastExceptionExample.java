package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		changedDog(dog);
		changedDog(cat);

	}
	public static void changedDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
//			else if(animal instanceof Cat){
//			Cat cat = (Cat) animal;
//		}
			else {
			System.out.println("dog 와 cat으로 변환이 어렵습니다.");
		}
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{};

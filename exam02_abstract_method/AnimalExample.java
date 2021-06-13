package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------------------");
		
		Animal animal = null;
		animal = new Dog(); //자동 타입 변환
		animal.sound();
		animal = new Cat(); //자동 타입 변환
		animal.sound();
		
		System.out.println("------------------");
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) {
		animal.sound(); 
	}

}

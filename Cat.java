package kita8;

public class Cat extends Animal {	//Animalクラスを継承している
	public void Sleep() {
		System.out.println("スースー");
	}
	@Override
	public void Speak() {
		System.out.println("ニャー");
	}
}

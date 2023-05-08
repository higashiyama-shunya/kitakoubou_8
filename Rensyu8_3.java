package kita8;

public class Rensyu8_3 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		
		cat.Name="ココ";
		cat.Age=10;
		
		dog.Name="ロン";
		dog.Age=9;
		
		cat.ShowProfile();
		dog.ShowProfile();
		
		cat.Speak();
		dog.Speak();//それぞれのオーバーライドしたメソッドが処理される

	}

}

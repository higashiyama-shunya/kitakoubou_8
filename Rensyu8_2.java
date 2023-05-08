package kita8;

public class Rensyu8_2 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		
		cat.Name="トト";
		cat.Age=6;
		
		dog.Name="コタロ";
		dog.Age=3;
		
		cat.ShowProfile();
		dog.ShowProfile();	//それぞれのプロフィールを表示
		
		cat.Sleep();
		dog.Run();		//それぞれの固有のメソッドを使用。

	}

}

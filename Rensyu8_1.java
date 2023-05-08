package kita8;

public class Rensyu8_1 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.Name="ナノ";
		cat.Age=9;
		cat.ShowProfile();//Animalクラスを継承しているのでShowProfileやフィールド変数が使える。
		cat.Sleep();

	}

}

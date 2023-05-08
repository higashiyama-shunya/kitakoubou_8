package kita8;

public class Rensyu8_4 {

	public static void main(String[] args) {
		Animal[] animal=new Animal[4];	//Animal型の配列を作成する。
		animal[0]=new Cat();
		animal[2]=new Cat();
		animal[1]=new Dog();
		animal[3]=new Dog();		//それぞれにcat型かdog型でインスタンスを作成する。

		for(Animal ani:animal) {	//拡張for文で配列内のanimal型をaniに代入する
			ani.Speak();			//それぞれのSpeakメソッドを使用する。
		}
	}

}

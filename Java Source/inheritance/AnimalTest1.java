package inheritance;

	class Animal{
		public void move() {
			System.out.println("동물이 움직입니다.");
	}
}
	class Human extends Animal{
		public void move() {
			System.out.println("사람은 두 발로 걷습니다.");
	}
}
	class Tiger extends Animal{
		public void move() {
			System.out.println("호랑이가 네 발로 뜁니다.");
	}	
}
	class Eagle extends Animal{
		public void move() {
			System.out.println("독수리가 하늘을 납니다.");
	}	
}

	public class AnimalTest1 {
		public static void main(String[] args) {
			AnimalTest1 aTest = new AnimalTest1();
			aTest.moveAnimal(new Human());
			aTest.moveAnimal(new Tiger());
			aTest.moveAnimal(new Eagle());
			
			Human h = new Human();
			if(h instanceof Animal) {
				System.out.println("맞다");
			}else {
				System.out.println("틀리다");
			}
			Animal a = new Animal();
			if(a instanceof Human) {
				System.out.println("맞다11");
			}else {
				System.out.println("틀리다11");
			}

	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

package Task;
class Animals
{
	public void AnimalSound()
	{
		
	}
}
class Dog extends Animals
{
	public void AnimalSound()
	{
		System.out.println("DogSound : WOW WOW");
	}
}
class Horse extends Animals
{
	public void AnimalSound()
	{
		System.out.println("HorseSound : MEAH MEAH");
	}
}
class Cat extends Animals
{
	public void AnimalSound()
	{
		System.out.println("CatSound : MEOW MEOW");
	}
}

public class Animal {

	public static void main(String[] args) {
		Animals a = new Animals();
		Animals d = new Dog();
		Animals h = new Horse();
		Animals c = new Cat();
		a.AnimalSound();
		d.AnimalSound();
		h.AnimalSound();
		c.AnimalSound();
		

	}



}

package com.oops.hierarchy;
class AnimalP{
	public String name,habitat;
	//public AnimalP() {}
	public AnimalP(String name, String habitat) {
		this.name = name;
		this.habitat = habitat;
	}
	public void displayHabitat() {
		System.out.println("Habitat: "+habitat);
	}
}
class Mammal extends AnimalP{
	private boolean isWarmBlooded;
	public Mammal(String name, String habitat,boolean isWarmBlooded) {
		super(name,habitat);
		this.isWarmBlooded = isWarmBlooded;
	}
	public void displayMammalInfo() {
		System.out.println("Is warm Blooded: "+isWarmBlooded);
	}
}
class Bird extends AnimalP{
	private boolean canFly;
	public Bird(String name, String habitat,boolean canFly) {
		super(name,habitat);
		this.canFly = canFly;
	}
	public void displayBirdInfo() {
		System.out.println("Can Fly: "+canFly);
	}
}
class Reptile extends AnimalP{
	private boolean isColdBlooded;
	public Reptile(String name, String habitat,boolean isColdBlooded) {
		super(name,habitat);
		this.isColdBlooded = isColdBlooded;
	}
	public void displayReptileInfo() {
		System.out.println("Is Cold Blooded: "+isColdBlooded);
	}
}
public class Animal {
	public static void main(String[] args) {
	System.out.println("-------Mammal---------");
	AnimalP m=new Mammal("Lion","Savannah",true);
	m.displayHabitat();
	((Mammal)m).displayMammalInfo();
	System.out.println("-------Bird---------");
	AnimalP b=new Bird("Eagle","Forest",true);
	b.displayHabitat();
	((Bird)b).displayBirdInfo();
	System.out.println("-------Reptile---------");
	AnimalP r=new Reptile("Snake","Desert",true);
	r.displayHabitat();
	((Reptile)r).displayReptileInfo();
	}
}

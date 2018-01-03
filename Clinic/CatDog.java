/**
* CatDog - clasa caine-pisica. Cainele-pisica poate scoate sunete
* @author Ticau Vasile
* @since 02.01.2018
*/

public class CatDog implements Pet{
	/**
	* Realizarea animalului de companie Pisica
	*/
	private final Pet cat;
	
	/**
	* Realizarea animalului de companie Cainele
	*/
	private final Pet dog;
	
	/**
	* Constructor
	* @param cat Pisica
	* @param dog Caiinele
	*/
	public CatDog(Pet cat, Pet dog){
		this.cat = cat;
		this.dog = dog;
	}
	
	/**
	* {@inheritDoc}
	*/
	public void makeSound(){
		this.cat.makeSound();
		this.dog.makeSound();
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void setName(final String name){
		this.cat.setName(name);
		this.dog.setName("");
	}

	/**
	* {@inheritDoc}
	*/
	public String getName(){
		return String.format("%s%s", this.cat.getName(), this.dog.getName());
	}
	
}
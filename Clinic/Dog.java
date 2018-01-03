/**
* Dog - clasa cainelui. Cainele poate latra
* @author Ticau Vasile
* @since 02.01.2018
*/

public class Dog implements Pet{
	/**
	* Realizarea animalului de companie
	*/
	private final Pet pet;
	
	/**
	* Constructor
	* @param pet Animalul de companiei
	*/
	public Dog(final Pet pet){
		this.pet = pet;
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void makeSound(){
		this.pet.makeSound();
		System.out.println("Gav, Gav");
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void setName(final String name){
		this.pet.setName(name);
	}	
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public String getName(){
		return this.pet.getName();
	}
}

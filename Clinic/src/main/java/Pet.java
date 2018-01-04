/**
* Descrierea comportamentului unui animal de companie
* @author Ticau Vasile
* @since 02.01.2018
*/

public interface Pet{
	/**
	* Scoate sunete
	*/
	void makeSound();
	
	/**
	* Returneaza numele animalului de companie
	*/
	String getName();
	
	/**
	* Seteaza numele animalului de companie
	* @param name Numele animalului de companie
	*/
	void setName(String name);
}

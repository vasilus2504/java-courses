/**
* Lucrul clinicii
* @author Ticau Vasile
* @since 02.01.2018
*/

public class ClinicRunner{
	public static void main(String[] arg){
		final Clinic clinic = new Clinic();
		clinic.addClient(0, new Client("Brown", new Cat("Digy")));
		clinic.addClient(1, new Client("Nicky", new Dog(new Animal("Sparky"))));
		clinic.addClient(2, new Client("Ann", new CatDog(new Cat("Tom"), new Dog(new Animal("Piccy")))));
		clinic.addClient(3, new Client("John", new Cat("Pigy")));
		clinic.addClient(4, new Client("Brown", new Dog(new Animal("Sparty"))));
		clinic.addClient(5, new Client("Anna", new CatDog(new Cat("Tomy"), new Dog(new Animal("Puccy")))));
		clinic.addClient(6, new Client("Nicky", new Cat("Spy")));
		clinic.addClient(7, new Client("George", new Cat("Pigy")));
		
		clinic.showDataBase();

		clinic.findClientByPetName("Pigy");
		clinic.findPetByClientId("Brown");

		clinic.editClientName("Spy", "Nick");
		clinic.showDataBase();
		clinic.editPetName("Brown", "Spyki");
		clinic.showDataBase();

		clinic.deleteClientByPetName("Sparky");
		clinic.showDataBase();
		clinic.deletePetByClientName("Anna");
		clinic.showDataBase();

		clinic.validateByClientId("Ann");
		clinic.validateByPetName("Spark");
		

	}
}
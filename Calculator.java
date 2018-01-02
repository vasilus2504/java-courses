/**
*	Class realizare Calculator
*/
public class Calculator{
	/**
	*	Rezultatul calcularii
	*/
	private int result;
	
	/**
	* Sumare argumentelor
	* @param args Argumentii sumei
	*/
	public void add(int ... args){
		for(Integer arg : args){
			this.result += arg;
		}
	}
	
	/**
	* Diferenta argumentelor
	* @param args Argumentii diferentei
	*/
	public void diff(int ... args){
		for(Integer arg : args){
			this.result -= arg;
		}
	}
	
	/**
	* Produsul argumentelor
	* @param first  primul argument al produsului
	* @param second al doilea argument al produsului
	*/
	public void prod(int first, int second){
		this.result = first * second;
	}
	
	/**
	* Dividerea argumentelor
	* @param first  primul argument al dividerii
	* @param second al doilea argument al dividerii
	*/
	public void div(int first, int second){
		this.result = first / second;
	}
	
	/**
	* Restul dividerii argumentelor
	* @param first  primul argument al dividerii
	* @param second al doilea argument al dividerii
	*/
	public void mod(int first, int second){
		this.result = first % second;
	}

	
	/**
	* Returneaza rezultatul
	* @return rezultatul calcularii
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
	*	Curatirea rezultatului
	*/
	public void cleanResult(int result){
		this.result = result;
	}
}
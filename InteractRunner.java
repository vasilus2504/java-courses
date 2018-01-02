import java.util.Scanner;

/**
* Class pentru pornirea calculatorului. Ofera posibilitatea de interactiune cu utilizatorul
*/
public class InteractRunner{
	public static void main(String arg[]){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calculator = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter operator + - * / %: ");
				String operator = reader.next();
				char op = operator.charAt(0);
				System.out.println("Enter second arg: ");
				String second = reader.next();
				switch(op){
					case '+': calculator.add(Integer.valueOf(first), Integer.valueOf(second)); break;
					case '-': calculator.diff(Integer.valueOf(first), Integer.valueOf(second)); break;
					case '*': calculator.prod(Integer.valueOf(first), Integer.valueOf(second)); break;
					case '/': calculator.div(Integer.valueOf(first), Integer.valueOf(second)); break;
					case '%': calculator.mod(Integer.valueOf(first), Integer.valueOf(second)); break;
				}			
				System.out.println("Result: " + calculator.getResult());
				if(op == '*'){
					calculator.cleanResult(1);
				}else{
					calculator.cleanResult(0);
				}
				System.out.println("Exit : yes/no: ");
				exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
}
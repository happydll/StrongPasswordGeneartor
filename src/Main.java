import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Şifre uzunluğu kaç karakterden olacak: ");
		System.out.println("Minumum 12 karakter tavsiye edilir.");
		Scanner lenght = new Scanner(System.in);
		int passLenght = lenght.nextInt();
		
		String[] myCharacters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","y","z",
								"A","B","C","D","E","F","G","H","I","j","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","Z",
								"!","é",".",",",":",";","~","+","-","*","/","-","_","?","*","=","}",")","]","(","[","/","&","%","½","+","$",
								"^","#","'","£","€",">","<","|","@","æ","ß","¨","1","2","3","4","5","6","7","8","9","0"};
		
		//int a =myCharacters.length;
		//System.out.println(a);
		
		String[] output = new String[passLenght];
		
		for(int i=0;i<passLenght;i++){
			Random random = new Random();
			int randomNumber= random.nextInt(78);
			
			output[i] = myCharacters[randomNumber];
			
		}
		
		String pass= "";
		for(int i=0;i<passLenght;i++) {
			pass +=output[i];
		}
		
		System.out.println(pass);	

	}

}

package cifraCesar;

import java.util.Scanner;

public class Cifrador {
	public Cifrador() {

	}

	public static String criptCesar(String mensagem, int chave) {

		StringBuilder controler = new StringBuilder();

		for(int i=0; i<mensagem.length();i++) {

			if(Character.isAlphabetic(mensagem.charAt(i))) {

				if (Character.isUpperCase(mensagem.charAt(i))) 
				{ 
					char ch = (char)(((int)mensagem.charAt(i) + 
							chave - 65) % 26 + 65); 
					controler.append(ch); 
				} 
				else
				{ 
					char ch = (char)(((int)mensagem.charAt(i) + 
							chave - 97) % 26 + 97); 
					controler.append(ch);  	
				}
			} else {			
				controler.append(mensagem.charAt(i));
			}

		}
		return controler.toString();
	}

}
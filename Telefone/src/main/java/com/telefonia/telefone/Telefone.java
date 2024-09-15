package com.telefonia.telefone;

import com.telefonia.telefone.error.telefoneError;
import java.util.Random;

/**
 *
 * @author Eduar
 */
public class Telefone {

	private static boolean Ligando() {
		return new Random().nextInt(10) == 1;
	}
	private static void ligar(Long numero) throws telefoneError{
		String numeroSTR = Long.toString(numero);
		int digitos = numeroSTR.length();
		if (digitos == 11) {
			int tentativas = 0;
			for (tentativas = 0; tentativas < 7; tentativas++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				boolean state = Ligando();
				System.out.println("Ligando...");
				if (state) {
					System.out.println("Atendido");
					break;
				} 
			}
			if(tentativas >= 5)throw new telefoneError("Nao atendeu!");

		} else {
			throw new telefoneError("Número invalido!");
		}

	}


	public static void main(String[] args) throws telefoneError {
		Telefone telefone = new Telefone();
		telefone.ligar(71981590149L);
		
	}
}

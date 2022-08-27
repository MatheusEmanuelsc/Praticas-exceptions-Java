package aplicacao;

import java.util.Scanner;

import entidade.Banco;
import exptions.Saldo_invalido_exptions;

public class Program {
	public static void main(String[] args) {
		
		Scanner entradaDeDados= new Scanner(System.in);
		try {
			
			System.out.println("Digite seu nome: ");
			String nome= entradaDeDados.nextLine();
			
			System.out.println("Digite numero da Conta: ");
			Integer numeroDaConta = entradaDeDados.nextInt();
			
			System.out.println("Digite saldo inicial da conta: ");
			Double  saldo = entradaDeDados.nextDouble();
			
			System.out.println("Digite Limite Inicial Da conta: ");
			Double LimiteInicialDaConta= entradaDeDados.nextDouble();
			
			
			Banco banco = new Banco(numeroDaConta, nome, saldo, LimiteInicialDaConta);
			
			System.out.println("Quanto Vocẽ Deseja sacar?");
			banco.saqueDaConta(entradaDeDados.nextDouble());
			
			
			
			System.out.println(banco);
			
			System.out.println("Fim Do programa");
			
		}catch (Saldo_invalido_exptions e) {
			System.out.println("Erro na operação: "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Erro na operação: "+e.getMessage());
		}finally {
			entradaDeDados.close();
		}
	}
}

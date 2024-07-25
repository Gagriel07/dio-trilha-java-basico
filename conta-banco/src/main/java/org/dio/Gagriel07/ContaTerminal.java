package org.dio.Gagriel07;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível " +
                "para saque");
    }

}
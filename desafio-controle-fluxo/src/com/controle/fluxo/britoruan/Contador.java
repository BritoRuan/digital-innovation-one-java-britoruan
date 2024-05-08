package com.controle.fluxo.britoruan;

import java.util.Locale;
import java.util.Scanner;

import excecoes.erros.funcoes.ParametrosInvalidosException;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira o primeiro parâmetro: ");
    int numeroUm = scanner.nextInt();

    System.out.println("Insira o segundo parâmetro: ");
    int numeroDois = scanner.nextInt();

    try {
      if (numeroUm > numeroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
      }

      contador(numeroUm, numeroDois);

    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    } finally {
      scanner.close();
    }

  }

  static void contador(int numeroUm, int numeroDois) {
    for (int i = numeroUm; i <= numeroDois; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}

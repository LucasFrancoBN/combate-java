package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os dados do primeiro campeão:");
    System.out.print("Nome: ");
    String nameFirstChampion = sc.nextLine();
    System.out.print("Vida inicial: ");
    int initialLifeFirstChampion = sc.nextInt();
    System.out.print("Ataque: ");
    int attackFirstChampion = sc.nextInt();
    System.out.print("Armadura: ");
    int armorFirstChampion = sc.nextInt();

    System.out.println();

    System.out.println("Digite os dados do segundo campeão:");
    System.out.print("Nome: ");
    sc.nextLine();
    String nameSecondChampion = sc.nextLine();
    System.out.print("Vida inicial: ");
    int initialLifeSecondChampion = sc.nextInt();
    System.out.print("Ataque: ");
    int attackSecondChampion = sc.nextInt();
    System.out.print("Armadura: ");
    int armorSecondChampion = sc.nextInt();

    Champion firstChampion = new Champion(nameFirstChampion, initialLifeFirstChampion, attackFirstChampion, armorFirstChampion);
    Champion secondChampion = new Champion(nameSecondChampion, initialLifeSecondChampion, attackSecondChampion, armorSecondChampion);

    System.out.println();
    System.out.print("Quantos turnos você deseja executar? ");
    int amountOfTurns = sc.nextInt();

    System.out.println();

    for(int i = 0; i < amountOfTurns; i++) {
      if(firstChampion.getLife() == 0 || secondChampion.getLife() == 0) {
        break;
      }

      System.out.printf("Resultado do turno %d:%n", i + 1);

      firstChampion.takeDamage(secondChampion);
      secondChampion.takeDamage(firstChampion);

      System.out.println(firstChampion.status());
      System.out.println(secondChampion.status());
      System.out.println();
    }

    System.out.println("FIM DO COMBATE");

    sc.close();
  }
}

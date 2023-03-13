package Application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import entities.Personagens;
import entities.Inimigos;
import java.util.Random;

public class App {
    public static void limpartela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        limpartela();

        Locale.setDefault(Locale.US);
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("|         Game test           |");
        System.out.println("===============================");
        System.out.println();
        System.out.print("Digite seu nome para comecar: ");
        String nome = sc.nextLine();

        Personagens heroi = new Personagens(nome, 100, 100, 1, "facada", "Bola de fogo", "desvia", "Fatality");

        Inimigos enemy1 = new Inimigos("Lacaio", 12, 100, 1, "Ataque básico", "paulada");

        Inimigos enemy2 = new Inimigos("Esqueleto", 15, 120, 2, "Ataque básico", "Flechada");

        Inimigos enemy3 = new Inimigos("Ogro", 20, 135, 3, "Ataque básico", "paulada", "Quebra nozes");

        Inimigos chefe = new Inimigos("Dragão", 20, 200, 10, "Baforada", "Terremoto", "Ataque estelar", "Meteoro");

        limpartela();
        char selection = 0;
        int vidaTotal = heroi.getVida();

        while (selection != '3') {

            System.out.println("===============================");
            System.out.println("|         Game test           |");
            System.out.println("===============================");
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("|           Menu               |");
            System.out.println("-------------------------------");
            System.out.println();
            System.out.println("[1] Batalha");
            System.out.println("[2] Habilidades");
            System.out.println("[3] Sair");
            System.out.println();
            System.out.print("Digite sua opção: ");
            selection = sc.next().charAt(0);

            int vidaTotalVilao1 = enemy1.getVida();
            int vidaTotalVilao2 = enemy2.getVida();
            int vidaTotalVilao3 = enemy3.getVida();
            int vidaTotalChefe = chefe.getVida();

            if (selection != '1' || selection != '2' || selection != '3' || selection != '4') {
                while (selection < '0' || selection > '4') {
                    System.out.println("Escolha invalida, escolha novamente: ");
                    selection = sc.next().charAt(0);
                }
            }

            if (selection == '1') {

                limpartela();
                
                if (heroi.getNivel() < 2) {
                    while (heroi.getVida() > 0 && enemy1.getVida() > 0) {

                        System.out.println("===============================");
                        System.out.println("|          Batalha            |");
                        System.out.println("===============================");
                        System.out.println();

                        System.out.println(heroi.getNome());
                        System.out.println("HP: " + heroi.getVida());
                        System.out.println("Nivel: " + heroi.getNivel());
                        System.out.println();
                        System.out.println("------------------------------------");
                        System.out.println();
                        System.out.println(enemy1.getNome());
                        System.out.println("HP: " + enemy1.getVida());
                        System.out.println("Nivel: " + enemy1.getNivel());
                        System.out.println();
                        System.out.println("===============================");
                        System.out.println("|          Ataques            |");
                        System.out.println("===============================");
                        System.out.println("[1] " + heroi.getHabilidade1());
                        System.out.println("[2] " + heroi.getHabilidade2());
                        if (heroi.getNivel() > 2) {
                            System.out.println("[3] " + heroi.getHabilidade3());
                        }
                        if (heroi.getNivel() > 3) {
                            System.out.println("[4] " + heroi.getHabilidade4());
                        }
                        int heroiDanoCausado = 0;
                        int vilaoDanoCausado = 0;

                        System.out.println("Escolha Seu ataque");
                        char escolha = sc.next().charAt(0);

                        if (escolha == '1') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(5) + 5;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                System.out.println("Vilão usou " + enemy1.getHabilidade1() + " e causou "
                                        + (enemy1.getDano() + (random.nextInt(4) + 2)) + " de dano");
                                vilaoDanoCausado = enemy1.getDano() + random.nextInt(4) + 2;
                            } else {
                                System.out.println("Vilão usou " + enemy1.getHabilidade2() + " e causou "
                                        + (enemy1.getDano() + (random.nextInt(8) + 2)) + " de dano");
                                vilaoDanoCausado = enemy1.getDano() + random.nextInt(8) + 2;
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = enemy1.getVida() - heroiDanoCausado;
                            enemy1.setVida(vilaoNovaVida);
                        }

                        if (escolha == '2') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(8) + 12;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                System.out.println("Vilão usou " + enemy1.getHabilidade1() + " e causou "
                                        + (enemy1.getDano() + (random.nextInt(4) + 2)) + " de dano");
                                vilaoDanoCausado = enemy1.getDano() + random.nextInt(4) + 2;
                            } else {
                                System.out.println("Vilão usou " + enemy1.getHabilidade2() + " e causou "
                                        + (enemy1.getDano() + (random.nextInt(8) + 2)) + " de dano");
                                vilaoDanoCausado = enemy1.getDano() + random.nextInt(8) + 2;
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = enemy1.getVida() - heroiDanoCausado;
                            enemy1.setVida(vilaoNovaVida);
                        }
                    }

                    if (heroi.getVida() > 0) {
                        Double addLevel = random.nextDouble(10) + 20;
                        if (heroi.getSomaNivel() == null) {
                            heroi.setSomaNivel(addLevel);
                        } else {
                            heroi.setSomaNivel(heroi.getSomaNivel() + addLevel);
                        }
                        
                        if (heroi.getSomaNivel() > 100.0) {
                            int level = heroi.getNivel() + 1;
                            vidaTotal += 10 * heroi.getNivel();
                            heroi.setDano(heroi.getDano() + 3 * heroi.getNivel());
                            heroi.setNivel(level);
                            heroi.setSomaNivel(heroi.getSomaNivel() - 100.0);
                            heroi.setVida(vidaTotal);
                        }
                        heroi.setVida(vidaTotal);
                    }
                    enemy1.setVida(vidaTotalVilao1);
                    double faltaLevel = 100.0 - heroi.getSomaNivel();
                    System.out.println("--------------------------------");
                    System.out.println(heroi.getNome());
                    System.out.println("HP: " + heroi.getVida());
                    System.out.printf("Nivel: %d, faltam %.1f%% para o próximo nivel", heroi.getNivel(), faltaLevel);
                    System.out.println();
                }


                else if (heroi.getNivel() < 3) {
                    while (heroi.getVida() > 0 && enemy2.getVida() > 0) {

                        System.out.println("===============================");
                        System.out.println("|          Batalha            |");
                        System.out.println("===============================");
                        System.out.println();

                        System.out.println(heroi.getNome());
                        System.out.println("HP: " + heroi.getVida());
                        System.out.println("Nivel: " + heroi.getNivel());
                        System.out.println();
                        System.out.println("------------------------------------");
                        System.out.println();
                        System.out.println(enemy2.getNome());
                        System.out.println("HP: " + enemy2.getVida());
                        System.out.println("Nivel: " + enemy2.getNivel());
                        System.out.println();
                        System.out.println("===============================");
                        System.out.println("|          Ataques            |");
                        System.out.println("===============================");
                        System.out.println("[1] " + heroi.getHabilidade1());
                        System.out.println("[2] " + heroi.getHabilidade2());
                        if (heroi.getNivel() > 2) {
                            System.out.println("[3] " + heroi.getHabilidade3());
                        }
                        if (heroi.getNivel() > 4) {
                            System.out.println("[4] " + heroi.getHabilidade4());
                        }
                        int heroiDanoCausado = 0;
                        int vilaoDanoCausado = 0;

                        System.out.println("Escolha Seu ataque");
                        char escolha = sc.next().charAt(0);

                        if (escolha == '1') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(6) + 10;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                vilaoDanoCausado = enemy2.getDano() + random.nextInt(8) + 8;
                                System.out.println("Vilão usou " + enemy2.getHabilidade1() + " e causou " + vilaoDanoCausado + " de dano");
                                
                            } else {
                                vilaoDanoCausado = enemy2.getDano() + random.nextInt(8) + 8;
                                System.out.println("Vilão usou " + enemy2.getHabilidade2() + " e causou " + vilaoDanoCausado + " de dano");
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = enemy2.getVida() - heroiDanoCausado;
                            enemy2.setVida(vilaoNovaVida);
                        }

                        if (escolha == '2') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(8) + 12;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                vilaoDanoCausado = enemy2.getDano() + random.nextInt(8) + 8;
                                System.out.println("Vilão usou " + enemy2.getHabilidade1() + " e causou " + vilaoDanoCausado + " de dano");
                            } else {
                                vilaoDanoCausado = enemy2.getDano() + random.nextInt(8) + 8;
                                System.out.println("Vilão usou " + enemy2.getHabilidade1() + " e causou " + vilaoDanoCausado + " de dano");
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = enemy2.getVida() - heroiDanoCausado;
                            enemy2.setVida(vilaoNovaVida);
                        }
                    }

                    if (heroi.getVida() > 0) {
                        double addLevel = random.nextDouble(10) + 20;
                        heroi.setSomaNivel(addLevel);
                        if (heroi.getSomaNivel() > 100.0) {
                            int level = heroi.getNivel() + 1;
                            vidaTotal += 10 * heroi.getNivel();
                            heroi.setDano(heroi.getDano() + 3 * heroi.getNivel());
                            heroi.setNivel(level);
                            heroi.setSomaNivel(heroi.getSomaNivel() - 100.0);
                            heroi.setVida(vidaTotal);
                        }
                        heroi.setVida(vidaTotal);
                    }
                    enemy2.setVida(vidaTotalVilao2);
                    double faltaLevel = 100.0 - heroi.getSomaNivel();
                    System.out.println("--------------------------------");
                    System.out.println(heroi.getNome());
                    System.out.println("HP: " + heroi.getVida());
                    System.out.printf("Nivel: %d, faltam %.1f%% para o próximo nivel", heroi.getNivel(), faltaLevel);
                    System.out.println();

                }
                
                else if (heroi.getNivel() < 4) {
                    while (heroi.getVida() > 0 && enemy3.getVida() > 0) {

                        System.out.println("===============================");
                        System.out.println("|          Batalha            |");
                        System.out.println("===============================");
                        System.out.println();

                        System.out.println(heroi.getNome());
                        System.out.println("HP: " + heroi.getVida());
                        System.out.println("Nivel: " + heroi.getNivel());
                        System.out.println();
                        System.out.println("------------------------------------");
                        System.out.println();
                        System.out.println(enemy3.getNome());
                        System.out.println("HP: " + enemy3.getVida());
                        System.out.println("Nivel: " + enemy3.getNivel());
                        System.out.println();
                        System.out.println("===============================");
                        System.out.println("|          Ataques            |");
                        System.out.println("===============================");
                        System.out.println("[1] " + heroi.getHabilidade1());
                        System.out.println("[2] " + heroi.getHabilidade2());
                        if (heroi.getNivel() > 2) {
                            System.out.println("[3] " + heroi.getHabilidade3());
                        }
                        if (heroi.getNivel() > 4) {
                            System.out.println("[4] " + heroi.getHabilidade4());
                        }
                        int heroiDanoCausado = 0;
                        int vilaoDanoCausado = 0;

                        System.out.println("Escolha Seu ataque");
                        char escolha = sc.next().charAt(0);

                        if (escolha == '1') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(5) + 5;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                System.out.println("Vilão usou " + enemy3.getHabilidade1() + " e causou "
                                        + (enemy3.getDano() + (random.nextInt(4) + 2)) + " de dano");
                                vilaoDanoCausado = enemy3.getDano() + random.nextInt(4) + 2;
                            } else {
                                System.out.println("Vilão usou " + enemy3.getHabilidade2() + " e causou "
                                        + (enemy3.getDano() + (random.nextInt(8) + 2)) + " de dano");
                                vilaoDanoCausado = enemy3.getDano() + random.nextInt(8) + 2;
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = enemy3.getVida() - heroiDanoCausado;
                            enemy3.setVida(vilaoNovaVida);
                        }

                        if (escolha == '2') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(8) + 12;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                System.out.println("Vilão usou " + enemy3.getHabilidade1() + " e causou "
                                        + (enemy3.getDano() + (random.nextInt(4) + 2)) + " de dano");
                                vilaoDanoCausado = enemy3.getDano() + random.nextInt(4) + 2;
                            } else {
                                System.out.println("Vilão usou " + enemy3.getHabilidade2() + " e causou "
                                        + (enemy3.getDano() + (random.nextInt(8) + 2)) + " de dano");
                                vilaoDanoCausado = enemy3.getDano() + random.nextInt(8) + 2;
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = enemy3.getVida() - heroiDanoCausado;
                            enemy3.setVida(vilaoNovaVida);
                        }
                    }

                    if (heroi.getVida() > 0) {
                        double addLevel = random.nextDouble(10) + 20;
                        heroi.setSomaNivel(addLevel);
                        if (heroi.getSomaNivel() > 100.0) {
                            int level = heroi.getNivel() + 1;
                            vidaTotal += 10 * heroi.getNivel();
                            heroi.setDano(heroi.getDano() + 3 * heroi.getNivel());
                            heroi.setNivel(level);
                            heroi.setSomaNivel(heroi.getSomaNivel() - 100.0);
                            heroi.setVida(vidaTotal);
                        }
                        heroi.setVida(vidaTotal);
                    }
                    enemy3.setVida(vidaTotalVilao3);
                    double faltaLevel = 100.0 - heroi.getSomaNivel();
                    System.out.println("--------------------------------");
                    System.out.println(heroi.getNome());
                    System.out.println("HP: " + heroi.getVida());
                    System.out.printf("Nivel: %d, faltam %.1f%% para o próximo nivel", heroi.getNivel(), faltaLevel);
                    System.out.println();

                }
                
                else if (heroi.getNivel() > 4) {
                    while (heroi.getVida() > 0 && chefe.getVida() > 0) {

                        System.out.println("===============================");
                        System.out.println("|          Batalha            |");
                        System.out.println("===============================");
                        System.out.println();

                        System.out.println(heroi.getNome());
                        System.out.println("HP: " + heroi.getVida());
                        System.out.println("Nivel: " + heroi.getNivel());
                        System.out.println();
                        System.out.println("------------------------------------");
                        System.out.println();
                        System.out.println(chefe.getNome());
                        System.out.println("HP: " + chefe.getVida());
                        System.out.println("Nivel: " + chefe.getNivel());
                        System.out.println();
                        System.out.println("===============================");
                        System.out.println("|          Ataques            |");
                        System.out.println("===============================");
                        System.out.println("[1] " + heroi.getHabilidade1());
                        System.out.println("[2] " + heroi.getHabilidade2());
                        if (heroi.getNivel() > 2) {
                            System.out.println("[3] " + heroi.getHabilidade3());
                        }
                        if (heroi.getNivel() > 4) {
                            System.out.println("[4] " + heroi.getHabilidade4());
                        }
                        int heroiDanoCausado = 0;
                        int vilaoDanoCausado = 0;

                        System.out.println("Escolha Seu ataque");
                        char escolha = sc.next().charAt(0);

                        if (escolha == '1') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(5) + 5;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                System.out.println("Vilão usou " + chefe.getHabilidade1() + " e causou " + (chefe.getDano() + (random.nextInt(4) + 2)) + " de dano");
                                vilaoDanoCausado = chefe.getDano() + random.nextInt(4) + 2;
                            } else {
                                System.out.println("Vilão usou " + chefe.getHabilidade2() + " e causou " + (chefe.getDano() + (random.nextInt(8) + 2)) + " de dano");
                                vilaoDanoCausado = chefe.getDano() + random.nextInt(8) + 2;
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = chefe.getVida() - heroiDanoCausado;
                            chefe.setVida(vilaoNovaVida);
                        }

                        if (escolha == '2') {
                            limpartela();
                            System.out.print("#");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("%");
                            Thread.sleep(150);
                            System.out.print("@");
                            Thread.sleep(150);
                            System.out.print("*");
                            Thread.sleep(150);
                            System.out.print("$");
                            Thread.sleep(150);

                            limpartela();

                            heroiDanoCausado = heroi.getDano() + random.nextInt(8) + 12;
                            int vilaoDano = 0;

                            System.out.println("Voce causou " + heroiDanoCausado + " de dano.");
                            if (vilaoDano == 0) {
                                System.out.println("Vilão usou " + chefe.getHabilidade1() + " e causou "
                                        + (chefe.getDano() + (random.nextInt(4) + 2)) + " de dano");
                                vilaoDanoCausado = chefe.getDano() + random.nextInt(4) + 2;
                            } else {
                                System.out.println("Vilão usou " + chefe.getHabilidade2() + " e causou "
                                        + (chefe.getDano() + (random.nextInt(8) + 2)) + " de dano");
                                vilaoDanoCausado = chefe.getDano() + random.nextInt(8) + 2;
                            }
                            Thread.sleep(500);

                            int heroiNovaVida = heroi.getVida() - vilaoDanoCausado;
                            heroi.setVida(heroiNovaVida);
                            int vilaoNovaVida = chefe.getVida() - heroiDanoCausado;
                            chefe.setVida(vilaoNovaVida);
                        }
                    }

                    if (heroi.getVida() > 0) {
                        double addLevel = random.nextDouble(10) + 20;
                        heroi.setSomaNivel(addLevel);
                        if (heroi.getSomaNivel() > 100.0) {
                            int level = heroi.getNivel() + 1;
                            vidaTotal += 10 * heroi.getNivel();
                            heroi.setDano(heroi.getDano() + 3 * heroi.getNivel());
                            heroi.setNivel(level);
                            heroi.setSomaNivel(heroi.getSomaNivel() - 100.0);
                            heroi.setVida(vidaTotal);
                        }
                        heroi.setVida(vidaTotal);
                    }
                    chefe.setVida(vidaTotalChefe);
                    double faltaLevel = 100.0 - heroi.getSomaNivel();
                    System.out.println("--------------------------------");
                    System.out.println(heroi.getNome());
                    System.out.println("HP: " + heroi.getVida());
                    System.out.printf("Nivel: %d, faltam %.1f%% para o próximo nivel", heroi.getNivel(), faltaLevel);
                    System.out.println();

                }
            }

        }
        

        sc.close();
    }
}

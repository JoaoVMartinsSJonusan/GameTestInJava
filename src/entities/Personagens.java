package entities;

import java.util.Random;

public class Personagens {
    
    public String nome;
    private Integer dano;
    private Integer vida;
    private Integer nivel;
    private String habilidade1;
    private String habilidade2;
    private String habilidade3;
    private String habilidade4;
    private Double somaNivel;

    Random random = new Random();

    public Personagens() {
    }

    
    
    public Personagens(String nome, Integer dano, Integer vida, Integer nivel, String habilidade1, String habilidade2) {
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
        this.nivel = nivel;
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
    }



    public Personagens(String nome, Integer dano, Integer vida, Integer nivel, String habilidade1, String habilidade2,
            String habilidade3) {
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
        this.nivel = nivel;
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
        this.habilidade3 = habilidade3;
    }



    public Personagens(String nome, Integer dano, Integer vida, Integer nivel, String habilidade1, String habilidade2,
            String habilidade3, String habilidade4) {
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
        this.nivel = nivel;
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
        this.habilidade3 = habilidade3;
        this.habilidade4 = habilidade4;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public Integer getDano() {
        return dano;
    }



    public void setDano(Integer dano) {
        this.dano = dano;
    }



    public Integer getVida() {
        return vida;
    }



    public void setVida(Integer vida) {
        this.vida = vida;
    }



    public Integer getNivel() {
        return nivel;
    }



    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }



    public String getHabilidade1() {
        return habilidade1;
    }



    public void setHabilidade1(String habilidade1) {
        this.habilidade1 = habilidade1;
    }



    public String getHabilidade2() {
        return habilidade2;
    }



    public void setHabilidade2(String habilidade2) {
        this.habilidade2 = habilidade2;
    }



    public String getHabilidade3() {
        return habilidade3;
    }



    public void setHabilidade3(String habilidade3) {
        this.habilidade3 = habilidade3;
    }



    public String getHabilidade4() {
        return habilidade4;
    }



    public void setHabilidade4(String habilidade4) {
        this.habilidade4 = habilidade4;
    }



    public Double getSomaNivel() {
        return somaNivel;
    }



    public void setSomaNivel(Double somaNivel) {
        this.somaNivel = somaNivel;
    }



    public Random getRandom() {
        return random;
    }



    public void setRandom(Random random) {
        this.random = random;
    }

    
    
    

    


}

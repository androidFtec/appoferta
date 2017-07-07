package br.com.trinopolo.appoferta.oferta;

/**
 * Created by marconvcm on 07/07/2017.
 */

public class Oferta {

    private int id;
    private float valor;
    private float desconto;
    private float entrada;
    private int condicoes;

    public Oferta(int id, float valor, float desconto, float entrada, int condicoes) {

        this.id = id;
        this.valor = valor;
        this.desconto = desconto;
        this.entrada = entrada;
        this.condicoes = condicoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public int getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(int condicoes) {
        this.condicoes = condicoes;
    }
}

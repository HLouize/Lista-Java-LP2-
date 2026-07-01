package banco;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Transacao {

    private float valor;
    private char tipo;
    private Date data;
    private String descricao;

    public Transacao(float valor, char tipo, Date data, String descricao) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
    }

    public Transacao(float valor, char tipo, String descricao) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = new Date();
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public char getTipo() {
        return tipo;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        return tipo + " "
                + formatoData.format(data)
                + " "
                + descricao
                + " "
                + valor;
    }
}

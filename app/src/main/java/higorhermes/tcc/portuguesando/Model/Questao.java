package higorhermes.tcc.portuguesando.Model;

import java.util.ArrayList;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by higor on 06/06/18.
 */

public class Questao extends RealmObject {
    @PrimaryKey
    private int id_questao;
    private String texto, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e;
    private int alternativa_correta, ajuda1, ajuda2, ajuda3, id_assunto;
    private Assunto objAssunto;

    public Questao(){
    }

    public Questao(int id_questao, String texto){
        this.id_questao = id_questao;
        this.texto = texto;
    }

    public void adicionarAjudas(int ajuda1, int ajuda2, int ajuda3){
        this.ajuda1 = ajuda1;
        this.ajuda2 = ajuda2;
        this.ajuda3 = ajuda3;
    }

    public int getId_questao() {
        return id_questao;
    }

    public void setId_questao(int id_questao) {
        this.id_questao = id_questao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAlternativa_a() {
        return alternativa_a;
    }

    public void setAlternativa_a(String alternativa_a) {
        this.alternativa_a = alternativa_a;
    }

    public String getAlternativa_b() {
        return alternativa_b;
    }

    public void setAlternativa_b(String alternativa_b) {
        this.alternativa_b = alternativa_b;
    }

    public String getAlternativa_c() {
        return alternativa_c;
    }

    public void setAlternativa_c(String alternativa_c) {
        this.alternativa_c = alternativa_c;
    }

    public String getAlternativa_d() {
        return alternativa_d;
    }

    public void setAlternativa_d(String alternativa_d) {
        this.alternativa_d = alternativa_d;
    }

    public String getAlternativa_e() {
        return alternativa_e;
    }

    public void setAlternativa_e(String alternativa_e) {
        this.alternativa_e = alternativa_e;
    }

    public int getAlternativa_correta() {
        return alternativa_correta;
    }

    public void setAlternativa_correta(int alternativa_correta) {
        this.alternativa_correta = alternativa_correta;
    }

    public int getAjuda1() {
        return ajuda1;
    }

    public void setAjuda1(int ajuda1) {
        this.ajuda1 = ajuda1;
    }

    public int getAjuda2() {
        return ajuda2;
    }

    public void setAjuda2(int ajuda2) {
        this.ajuda2 = ajuda2;
    }

    public int getAjuda3() {
        return ajuda3;
    }

    public void setAjuda3(int ajuda3) {
        this.ajuda3 = ajuda3;
    }

    public Assunto getObjAssunto() {
        return objAssunto;
    }

    public void setObjAssunto(Assunto objAssunto) {
        this.objAssunto = objAssunto;
    }

    public int getId_assunto() {
        return id_assunto;
    }

    public void setId_assunto(int id_assunto) {
        this.id_assunto = id_assunto;
    }
}

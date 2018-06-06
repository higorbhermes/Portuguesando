package higorhermes.tcc.portuguesando.Model;

import io.realm.RealmObject;

/**
 * Created by higor on 06/06/18.
 */

public class Questao extends RealmObject {
    String id, texto, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta, ajuda1, ajuda2, ajuda3;
    Assunto objAssunto;

    public Assunto getObjAssunto() {
        return objAssunto;
    }

    public void setObjAssunto(Assunto objAssunto) {
        this.objAssunto = objAssunto;
    }

    public Questao(){
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAlternativa_correta() {
        return alternativa_correta;
    }

    public void setAlternativa_correta(String alternativa_correta) {
        this.alternativa_correta = alternativa_correta;
    }

    public String getAjuda1() {
        return ajuda1;
    }

    public void setAjuda1(String ajuda1) {
        this.ajuda1 = ajuda1;
    }

    public String getAjuda2() {
        return ajuda2;
    }

    public void setAjuda2(String ajuda2) {
        this.ajuda2 = ajuda2;
    }

    public String getAjuda3() {
        return ajuda3;
    }

    public void setAjuda3(String ajuda3) {
        this.ajuda3 = ajuda3;
    }
}

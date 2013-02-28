package Modelo;

/**
 *
 * @author Beatriz Rezener , Felipe
 */
public class DisciplinaCursada {


    private String nome;
    private String codigo;
    private String cod_preReq;

    public DisciplinaCursada(String nome, String codigo, String cod_preReq) {
        this.nome = nome;
        this.codigo = codigo;
        this.cod_preReq = cod_preReq;
    }

    public DisciplinaCursada() {
        this.nome = null;
        this.codigo = null;
        this.cod_preReq = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCod_preReq() {
        return cod_preReq;
    }

    public void setCod_preReq(String cod_preReq) {
        this.cod_preReq = cod_preReq;
    }

    @Override
    public String toString() {
        return "DisciplinasCursadas{" + "nome=" + nome + ", codigo=" + codigo + ", cod_preReq=" + cod_preReq + "}\n";
    }
        
    
}

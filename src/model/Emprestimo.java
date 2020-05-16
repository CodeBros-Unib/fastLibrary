package model;

public class Emprestimo {
    private int IdEmprestimo;
    private int IdLivro;
    private String CpfSolictante;
    private String DataEmprestimo;
    private String DataDevolucao;

    public int getIdEmprestimo() {
        return IdEmprestimo;
    }

    public void setIdEmprestimo(int IdEmprestimo) {
        this.IdEmprestimo = IdEmprestimo;
    }

    public int getIdLivro() {
        return IdLivro;
    }

    public void setIdLivro(int IdLivro) {
        this.IdLivro = IdLivro;
    }

    public String getCpfSolictante() {
        return CpfSolictante;
    }

    public void setCpfSolictante(String CpfSolictante) {
        this.CpfSolictante = CpfSolictante;
    }

    public String getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(String DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }

    public String getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }       
}

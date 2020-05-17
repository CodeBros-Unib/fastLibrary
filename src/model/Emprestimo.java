package model;

public class Emprestimo {
    private int IdEmprestimo;
    private int IdLivro;
    private String Titulo;
    private String CpfSolicitante;
    private String Solicitante;
    private String DataEmprestimo;
    private String DataDevolucao;
    private String Status;

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

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCpfSolicitante() {
        return CpfSolicitante;
    }

    public void setCpfSolicitante(String CpfSolicitante) {
        this.CpfSolicitante = CpfSolicitante;
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String Solicitante) {
        this.Solicitante = Solicitante;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}

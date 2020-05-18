package model;

import java.time.LocalDate;

public class Emprestimo {
    private int IdEmprestimo;
    private int IdLivro;
    private String Titulo;
    private String CpfSolicitante;
    private String Solicitante;
    private LocalDate DataEmprestimo;
    private LocalDate DataDevolucao;
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

    public LocalDate getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}

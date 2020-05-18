package model;

import java.time.LocalDate;

public class Emprestimo {
    private int IdEmprestimo;
    private int IdLivro;
    private String CpfSolictante;
    private LocalDate DataEmprestimo;
    private LocalDate DataDevolucao;

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
}

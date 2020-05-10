package model;

import java.util.ArrayList;

public class User {
    private int Codigo;
    private String Nome;
    private String Cpf;
    private String Sexo;
    private String Endereco;
    ArrayList<Book> ListBook;

    public User() {
        ListBook = new ArrayList();
    }

    public User(int Codigo, String Nome, String Cpf, String Sexo, String Endereco) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        ListBook = new ArrayList();
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public ArrayList<Book> getListBook() {
        return ListBook;
    }

    public void setListBook(ArrayList<Book> ListBook) {
        this.ListBook = ListBook;
    }
    
    public void addBook(Book B) {
        B.setUser(this);
        ListBook.add(B);
    }    
}

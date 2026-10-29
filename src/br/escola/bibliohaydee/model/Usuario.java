package br.escola.bibliohaydee.model;

public class Usuario {
    public static final int LIMITE_PADRAO = 3;
    private String nome;
    private String matricula;
    private String tipo;
    private Integer limiteEmprestimo;
    private Integer emprestimosAtivos;

    public Usuario(String nomeEntrada, String matriculaEntrada, String tipoEntrada, Integer limiteEmprestimoEntrada) {
        if (nomeEntrada == null || nomeEntrada.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        if (tipoEntrada == null || (!tipoEntrada.equals("ALUNO") && !tipoEntrada.equals("PROFESSOR"))) {
            throw new IllegalArgumentException("Tipo deve ser somente ALUNO ou PROFESSOR.");
        }

        nome = nomeEntrada;
        matricula = matriculaEntrada;
        tipo = tipoEntrada;
        limiteEmprestimo = limiteEmprestimoEntrada;

        emprestimosAtivos = 0;
    }

  public String getNome() {
    return nome;
  }
  public String getMatricula() {
        return matricula;
  }
  public String getTipo() {
        return tipo;
  }
  public Integer getLimiteEmprestimo() {
        return limiteEmprestimo;
  }
  public Integer getEmprestimosAtivos() {
        return emprestimosAtivos;
  }
    public Usuario(String nome, String matricula, String tipo) {
        this(nome, matricula, tipo, LIMITE_PADRAO);
    }
    public boolean setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return false;
        }
        this.nome = nome.trim();
        return true;
    }
    public boolean setLimiteEmprestimo(int limiteEmprestimo) {
        if (limiteEmprestimo < 1) {
            return false;
        }
        this.limiteEmprestimo = limiteEmprestimo;
        return true;
    }
}
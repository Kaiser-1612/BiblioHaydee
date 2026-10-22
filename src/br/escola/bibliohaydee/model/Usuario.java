package br.escola.bibliohaydee.model;

public class Usuario {
    private String nome;
    private String matricula;
    private String tipo;
    private Integer limiteEmprestimo;
    private Integer emprestimosAtivos;

    public Usuario(String nomeEntrada, String matriculaEntrada, String tipoEntrada, Integer limiteEmprestimoEntrada) throws IllegalAccessException {
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
}
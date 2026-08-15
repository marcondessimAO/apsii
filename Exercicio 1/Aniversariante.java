public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    // Questão 2a: Construtor que recebe nome, dia e mês
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    // Questão 2b: Construtor que recebe nome e objeto DataAniversario
    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
       }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    // Questão 1: Implementação do método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aniversariante that = (Aniversariante) obj;
        return this.nome.equals(that.nome) && this.dataAniversario.equals(that.dataAniversario);
    }
}

import java.util.ArrayList;

// Questão 3: Implementação da classe MinhaAgendaDeAniversarios
public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    
    private ArrayList<Aniversariante> aniversariantes;
    
    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        this.aniversariantes.add(new Aniversariante(nome, dia, mes));
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> aniversariantesDoDia = new ArrayList<>();
        DataAniversario data = new DataAniversario(dia, mes);
        
        for (Aniversariante a : this.aniversariantes) {
            if (a.getDataAniversario().equals(data)) {
                aniversariantesDoDia.add(a.getNome());
            }
        }
        return aniversariantesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = 0; i < this.aniversariantes.size(); i++) {
            if (this.aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
                this.aniversariantes.remove(i);
                i--; // ajusta o índice após a remoção
            }
        }
    }
}

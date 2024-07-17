import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    private List<T> itens;

    public ListaGenerica() {
        this.itens = new ArrayList<>();
    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public T obter(int index) {
        return itens.get(index);
    }

    public List<T> obterTodos() {
        return itens;
    }

    public static void main(String[] args) {
        ListaGenerica<Object> listaDeMarcas = new ListaGenerica<>();
        
        Toyota camry = new Toyota("Camry", 2020);
        Honda civic = new Honda("Civic", 2019);
        Chevrolet impala = new Chevrolet("Impala", 2021);

        listaDeMarcas.adicionar(camry);
        listaDeMarcas.adicionar(civic);
        listaDeMarcas.adicionar(impala);

        for (Object marca : listaDeMarcas.obterTodos()) {
            System.out.println(marca);
        }
    }
}

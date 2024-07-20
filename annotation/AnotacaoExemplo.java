import java.lang.annotation.Annotation;

public class AnotacaoExemplo {
    public static void main(String[] args) {

        Class<MinhaClasse> obj = MinhaClasse.class;

        if (obj.isAnnotationPresent(Tabela.class)) {

            Annotation anotacao = obj.getAnnotation(Tabela.class);
            Tabela tabela = (Tabela) anotacao;


            System.out.println("Nome da Tabela: " + tabela.valor());
        } else {
            System.out.println("A anotação Tabela não está presente.");
        }
    }
}

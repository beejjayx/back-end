public class ReadingTabela {
    public static void main(String[] args) {
        Class<?> clazzz = ClasseAnnotation.class;

        if (clazzz.isAnnotationPresent(TabelaAnnotation.class)) {
            TabelaAnnotation info = clazzz.getAnnotation(TabelaAnnotation.class);
            System.out.println("Tabela: " + info.value());
        }
    }
}
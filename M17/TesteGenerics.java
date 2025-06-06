public class TesteGenerics {
    public static void main(String[] args) {
        ListaCarros<Car> lista = new ListaCarros<>();

        lista.adicionarCarro(new Sedan("Chevrolet", "Corsa"));
        lista.adicionarCarro(new Caminhonete("Volkswagen", "Saveiro"));

        lista.listarCarros();
    }
}

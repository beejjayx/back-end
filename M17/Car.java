abstract class Car {
    private String marca;
    private String modelo;

    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { 
        return marca; 
    }
    public String getModelo() { 
        return modelo; 
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "| Modelo: " + modelo;
    }
}


class Sedan extends Car {
    public Sedan(String marca, String modelo) {
        super(marca, modelo);
    }
}

class Caminhonete extends Car {
    public Caminhonete(String marca, String modelo) {
        super(marca, modelo);
    }
}
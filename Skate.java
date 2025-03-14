package homework;

public class Skate {

    // CRIACAO DOS ATRIBUTOS
    private int size;

    private String shape;

    private String wheels;

    public int getSize() {
        return size;
    }

    //GETTERS AND SETTERS
    public void setSize(int size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    
    //METODO PARA ATRIBUIR O VALOR RECEBIDO AO ATRIBUTO SHAPE
    public void registerShape(String shape) {
        setShape(shape);
    }
}

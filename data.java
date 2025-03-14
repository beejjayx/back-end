package homework;

public class data {
    
    //cria um objeto da classe Skate e chamma registerShape para definir a marca do Shape
    public static void main(String args[]) {
        Skate skate = new Skate();
        skate.registerShape("Element");
        skate.setSize(8);
        skate.setWheels("Black Sheep");

        System.out.println(skate.getShape());
        System.out.println(skate.getSize());
        System.out.println(skate.getWheels());
    }
}

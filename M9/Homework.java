class Homework {
    public static void main(String args[]) {
        System.out.println("Valor inicial primitivo: " + args[0]);
        int num1 = Integer.parseInt(args[0]);
        Integer wNumber = Integer.valueOf(num1);

        System.out.println(wNumber);
    }
}
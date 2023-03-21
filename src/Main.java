public class Main {
    public static void main(String[] args) {
        // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
        Pizzas creadaConBuilder = new BuilderPizzas().build();
        Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.BIG)
                .build();
        Pizzas vegetariana=new Pizzas(0,3,false,false,true,0);
        Pizzas romana=new Pizzas(1,2,true,false,false,1);
        // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());
        System.out.println(vegetariana);
        System.out.println(romana);


    }
}

public class Main {
    public static void main(String[] args) {
        // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
        Pizzas creadaConBuilder = new BuilderPizzas().build();
        Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.BIG)
                .build();

        // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());
        //El toString lo puse a mi gusto para que en vez de salir los numeros asociados a size o tipo de masa salieran los literales
        //que tenemos declarados al inicio de la clase pizzas

    }
}

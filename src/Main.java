public class Main {
    /**
     *Proyecto buirler para trabajar con el patron builder
     *
     * @author Alejandra Dominguez
     * @version 0.1
     */
    public static void main(String[] args) {
        // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
        Pizzas_2023 creadaConBuilder = new BuilderPizzas().build();
        Pizzas_2023 champiñona=new Pizzas_2023(0,2,true,false,true,1,false,true);
        System.out.println(champiñona);
        Pizzas_2023 olivica=new Pizzas_2023(1,3,false,false,false,1,true,true);
        System.out.println(olivica);
        System.out.println(creadaConBuilder.toString());

    }
}

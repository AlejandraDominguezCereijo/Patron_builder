¿Cual es la función de este patrón?

Tener creados los build con los valores basicos predeterminados que queramos, por ejemplo para recetas,
de esta manera no tenemos que pasar los datos uno por uno y podemos hacerle las modificaciones que mas nos apetezca usando los .set

¿Como es su Diagrama de clases? Realiza en el readme el diagrama

classDiagram

class Main{

Pizzas_2023 champiñona

Pizzas_2023 olivica

+main()

}
Main "1" *-- "1..*" 

BuilderPizzas : association

class BuilderPizzas{

+build()
}

PizzaBuilder "1" *-- "1" 

Pizzas_2023 : association

class Pizzas_2023 
{
+Pizzas_2023()}


¿Podríamos combinarlo con el patrón Factory?

  

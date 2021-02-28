package Ejercicio1; //Paquete donde se encuentra la clase

public class Rectangle { //Declaracion de una clase publica
    public int width = 0; //Atributo numerico entero publico para ser accesible y editable (Ancho)
    public int height = 0;//Atributo numerico entero publico para ser accesible y editable (Alto)

    public int area(){//Metodo publico que retorna el are de una instancia de un rectangulo segun su ancho y su alto
        return this.width * this.height;//Retorno de valor numerico entero
    }
}

package Ejercicio1;//SOLVE 1: Se ha agregado el nombre del paquete antes de al declaracion de la clase

public class SomethingIsWrong {//ISSUE 1: No se incluyo el nombre del paquete en la clase
    public static void main(String[] args) {
        Rectangle myRect;   //ISSUE 2: No existe la clase Rectangle
                            //SOLVE 2: Se creo la clase Rectangle dentro del mismo paquete
                            //ISSUE 2.1: No se ha instanciado myRectangle
        myRect = new Rectangle();//SOLVE 2.1: Se instancio my Rect
        myRect.width = 40;  //ISSUE 3: No existe un atributo que se llame width dentro de la clase Rectangle
                            //SOLVE 3: Se creo la propiedad width a la clase rectangle
        myRect.height = 50; //ISSUE 4: No existe un atributo que se llame height dentro de la clase Rectangle
                            //SOLVE 4: Se creo la propiedad hright a la clase rectangle
        System.out.println("myRect's area is " + myRect.area()); //ISSUE 5: No existe el metodo Area dentro de la clase Rectangle
                                                                 //SOLVE 5: Se creo el metodo Area en la clase rectangle que multiplica width por height
    }
}
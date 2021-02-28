package Ejercicio2;//Paquete donde se encuentra la clase

public class IdentifyController { //Declaracion de la clase
    public static void main(String[] args){//El metodo Main es el que el programa buscara para ejecutar cuando se corra el propgrama
        IdentifyMyPartz a = new IdentifyMyPartz();//Instancia 1 de la clase IdentifyMyPartz
        IdentifyMyPartz b = new IdentifyMyPartz();//Instancia 2 de la clase IdentifyMyPartz

        a.y = 5;//Este valor se queda exclusivamente para y de la instancia a
        b.y = 6;//Este valor se queda exclusivamente para y de la instancia b
        a.x = 1;//El valor de x ha passado de ser 7 a ser 1 para todas las instancias
        b.x = 2;//Ahora el valor de x ha pasado de ser 1 a ser 7 para todas las instancias

        System.out.println("a.y = " + a.y);//Retorna 5
        System.out.println("b.y = " + b.y);//Retorna 6
        System.out.println("a.x = " + a.x);//Retorna el ultimo valor asignado a la variable estatica (2)
        System.out.println("b.x = " + b.x);//Retorna el ultimo valor asignado a la variable estatica (2)
        System.out.println("IdentifyMyPartz.x = " + IdentifyMyPartz.x);//Se puede acceder al atributo x sin instanciar, este valor fue modificado y ahora retorna 2
    }
}

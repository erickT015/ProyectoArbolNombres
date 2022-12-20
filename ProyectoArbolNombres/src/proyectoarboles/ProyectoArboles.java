package proyectoarboles;
import javax.swing.JOptionPane;
public class ProyectoArboles{

public static void main(String[] argumentos) {

ArbolCadena arbolCadenas = new ArbolCadena();
String nombre, genero;
int definir;
int selec;
do {
selec = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones \n"+
"1.Ingresar Nombres \n"+
"2. Mostrar Inorden \n"+
"3. Mostrar Preorden \n"+
"4.. Mostrar Postorden \n"+
"5. Mostrar Árbol \n"+
"6.. Salir"));
switch (selec) {
case 1:
    String seleccion = " ";
    do{
    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
    genero = JOptionPane.showInputDialog(" Ingrese el genero M - F");
    seleccion = JOptionPane.showInputDialog("Desea agregar otro nombre? s - n");
    arbolCadenas.insertar(nombre, genero);
    }while (seleccion != "n");

    break;
case 2:
    System.out.println("Recorriendo inorden:");
    arbolCadenas.inorden();
    break;
case 3:
    System.out.println("Recorriendo postorden:");
    arbolCadenas.postorden();
    break;
case 4:
    System.out.println("Recorriendo preorden:");
    arbolCadenas.preorden();
    break;
case 5:
	break;
case 6:
    System.out.println("Saliendo...");
    break;
default:
    }
    } while (selec != 6);
true
    }
    }
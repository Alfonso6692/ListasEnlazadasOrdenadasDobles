import org.w3c.dom.CDATASection;

public class Main {
    public static void main(String[] args) {
        /*
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarInicio(1);
        listaEnlazada.agregarInicio(2);
        listaEnlazada.agregarInicio(3);
        listaEnlazada.agregarFinal(5);
        listaEnlazada.eliminar(3);
        listaEnlazada.verLista();
        */
//         ListaEnlazadaOrdenada listaEnlazadaOrdenada = new ListaEnlazadaOrdenada();
//         listaEnlazadaOrdenada.insertarOrden(1);
//        listaEnlazadaOrdenada.insertarOrden(3);
//        listaEnlazadaOrdenada.insertarOrden(2);
//        listaEnlazadaOrdenada.insertarOrden(5);
//        listaEnlazadaOrdenada.insertarOrden(4);
//        listaEnlazadaOrdenada.verLista();
//        //System.out.println();
//        //listaEnlazadaOrdenada.buscar(1);

        ListaEnlazadaDoble listaEnlazadaDoble = new ListaEnlazadaDoble();
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        //listaEnlazada.eliminar(1);
        listaEnlazadaDoble.agregar(1);
        listaEnlazadaDoble.agregar(2);
        listaEnlazadaDoble.agregar(3);
        listaEnlazadaDoble.agregar(4);
        //listaEnlazadaDoble.eliminarInicio();//elimina el inicio "1"
        //istaEnlazadaDoble.eliminar();//elimina el ultimo "4"
        //listaEnlazadaDoble.agregarinicio(5);
        //listaEnlazadaDoble.tamaño();
        System.out.println();

        listaEnlazadaDoble.verLista();




    }
}

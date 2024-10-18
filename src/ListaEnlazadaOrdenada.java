public class ListaEnlazadaOrdenada extends ListaEnlazada {
    public ListaEnlazadaOrdenada() {
        super ();
    }

    public ListaEnlazadaOrdenada insertarOrden (int dato) {
        Nodo nuevo;
        nuevo = new Nodo(dato);//primero
        if (primero == null)
            primero = nuevo;
        else if (dato < primero.getDato()) { //nodoa=1 Nodob=3
            nuevo.setRef(primero);
            primero = nuevo;
        } else {
            Nodo anterior, primero0;
            anterior = primero0 = primero;

            while ((primero0.getRef() != null) && dato > primero0.getDato()) {
                anterior = primero0;
                primero0 = primero0.getRef();
            }
            if (dato > primero0.getDato())
                anterior = primero0;
            nuevo.setRef(anterior.getRef());
            anterior.setRef(nuevo);
        }

        return null;
    }
}

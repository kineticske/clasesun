public class producto {
    //atributos
    int codigo, precioCompra, CantidadBodega, CantidadMinima; 

    public producto(int codigo, int precioCompra, int CantidadBodega, int CantidadMinima){
        this.codigo=codigo;
        this.precioCompra=precioCompra;
        this.CantidadBodega=CantidadBodega;
        this.CantidadMinima=CantidadMinima;

    }

    public boolean SolicitarPedido(){
        if (CantidadBodega<CantidadMinima){
            return true;
        } else{
            return false;
        }
        
    }

    
}

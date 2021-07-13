public class CuentaCorriente {
    //Atributos
    int numero, saldo;
    String nombre; 

    // constructor (siempre mismo nombre de la clase)

    public CuentaCorriente(String nombreC){
        this.nombre=nombreC;
        
    }
    //metodos
    public void depositar(){
        System.out.println("Depositar");
    }

    public void girar(){
        System.out.println("Girar");
    }
    public void consultar(){
        System.out.println("Consultar");
    }
}

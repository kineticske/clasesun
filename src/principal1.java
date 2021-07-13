import java.util.Scanner;
public class principal1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int codigo=sc.nextInt();
        int precioCompra=sc.nextInt();
        int CantidadBodega=sc.nextInt();
        int CantidadMinima=sc.nextInt();
        sc.close();

        producto pv1 = new producto(codigo, precioCompra, CantidadBodega, CantidadMinima);

        if (pv1.SolicitarPedido()){
            System.out.println("ALERTA! SOLICITA PEDIDO PRONTO");
        }else{
            System.out.println("¡Tu tranquilo!");
        }

        



    }
}

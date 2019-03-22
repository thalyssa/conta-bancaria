public class AplicacaoConsole {
    
    public static void main(String args[]){
        ContaProxy proxy = new ContaProxy(new ContaBancaria("admin", 001, 3), "admin", "1234");

        proxy.deposito(400);

        System.out.println(proxy.getReferencia().getSaldo());

    }
    
}

import java.util.Scanner;
public class ContaBancaria {
  
   private String cliente;
   private int num_conta;
   private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public ContaBancaria(String cliente, int num_conta, float saldo){
        cliente = this.cliente;
        num_conta = this.num_conta;
        saldo = this.saldo;
    }
    
    public void saque (float sacado){
       if(this.saldo-sacado<0){
           System.out.println("Valor invalido");
       }else{
           this.saldo = saldo - sacado;
       }
    }
       
    public void deposito (float depositado){
        this.saldo = saldo + depositado;
    }
        

}    
    
  
  
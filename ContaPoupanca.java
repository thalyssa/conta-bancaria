public class ContaPoupanca extends ContaBancaria{

    private int DiaRendimento;
    
    public int getDiaRendimento(){
        return this.DiaRendimento;
    }
    
    public int setDiaRendimento(){
        return this.DiaRendimento = DiaRendimento;
    }
    
    public ContaPoupanca(String cliente, int num_conta, float saldo) {
        super(cliente, num_conta, saldo);
    }
    
    
    
}

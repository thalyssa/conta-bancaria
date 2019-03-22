public interface Conta{

    public String getCliente();
    public void setCliente(String cliente);
    public int getNum_conta();
    public void setNum_conta(int num_conta);
    public float getSaldo();
    public void setSaldo(float saldo);
    void deposito(float depositado);
    void saque(float sacado);

}

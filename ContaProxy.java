public class ContaProxy implements Conta {

    private ContaBancaria referencia;
    private String cliente;
    private String senha;

    public boolean autenticar(){
        return this.cliente.equals("admin") && this.senha.equals("1234");
    }

    public ContaBancaria getReferencia() {
        return referencia;
    }

    public int getNum_conta(){
        if(autenticar()){
            this.referencia.getNum_conta();
        }

        System.out.println("Erro de autenticação");
        return 0;
    }
    public void setNum_conta(int num_conta){
        if(autenticar()){
            this.referencia.setNum_conta(num_conta);
        }

        System.out.println("Erro de autenticação");
        return;
    }

    public void setReferencia(ContaBancaria referencia) {
        if(autenticar()){
            this.referencia = referencia;
        }
            System.out.println("Erro de autenticação");
            return;
    }

    public float getSaldo(){
        if(autenticar()){
            this.referencia.getSaldo();
        }

        System.out.println("Erro de autenticação");
        return 0;
    }

    public void setSaldo(float saldo){
        if(autenticar()){
            this.referencia.setSaldo(saldo);
        }

        System.out.println("Erro de autenticação");
        return;
    }

    public String getCliente() {
        if(autenticar()){
            return this.cliente;
        }
            return "Erro de autenticação";
    }

    public void setCliente(String cliente) {
        if(autenticar()){
            this.cliente = cliente;
        }
            System.out.println("Erro de autenticação");
            return;
    }

    public String getSenha() {
        if(autenticar()){
            return senha;
        }
        return "Erro de autenticação";
    }

    public void setSenha(String senha){
        if(autenticar()){
            this.senha = senha;
        }
            System.out.println("Erro de autenticação");
            return;
    }

    @Override
    public void deposito(float depositado){
        if(autenticar()){
            referencia.deposito(depositado);
        }else{
            System.out.println("Erro de autenticação");
            return;
        }
    }

    @Override
    public void saque(float sacado){
        if(autenticar()){
            referencia.saque(sacado);
        }else{
            System.out.println("Erro de autenticação");
            return;
        }
    }

    public ContaProxy(ContaBancaria referencia, String cliente, String senha){
        this.referencia = referencia;
        this.cliente = cliente;
        this.senha = senha;
    }

}

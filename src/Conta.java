public class Conta {
    protected Pessoa correntista;
    protected int numero;
    protected int digito;
    protected float saldo;

    public Conta() {}

    public Conta(int numero, Pessoa correntista) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = 0.00f;
    }

    public void setCorrentista (Pessoa correntista){
        this.correntista = correntista;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setDigito(int digito){
        this.digito = digito;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getDigito(){
        return this.digito;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public Pessoa getCorrentista() {
        return this.correntista;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public boolean sacar(float valor){
        if(this.saldo - valor >= 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}

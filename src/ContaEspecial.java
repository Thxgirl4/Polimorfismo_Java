public class ContaEspecial extends Conta{
    private float limite;

    public ContaEspecial(){
        super();
    }

    public ContaEspecial(int numero, Pessoa correntista, float limite){
       this.numero = numero;
       this.correntista = correntista;
        this.limite = limite;
    }
    public void setLimite(float limite)
    {
        this.limite = limite;
    }
    public float getLimite()
    {
        return this.limite;
    }

    public boolean sacar(float valor)
    {
     if(this.saldo - valor >= this.limite)
     {
         this.saldo -= valor;
         return true;
     }
     return false;
    }
}

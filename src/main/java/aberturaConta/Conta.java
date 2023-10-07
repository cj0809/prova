package aberturaConta;
import java.util.Objects;

public class Conta {
    private  int id;
    private String dataAbertura;
    private String senha;
    private Double saldo;

    public Conta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return id == conta.id && Objects.equals(dataAbertura, conta.dataAbertura) && Objects.equals(senha, conta.senha) && Objects.equals(saldo, conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataAbertura, senha, saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", dataAbertura='" + dataAbertura + '\'' +
                ", senha='" + senha + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

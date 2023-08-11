package med.voll.api.endereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public Endereco(DadosEndereco dados) {
        this.bairro = dados.bairro();
        this.logradouro = dados.logradouro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }


    public void atualizarDadosEndereco(DadosEndereco dados) {
        if(dados.uf() != null){
            this.uf = dados.uf();
        }
        if(dados.numero() != null){
            this.numero = dados.numero();
        }
        if(dados.cep() != null){
            this.cep = dados.cep();
        }
        if(dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if(dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if(dados.bairro() != null){
            this.bairro = dados.bairro();
        }
    }
}

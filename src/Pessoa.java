public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException{
        setNome(nome);
        setIdade(idade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        
        this.idade = idade;
        if(idade<=0){
            throw new IdadeInvalidaException("Idade Invalida");
        }
    }  
}

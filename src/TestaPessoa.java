public class TestaPessoa {
    public static void main(String [] args){
        try {
            Pessoa p = new Pessoa("theo",-21);
        }
        catch(IdadeInvalidaException x){
            System.out.println(x.getMessage());
        }
    }
    
}

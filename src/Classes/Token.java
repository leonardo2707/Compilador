package Classes;

public class Token {

    
    private int codToken;
    private String token;
    private String nome;

    public Token(int codigo, String tipo)
    {
        this.codToken = codigo;
        this.token = tipo;
    }
    
    public Token(int codigo, String tipo, String sentenca)
    {
        this.codToken = codigo;
        this.token = tipo;
        this.nome = sentenca;
    }
    
    public int getCodToken() {
        return codToken;
    }

    public void setCodToken(int codToken) {
        this.codToken = codToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
        /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}

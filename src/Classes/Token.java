package Classes;

public class Token {
    
    private int codToken;
    private String token;

    public Token(int codigo, String conteudo)
    {
        this.codToken = codigo;
        this.token = conteudo;
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
    
    
    
}

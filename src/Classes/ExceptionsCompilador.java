
package Classes;


public class ExceptionsCompilador extends Exception{

    public ExceptionsCompilador() {
        super("Ocorreu um erro inesperado");
    }
    
    public ExceptionsCompilador(String mensagem) {
        super(mensagem);
    }
    
    
    
}

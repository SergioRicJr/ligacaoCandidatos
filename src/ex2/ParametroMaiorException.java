package ex2;

public class ParametroMaiorException extends Exception{
    
    public ParametroMaiorException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

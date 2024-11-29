class FondosInsuficientesException extends Exception{
    FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
class CuentaBancaria {
    public int fondos;
    CuentaBancaria(int fondos){
        this.fondos = fondos;
    }
    public void retirar(int retiro) throws FondosInsuficientesException {
        if(retiro > this.fondos){
            throw new FondosInsuficientesException("Fondos insuficientes");
        }else{
            System.out.println("Se ha retirado " + retiro);
            this.fondos -= retiro;
            System.out.println("fondos actuales: " + this.fondos);
        }
    
    }
}
public class Banco {

    public static void main(String[] args) {
        CuentaBancaria cuentaA = new CuentaBancaria(2000);
        try {
            cuentaA.retirar(2002);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error / " + e.getMessage());
        }

    }
}
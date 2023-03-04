package encapsulamiento;

public class Main {

    public static void main(String[] args) {
        //Instancia de cuenta de banco
        CuentaBanco cuentaBanco = new CuentaBanco("Luis Lopez", 1000);
        System.out.println("Propietario:  "+ cuentaBanco.getPropietario() +","+ " Saldo:  " + cuentaBanco.getSaldo());


                                            //ACTIVIDAD:
        //Retirar 500

        System.out.println("Retiro: "+ cuentaBanco.retiro(500));
        System.out.println("Propietario:  "+ cuentaBanco.getPropietario() +","+ " Saldo:  " + cuentaBanco.getSaldo());

        //Depositar 5,000
        System.out.println("Deposito: " + cuentaBanco.deposito(5000));
        System.out.println("Propietario:  "+ cuentaBanco.getPropietario() +"," + " Saldo:  " + cuentaBanco.getSaldo());


        //Retirar  2,000
        System.out.println("Retiro: " + cuentaBanco.retiro(2000));
        System.out.println("Propietario:  "+ cuentaBanco.getPropietario() +"," + " Saldo:  " + cuentaBanco.getSaldo());


        //Imprime el nombre del propietario de la cuenta
        System.out.println("Propietario: "+ cuentaBanco.getPropietario());

        //Imprime el saldo actual del propietario
        System.out.println("Saldo:  " + cuentaBanco.getSaldo());

        }

    }


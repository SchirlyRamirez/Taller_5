import javax.swing.JOptionPane;
public class Ejer_1 {

    // Función para verificar si un número es múltiplo de otro
    
public static boolean esMultiplo(int num1, int num2) {
        
        return num1 % num2 == 0;
    }

    public static void main(String[] args) {
        
      
        String Mensaje= "";
        int num1 = 0;
        int num2 = 0;

        Mensaje= "Ingrese el primer numero";
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,Mensaje));

        Mensaje= "Ingrese el segundo numero";
        num2= Integer.parseInt(JOptionPane.showInputDialog(null,Mensaje));

            if (Funciones.esDivisible(num1, num2)){
                Mensaje= num1 + "es divisible exactamente por" + num2;

            }

            else{
                Mensaje=num1 + "es divisible exactamente por " + num2;

            }
            
            JOptionPane.showMessageDialog(null,Mensaje);

        

}

}
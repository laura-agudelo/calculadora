import com.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testcalculadora {
    @org.junit.Test
    public void testSumar() {
        System.out.println("Prueba del método suma");
        int a = 2;
        int b = 4;
        Calculadora calc = new Calculadora(a,b);
        double esperado = 6;
        double resultado = calc.sumar();
        assertEquals(esperado,resultado,0.0);
        System.out.println(resultado);
    }
    @Test
    public void testRestar() {
        System.out.println("Prueba del método resta");
        int a = 4;
        int b = 2;
        Calculadora calc = new Calculadora(a,b);
        double esperado = 2;
        double resultado = calc.restar();
        assertEquals(esperado,resultado,0.0);
        System.out.println(resultado);
    }
}
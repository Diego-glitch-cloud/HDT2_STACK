import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    // Read the file 
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString(); 
    }

    public static void main(String[] args) {
        

        // Making the file a string and usable 
        String filePath = "datos.txt"; 
        String operacion = readFile(filePath);
        
        // Creating the Calculator instance and passing the string through
        Calculator calculator = new Calculator();
        calculator.evaluate(operacion);
    }
}
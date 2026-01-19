import java.io.FileInputStream;
import java.util.Properties;

// Klasa od configa z loaderem z pliku konfiguracyjnego
// Elegancko działa (zapamiętać że relative path działa)
// W skrócie mniej więcej wiem jak to działa ale ogólnie to buja

public class Config {
    private static Properties props = new Properties();

    static {
        try {
            props.load(new FileInputStream("resources/config.properties"));
        } catch (Exception e) {
            System.out.println("Nie można odnaleźć pliku");
        }
    }

    public static int getInt(String key) {
        return Integer.parseInt(props.getProperty(key));
    }
}


import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {
    public static void main(String arg[]) {
        JFrame frame = new JFrame("2D Game"); // Tytuł okna
        JLabel label = new JLabel("Skibidi"); // Napis chwilowy

        frame.add(label); // Dodanie klatki do gry
        frame.setSize(Config.getInt("width"), Config.getInt("height")); // Loader + dane z kluczy config
        frame.setResizable(false); // Resizable okno (nuh uh)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Okno wylacza sie fajnie

        frame.setVisible(true); // Tak.

    }
}

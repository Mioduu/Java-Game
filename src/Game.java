
import javax.swing.JFrame;

public class Game extends JFrame {
    public static void main(String arg[]) {
        // Inicjacja
        JFrame window = new JFrame("2D Game"); // Tytuł okna

        // Panel
        ScreenPanel screenPanel = new ScreenPanel(); // Utworzenie panelu

        window.add(screenPanel); // Dodanie panelu do okna
        window.pack(); // Dopasowanie okna do rozmiarów w panelu

        // Operacje na oknie
        window.setLocationRelativeTo(null); // Wysrodkowanie okna
        window.setResizable(false); // Resizable okno (nuh uh)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Okno wylacza sie fajnie
        window.setVisible(true); // Tak.

        // Odpalenie gry
        screenPanel.startGame();
    }
}

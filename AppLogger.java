
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {

    private static final Logger logger =
            Logger.getLogger(AppLogger.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler =
                    new FileHandler("app.log", true);

            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);

            logger.info("Library application started.");
            logger.warning("Book availability is low.");
            logger.severe("Unable to issue the requested book.");

            fileHandler.close();

            System.out.println("Log messages saved to app.log");

        } catch (IOException e) {
            System.out.println("Unable to create log file: "
                    + e.getMessage());
        }
    }
}

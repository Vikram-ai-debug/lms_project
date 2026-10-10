
public class LibraryService {

    public static void issueBook(boolean available)
            throws BookUnavailableException {

        if (!available) {
            throw new BookUnavailableException(
                "Book is not available!"
            );
        }

        System.out.println("Book issued successfully.");
    }

    public static void main(String[] args) {
        try {
            issueBook(true);
            issueBook(false);
        } catch (BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

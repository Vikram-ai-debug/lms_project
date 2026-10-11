
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
    /**
     * Finds member by ID - PR test
     */
    // Added for Lab 5 - Task 2: Member lookup feature
    public String findMemberById(String memberId) {
        if (memberId == null || memberId.isEmpty()) {
            return "Invalid Member ID";
        }
        // Dummy implementation for Git branching practice
        return "Member found: " + memberId;
    }
}

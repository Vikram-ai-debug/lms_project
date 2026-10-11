
public class LibraryService {
    // Issues one copy of the given title from the catalogue
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
     * Finds a member by their unique ID.
     * @param memberId The ID of the member to find
     * @return A message indicating if member was found or ID is invalid
     */
    
    // Added for Lab 5 - Task 2: Member lookup feature
    public String findMemberById(String memberId) {
        if (memberId == null || memberId.isEmpty()) {
            return "Invalid Member ID";
        }
        // Dummy implementation for Git branching practice
        return "Member found: " + memberId;
    }

        /**
     * Validates book ID for Task 4
     */
    public boolean isValidBookId(String bookId) {
        return bookId != null && !bookId.trim().isEmpty();
    }
}

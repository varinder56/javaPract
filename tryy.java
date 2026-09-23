public class tryy {
    public static void main(String[] args) {

        try {
            System.out.println("sending network request");

            boolean success = false;

            if (!success) {
                throw new Exception("Network error");
            }

            System.out.println("Data received successfully.");
        }
        catch (Exception e) {
            System.out.println("Request failed: " + e.getMessage());
        }
        finally {
            System.out.println("Refreshing UI");
        }
    }
}
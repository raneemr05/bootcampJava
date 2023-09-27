public class ProductFormatter {
        private static String productFormatter(String productName, String date) {
            return productName.concat(date).toUpperCase().trim().replace(" ", "_");
        }

    public static void main(String[] args) {
            String product = productFormatter("my laptop", "25/09/2023");
        System.out.println(product);

    }
}

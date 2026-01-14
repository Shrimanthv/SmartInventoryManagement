import java.sql.*;

public class SmartInventoryManagement {

    public static void main(String[] args) {

        // SQLite database URL (database file will be created automatically)
        String url = "jdbc:sqlite:inventory.db";

        try {
            // STEP 1: Load SQLite JDBC Driver
            Class.forName("org.sqlite.JDBC");

            // STEP 2: Create Connection
            Connection con = DriverManager.getConnection(url);

            // STEP 3: Create products table
            String createTableSQL =
                    "CREATE TABLE IF NOT EXISTS products (" +
                    "product_id INTEGER PRIMARY KEY, " +
                    "product_name TEXT, " +
                    "quantity INTEGER, " +
                    "price REAL)";

            Statement stmt = con.createStatement();
            stmt.execute(createTableSQL);

            // STEP 4: Insert product data using PreparedStatement
            String insertSQL =
                    "INSERT OR IGNORE INTO products (product_id, product_name, quantity, price) " +
                    "VALUES (?, ?, ?, ?)";

            PreparedStatement psInsert = con.prepareStatement(insertSQL);
            psInsert.setInt(1, 101);
            psInsert.setString(2, "Keyboard");
            psInsert.setInt(3, 15);
            psInsert.setDouble(4, 500);
            psInsert.executeUpdate();

            // STEP 5: Update product quantity
            String updateSQL =
                    "UPDATE products SET quantity = ? WHERE product_id = ?";

            PreparedStatement psUpdate = con.prepareStatement(updateSQL);
            psUpdate.setInt(1, 20);
            psUpdate.setInt(2, 101);
            psUpdate.executeUpdate();

            // STEP 6: Fetch all inventory data
            String selectSQL = "SELECT * FROM products";
            PreparedStatement psSelect = con.prepareStatement(selectSQL);
            ResultSet rs = psSelect.executeQuery();

            System.out.println("Inventory Details:");
            System.out.println("ID | Name | Quantity | Price");

            while (rs.next()) {
                int id = rs.getInt("product_id");
                String name = rs.getString("product_name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");

                System.out.println(id + " | " + name + " | " + quantity + " | " + price);
            }

            // STEP 7: Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
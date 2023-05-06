public class BasicConnectionSingleton {
    private static String url =
            "http://localhost/phpmyadmin/index.php?route=/table/create&server=1&db=formulario";
    private static String user = "Neithan_@";
    private static String pass =
            "Neithan-1031540860";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn =
                    DriverManager.getConnection(url, user,
                            pass);
        }
        return conn;
    }
} // BasicConnectionSingleton
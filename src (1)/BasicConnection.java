public class BasicConnection {

    public static void main(String[] args)
    {
        String url =
                "http://localhost/phpmyadmin/index.php?route=/table/create&server=1&db=formulario";
        String username = "Neithan Salazar";
        String password = "Neithan-1031540860";

        String sql = null;
        Connection conn = null;
        Statement stm = null;     R
        esultSet rs = null;
        try {
            sql = "	SELECT * FROM

            formulario.users_tbl
                    conn =
                    DriverManager.getConnection(urlusername, password)
                           stm=conn.createSatement();
            rs=stm.executeQuery(sql);

            while (rs.next()){

                System.out.print(rs.getString("user_first name"));
                System.out.print(" |");
                System.out.println(rs.getString("user_las
                        tname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }// end try-catch
    } // main
} // BasicConnection




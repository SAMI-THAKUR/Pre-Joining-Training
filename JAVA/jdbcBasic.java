/*
 * JDBC stands for Java Database Connectivity, which is a standard Java API
 * for database-independent connectivity between the Java programming
 * language and a wide range of databases.
*/

import java.sql.*;

public class jdbcBasic {
    public static void main(String[] args) {
        /* Load Driver Old Approach
        Class.forName(
            "com.mysql.cj.jdbc.Driver"
        );
        Modern JDBC loads automatically.
        */

        String url = "jdbc:mysql://127.0.0.1:3306/college";
        String userName = "root";
        String password = "#####";
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("DB is connected");

            // Statement (Compiled every time it is executed) (Vulnerable to SQL Injection)

            Statement stmt = con.createStatement();
            String query1 = "SELECT * FROM student";

            // PreparedStatement (Precompiled once and reused) (prevents SQL Injection)
            // Because we dont enter values directly we just provide values JDBC enter it into query

            String query2 = "INSERT INTO student VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query2);
            ps.setInt(1, 102);
            ps.setString(2, "SAMI");
            ps.setInt(3, 22);
            ps.setString(4, "male");
            
            /*
                Statement	        Executes normal SQL queries directly
                PreparedStatement	Executes parameterized SQL queries
                CallableStatement	Executes stored procedures/functions
            */
           
            /* types of execution methods
            * # executeQuery() -> Use this method when you expect to get a result set, as you would with a SELECT statement
            * # executeUpdate() -> Returns the number of rows affected by the execution of the SQL statement
            * Used for INSERT, UPDATE, DELETE statements.
            * # execute() ->  Returns a boolean value of true if a ResultSet object can be retrieved
            * Any SQL statement
            * */

             int rs2 = ps.executeUpdate();
             System.out.println(rs2 + " row inserted");

            ResultSet rs1 = stmt.executeQuery(query1);
            while(rs1.next()){
                System.out.println(rs1.getInt("STUDENT_ID")+ " " +  rs1.getString("NAME"));
            }

            // ResultSetMetaData
            ResultSetMetaData rsMeta = rs1.getMetaData();
            System.out.println(rsMeta.getColumnCount());

            // Batch Processing //
            PreparedStatement batchPS = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
            batchPS.setInt(1, 103);
            batchPS.setString(2, "Rahul");
            batchPS.setInt(3, 21);
            batchPS.setString(4, "male");
            batchPS.addBatch(); // imp to call

            batchPS.setInt(1, 101);
            batchPS.setString(2, "Amit");
            batchPS.setInt(3, 21);
            batchPS.setString(4, "male");
            batchPS.addBatch();

            batchPS.executeBatch();
            ResultSet rs3 = stmt.executeQuery(query1);
            while(rs3.next()){
                System.out.println(rs3.getInt("STUDENT_ID")+ " " +  rs3.getString("NAME"));
            }

            con.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        /* TRANSACTION COMMANDS
                con.commit(); Save changes
                con.rollback();Undo changes
                con.setAutoCommit(false); Manual transaction control
                setSavepoint(String savepointName); Defines a new savepoint. It also returns a Savepoint object
                releaseSavepoint(Savepoint savepointName); Deletes a savepoint
                rollback (String savepointName); rolls back work to the specified savepoint.
        * */

    }
}

package OrangeHrm.DataBase;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDataBase {

    private ConectionDataBase conectionDataBase;

    private InsertDataBase() {
        this.conectionDataBase = new ConectionDataBase();

    }

    public static void insertEmployee(String name, String lastName, String middle) {
        Connection testCon = ConectionDataBase.getConnection();
        String insertSql = "INSERT INTO newEmployee(firtsName, lastName, middleName) VALUES" +
                "('" + name + "','" + lastName + "','" + middle + "')";

        ResultSet resultSet = null;

        try (Connection connection = ConectionDataBase.getConnection();
             PreparedStatement prepsInsert = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsert.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

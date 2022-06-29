package stepdefinitions.database_step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.SQLException;

public class Read_Step_Definitions {
    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.createConnection();

    }

    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
//        Writing the query
        String myDynamicQuery = "Select "+column+" from "+table;
//        Executing the query. This takes us to the column from the table
        DBUtils.executeQuery(myDynamicQuery);
//      I am at Price column on the Hotel Room(column = Price, table = tHOTELROOM)
    }

    @Given("user reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String column) throws SQLException {

        DBUtils.getResultset().next();//I was on row 6 now I am on row 7
        Object columnData7 = DBUtils.getResultset().getObject(column);
        System.out.println(columnData7);//620.0000

        //        resultset.next(); takes to the next row
        DBUtils.getResultset().next();//I was on row 6 now I am on row 7
        Object columnData8 = DBUtils.getResultset().getObject(column);
        System.out.println(columnData8);//525.00

//        We can get teh data as String as well
        String columnDataAsString = DBUtils.getResultset().getString(column);
//        Assert.assertTrue(columnDataAsString.contains("00"));
        System.out.println(columnDataAsString);

//        How to get all of the price column data
        while (DBUtils.getResultset().next()){
            Object eachColumnData=DBUtils.getResultset().getObject(column);
            System.out.println(eachColumnData);
        }
    }

    @Then("close the connection")
    public void close_the_connection() {
        DBUtils.closeConnection();
    }
}

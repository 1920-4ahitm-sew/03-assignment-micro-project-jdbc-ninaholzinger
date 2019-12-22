package at.htl.mock;

import org.assertj.db.type.Source;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import java.sql.SQLSyntaxErrorException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.db.output.Outputs.output;

public class DatabaseTest {

    public String url = "jdbc:derby://localhost:1527/db";
    public String username = "app";
    public String password = "app";

    @Test
    public void test_databaseTest(){
       Source source = new Source(url,
               username,
               password);
       Table table = new Table(source,"VEHICLE");
        assertThatThrownBy(() -> {
            output(table).toConsole();
        });


    }
}

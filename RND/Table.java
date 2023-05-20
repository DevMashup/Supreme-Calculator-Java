package RND;

import java.util.ArrayList;
import java.util.List;

public class Table {

    public void Calculations() {
        List<String> rows = new ArrayList<>();
        List<String> cols = new ArrayList<>();

        AddRowItems(rows);
        AddColumnItems(cols);

        for(int x = 0; x < rows.size(); x++) {
            System.out.print(rows.get(x) + "     ");
            System.out.println("");
            for(int y = 0; y < cols.size(); y++) {
                System.out.println(cols.get(y));
            }
        }
    }
    public void AddRowItems(List<String> rows) {
        rows.add("Weather");
    }

    public void AddColumnItems(List<String> cols) {
        cols.add("----------");
        cols.add("Add");
        cols.add("Subtract(Sub)");
        cols.add("Multiply(Mul)"); //<--Needs Implementing
        cols.add("Divide"); //<--Needs Implementing
        cols.add("Square Root(Sqrt)"); //<--Needs Implementing
        cols.add("D.B.O"); //<--Needs Implementing
    }
}

package Prcactical;

import javax.swing.*;
import java.awt.*;

public class JTableDemo3 {
    JTableDemo3() {
        JFrame F = new JFrame();
        F.setLayout(new BorderLayout());

        String[] ColumnHeads ={"ID","NAME","SALARY"};

        String[][] Data = {
                {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"103","Sachin","700000"},
        };
        JTable T = new JTable(Data, ColumnHeads);
        T.setCellSelectionEnabled(false);
        F.add(new JScrollPane(T));
        F.setLocationRelativeTo(null);
        F.add(T);
        F.setSize(350, 250);
        F.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo3();
    }

}

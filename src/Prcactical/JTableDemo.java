package Prcactical;

import javax.swing.*;
import java.awt.*;

public class JTableDemo {
    JTableDemo() {
        JFrame F = new JFrame();
        F.setLayout(new BorderLayout());

        String[] ColumnHeads ={"Id","Student Name", "Grade ", "Percentage"};

        String[][] Data = {
                {"1","Ranjit","A","100%"},
                {"2","Rohan","A","100%"},
                {"3","Bhaskar","A","100%"},
                {"4","Shubham","A","100%"},
                {"5","Sanika","A","100%"},
                {"6","Tanisha","A","100%"},
                {"7","Harshad","A","100%"},
                {"8","Sapna","A","100%"},
                {"9","Vivek","A","100%"},
                {"10","Snehal","A","100%"}
        };
        JTable T = new JTable(Data, ColumnHeads);
        T.setCellSelectionEnabled(false);
        F.add(new JScrollPane(T));
        F.setLocationRelativeTo(null);
        F.add(T);
        F.setSize(400, 200);
        F.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }

}

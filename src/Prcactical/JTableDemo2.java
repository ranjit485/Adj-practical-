    package Prcactical;

    import javax.swing.*;
    import java.awt.*;

    public class JTableDemo2 {
        JTableDemo2() {
            JFrame F = new JFrame();
            F.setTitle("INFO");
            F.setLayout(new BorderLayout());

            String[] ColumnHeads ={"Names","Age","City"};

            String[][] Data = {
                    {"Ranjit","20","Bhivghat"},
                    {"Rohan","19","vita"},
                    {"Bhaskar","20","sangli"},
                    {"Shreedhar","20","Vita"}
            };
            JTable T = new JTable(Data, ColumnHeads);
            T.setCellSelectionEnabled(false);
            F.add(new JScrollPane(T));
            F.setLocationRelativeTo(null);
            F.add(T);
            F.setSize(300, 150);
            F.setVisible(true);
        }

        public static void main(String[] args) {
            new JTableDemo2();
        }

    }

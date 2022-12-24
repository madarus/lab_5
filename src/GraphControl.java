import Models.Graph;

import javax.swing.*;
import java.io.IOException;

public class GraphControl extends Main{
    public static void DrawArrayAddGraph(){
        long[] time =new long[4];
        AddDataToArray data1 = new AddDataToArray();
        AddDataToArray data2 = new AddDataToArray();
        AddDataToArray data3 = new AddDataToArray();
        AddDataToArray data4 = new AddDataToArray();
        time[0] = data1.coctailDataTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        time[1] = data2.coctailDataTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        time[2] = data3.coctailDataTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        time[3] = data4.coctailDataTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc1(time);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowGui(scores);
            }
        });
    }

    public static void DrawArrayRemoveGraph() throws IOException {
        long[] deltime = new long[4];
        AddDataToArray data1 = new AddDataToArray();
        AddDataToArray data2 = new AddDataToArray();
        AddDataToArray data3 = new AddDataToArray();
        AddDataToArray data4 = new AddDataToArray();
        data1.coctailsData(10,Boolean.parseBoolean(prop.getProperty("logging")));
        data2.coctailsData(100,Boolean.parseBoolean(prop.getProperty("logging")));
        data3.coctailsData(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        data4.coctailsData(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[0] = data1.removeTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[1] = data2.removeTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[2] = data3.removeTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[3] = data4.removeTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc2(deltime);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowRemoveGui(scores2);
            }
        });
    }

    public static void DrawArrayMedianGraph(){
        long[] time =new long[4];
        AddDataToArray data1 = new AddDataToArray();
        AddDataToArray data2 = new AddDataToArray();
        AddDataToArray data3 = new AddDataToArray();
        AddDataToArray data4 = new AddDataToArray();
        time[0] = data1.coctailDataMedianTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        time[1] = data2.coctailDataMedianTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        time[2] = data3.coctailDataMedianTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        time[3] = data4.coctailDataMedianTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc1(time);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowGuiMedian(scores);
            }
        });
    }

    public static void DrawArrayRemoveMedianGraph() throws IOException {
        long[] deltime = new long[4];
        AddDataToArray data1 = new AddDataToArray();
        AddDataToArray data2 = new AddDataToArray();
        AddDataToArray data3 = new AddDataToArray();
        AddDataToArray data4 = new AddDataToArray();
        data1.coctailsData(10,Boolean.parseBoolean(prop.getProperty("logging")));
        data2.coctailsData(100,Boolean.parseBoolean(prop.getProperty("logging")));
        data3.coctailsData(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        data4.coctailsData(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[0] = data1.removeMedianTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[1] = data2.removeMedianTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[2] = data3.removeMedianTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[3] = data4.removeMedianTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc2(deltime);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowRemoveGuiMedian(scores2);
            }
        });
    }


    public static void DrawArrayAddGraphLinked(){
        long[] time =new long[4];
        AddDataToLinked data1 = new AddDataToLinked();
        AddDataToLinked data2 = new AddDataToLinked();
        AddDataToLinked data3 = new AddDataToLinked();
        AddDataToLinked data4 = new AddDataToLinked();
        time[0] = data1.coctailDataTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        time[1] = data2.coctailDataTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        time[2] = data3.coctailDataTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        time[3] = data4.coctailDataTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc1(time);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowGuiLinked(scores);
            }
        });
    }

    public static void DrawArrayRemoveGraphLinked() throws IOException {
        long[] deltime = new long[4];
        AddDataToLinked data1 = new AddDataToLinked();
        AddDataToLinked data2 = new AddDataToLinked();
        AddDataToLinked data3 = new AddDataToLinked();
        AddDataToLinked data4 = new AddDataToLinked();
        data1.coctailsData(10,Boolean.parseBoolean(prop.getProperty("logging")));
        data2.coctailsData(100,Boolean.parseBoolean(prop.getProperty("logging")));
        data3.coctailsData(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        data4.coctailsData(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[0] = data1.removeTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[1] = data2.removeTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[2] = data3.removeTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[3] = data4.removeTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc2(deltime);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowRemoveGuiLinked(scores2);
            }
        });
    }

    public static void DrawArrayMedianGraphLinked(){
        long[] time =new long[4];
        AddDataToLinked data1 = new AddDataToLinked();
        AddDataToLinked data2 = new AddDataToLinked();
        AddDataToLinked data3 = new AddDataToLinked();
        AddDataToLinked data4 = new AddDataToLinked();
        time[0] = data1.coctailDataMedianTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        time[1] = data2.coctailDataMedianTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        time[2] = data3.coctailDataMedianTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        time[3] = data4.coctailDataMedianTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc1(time);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowGuiMedianLinked(scores);
            }
        });
    }

    public static void DrawArrayRemoveMedianGraphLinked() throws IOException {
        long[] deltime = new long[4];
        AddDataToLinked data1 = new AddDataToLinked();
        AddDataToLinked data2 = new AddDataToLinked();
        AddDataToLinked data3 = new AddDataToLinked();
        AddDataToLinked data4 = new AddDataToLinked();
        data1.coctailsData(10,Boolean.parseBoolean(prop.getProperty("logging")));
        data2.coctailsData(100,Boolean.parseBoolean(prop.getProperty("logging")));
        data3.coctailsData(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        data4.coctailsData(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[0] = data1.removeMedianTime(10,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[1] = data2.removeMedianTime(100,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[2] = data3.removeMedianTime(1000,Boolean.parseBoolean(prop.getProperty("logging")));
        deltime[3] = data4.removeMedianTime(10000,Boolean.parseBoolean(prop.getProperty("logging")));
        setFunc2(deltime);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Graph.createAndShowRemoveGuiMedianLinked(scores2);
            }
        });
    }
    public static void setFunc1(long[] time){
        int maxDataPoints = 4;
        for (int i = 0; i < maxDataPoints; i++) {
            scores.add((double) (time[i]));
        }
    }
    public static void setFunc2(long[] time){
        int maxDataPoints = 4;
        for (int i = 0; i < maxDataPoints; i++) {
            scores2.add((double) (time[i]));
        }
    }
}

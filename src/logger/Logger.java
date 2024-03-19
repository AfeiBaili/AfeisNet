package logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public static File log = new File("log");
    public static FileWriter fileWriterErr;
    public static FileWriter fileWriterLog;
    public static File logfile = new File("log\\log.txt");
    public static File errfile = new File("log\\err.txt");
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

    static {
        if (log.mkdirs()) {
            System.out.println("创建log成功");
        }
    }

    public static void out(String info) {
        try {
            fileWriterLog = new FileWriter(logfile, true);
            fileWriterLog.write("[" + dateTimeFormatter.format(LocalDateTime.now()) + "]:" + info + "\n");
        } catch (IOException e) {
            System.out.println("写入log失败");
        } finally {
            try {
                fileWriterLog.close();
            } catch (IOException e) {
                System.out.println("写入log失败");
            }
        }
    }

    public static void outErr(String info) {
        try {
            fileWriterErr = new FileWriter(errfile, true);
            fileWriterErr.write("[" + dateTimeFormatter.format(LocalDateTime.now()) + "]:" + info + "\n");
        } catch (IOException e) {
            System.out.println("写入err失败");
        } finally {
            try {
                fileWriterErr.close();
            } catch (IOException e) {
                System.out.println("关闭err流错误");
            }
        }
    }
}

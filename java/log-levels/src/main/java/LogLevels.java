public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.replaceAll("\\[.*?\\]:\\s*(.*)", "$1");
        return message.trim();  
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.replaceAll("\\[([^\\]]+)\\].*", "$1");
        return logLevel.trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);

        return message + " (" + logLevel + ")";
    }
}

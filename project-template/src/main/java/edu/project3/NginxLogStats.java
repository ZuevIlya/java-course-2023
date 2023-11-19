package edu.project3;

import org.apache.commons.cli.*;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.LogRecord;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NginxLogStats {

    public static void main(String[] args) {
        Options options = createOptions();
        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);

            String path = cmd.getOptionValue("path");
            String from = cmd.getOptionValue("from");
            String to = cmd.getOptionValue("to");
            String format = cmd.getOptionValue("format", "markdown");

            LocalDateTime fromDate = parseDate(from);
            LocalDateTime toDate = parseDate(to);

            List<Path> logFiles = getLogFiles(path);

            List<LogRecord> logRecords = logFiles.stream()
                .flatMap(NginxLogStats::parseLogRecords)
                .filter(record -> isWithinDateRange(record.getMillis(), fromDate, toDate))
                .collect(Collectors.toList());
            /*
            LogReport logReport = new LogReport(logFiles, fromDate, toDate, logRecords);

            String result = logReport.generateReport(format);
            System.out.println(result);

             */

        } catch (ParseException e) {
            System.err.println("Error parsing command line arguments: " + e.getMessage());
            printHelp(options);
        } catch (IOException e) {
            System.err.println("Error reading log files: " + e.getMessage());
        }
    }

    private static Options createOptions() {
        Options options = new Options();

        options.addOption("path", true, "Path to NGINX log files (local template or URL)");
        options.addOption("from", true, "Start date in ISO8601 format");
        options.addOption("to", true, "End date in ISO8601 format");
        options.addOption("format", true, "Output format (markdown or adoc)");

        return options;
    }

    private static void printHelp(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar nginx-log-stats.jar", options);
    }

    private static LocalDateTime parseDate(String date) {
        if (date == null) {
            return null;
        }
        return LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
    }

    private static List<Path> getLogFiles(String path) throws IOException {
        if (path.startsWith("http")) {
            // Handle URL case
            // Implement logic to download log files from URL
            // and return a list of Paths
            // ...
        } else {
            // Handle local path case
            return Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());
        }
        return null;
    }

    private static Stream<LogRecord> parseLogRecords(Path logFile) {
        // Implement logic to parse NGINX log records from the log file
        // and return a Stream of LogRecord objects
        // ...
        return null;
    }

    private static boolean isWithinDateRange(long timestamp, LocalDateTime fromDate, LocalDateTime toDate) {
        // Implement logic to check if the timestamp is within the specified date range
        // ...
        return false;
    }
}

package Regex;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> list = FileOption.readFile("timetable.txt");
        RegexTransformation.regexTransformTimetable(list);
        list = RegexTransformation.getList();
        FileOption.writeFile(list, "newTimetable.txt");
        RegexTransformation.regexTransformToMinute(list);
        FileOption.writeDetailFile(RegexTransformation.getHashMap(), "totalMinuteTimetable.txt");
    }
}

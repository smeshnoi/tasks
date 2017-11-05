package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTransformation {
    private static List<String> list = new ArrayList<>();
    private static HashMap<String, Integer> hashMap = new HashMap<>();

    public static HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public static List<String> getList() {
        return list;
    }

    public static void regexTransformTimetable(List<String> listTransform) {
        String text1 = "";
        String text2 = "";
        String text3 = "";
        for (String value: listTransform) {
            if (value.length() == 0) {
                text1 = "";
                text2 = "";
                text3 = "";
                list.add(value);
            }
            Pattern pattern = Pattern.compile("(\\d{2}:\\d{2})\\s(.+)");
            Matcher matcher = pattern.matcher(value);
            while (matcher.find()) {
                text1 = matcher.group(1);
                if (text2 != "" && matcher.matches()) {
                    list.add(text2 + " - " + text1 + " " + text3);
                }
                text2 = matcher.group(1);
                text3 = matcher.group(2);
            }
        }
    }

    public static void regexTransformToMinute(List<String> listTransform) {
        for (String value: listTransform) {
            Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})\\s-\\s(\\d{2}):(\\d{2})\\s?(.+)");
            Matcher matcher = pattern.matcher(value);
            while (matcher.find()) {
                int minute1 = 0;
                int minute2 = 0;
                minute1 = Integer.parseInt(matcher.group(1)) * 60 + Integer.parseInt(matcher.group(2));
                minute2 = Integer.parseInt(matcher.group(3)) * 60 + Integer.parseInt(matcher.group(4));
                if (hashMap.get(matcher.group(5)) != null) {
                    hashMap.put(matcher.group(5), hashMap.get(matcher.group(5)) + minute2 - minute1);
                } else {
                    hashMap.put(matcher.group(5), minute2 - minute1);
                }
            }
        }
    }
}

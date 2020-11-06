package nhbank.core.util;

import javafx.util.Pair;

import java.util.Arrays;

public class HandleParams {
    public static Pair<Integer, Integer> handleRange(String range){
        String rangeString = range.substring(range.indexOf("[") + 1, range.indexOf("]"));
        String[] rangeStringArray = rangeString.split(",");
        int[] rangeIntArray = Arrays.stream(rangeStringArray).mapToInt(Integer::parseInt).toArray();
        int startValue = rangeIntArray[0];
        int endValue = rangeIntArray[1];
        int size = (endValue - startValue) + 1;
        int page = Math.max((endValue / (size - 1)) - 1, 0);
        return new Pair<>(page, size);
    }
    public static Pair<String,String> handleSort(String sort){
        String sortString = sort.substring(sort.indexOf("\"") + 1, sort.lastIndexOf("\""));
        String[] sortStringArray = sortString.replace('\"', ',').split(",,,");
        String propertyName = sortStringArray[0];
        String sortMethod = sortStringArray[1];
        return new Pair<>(propertyName, sortMethod);
    }
    public static String handleFilter(String filter){
        String filterString = filter.substring(filter.indexOf("\"") + 1, filter.lastIndexOf("\""));
        String[] filterStringArray = filterString.split("\":\"");
        return filterStringArray[1];
    }
    public static long[] handleIdFilter(String filter){
        String idString = filter.substring(filter.indexOf("[") + 1, filter.indexOf("]"));
        String[] idStringArray = idString.split(",");
        return Arrays.stream(idStringArray).mapToLong(Long::parseLong).toArray();
    }
}

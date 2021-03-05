import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) throws IOException {

      Map<String, Integer> map = new HashMap<>();

                String filename = "/home/knoldus/Assignment3/src/main/java/file1.txt";
                List<String> stringList = Files.lines(Paths.get(filename))
                        .collect(Collectors.toList());
                //read from file
                String str = stringList.stream().collect(Collectors.joining("."));
                System.out.println(str);
                //count word frequency

                List <String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                        .collect(Collectors.toList());

                Map <String, Integer > wordCounter = list.stream()
                        .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

                System.out.println(wordCounter);
            }
        }




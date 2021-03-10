package sort;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStart {
    public static void main(String[] args) throws IOException {
        List<Model> models = new ArrayList<>();

        Stream<String> streamIn = Files.lines(Paths.get("src/main/resources/in.txt"));
        List<String> lines = streamIn.collect(Collectors.toList());

        String[] str = new String[4];
        for(String s : lines){
            str = s.split(" ");
            models.add(new Model(str));
        }

        models = models.stream()
                .sorted(Comparator.comparing(Model::getColumn1))
                .collect(Collectors.toList());

        str = new String[models.size()];
        for(int i = 0;i < models.size();i++){
            str[i] = models.get(i).toString();
            System.out.println(models.get(i));
        }
        Files.write(Paths.get("src/main/resources/out.txt"), Arrays.asList(str));
    }
}

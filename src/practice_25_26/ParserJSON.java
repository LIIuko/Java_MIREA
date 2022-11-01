package practice_25_26;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Station{
    private int number;
    private String name;

    public Station(int number, String name) {
        this.number = number;
        this.name = name;
    }
}

class Line{
    private int number;
    private String name;

    public Line(int number, String name) {
        this.number = number;
        this.name = name;
    }
}

public class ParserJSON {
    public static void main(String[] args){
        ArrayList<Station> stations = new ArrayList<>();
        ArrayList<Line> lines = new ArrayList<>();
        try {
            Document document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").maxBodySize(0).get();
            Elements stationsData = document.select("p");
            Elements linesData = document.select("span");
            for (Element el: stationsData){
                Pattern pattern = Pattern.compile("(\\d+[.]\\s\\w+)");
                Matcher matcher = pattern.matcher(el.text());
                if (matcher.matches()){
                    System.out.println(el.text());
                }
            }
            for (Element el: linesData) {
                if (!el.attr("data-line").isEmpty()) {
                    System.out.println(el);
                }
            }
        }catch (Exception e){

        }
    }
}

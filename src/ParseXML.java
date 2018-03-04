
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class ParseXML {

    public static void main(String[] args){
        try {
            File my_file = new File("music.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            //next 2 lines are for running Parsing all xml
            Handler my_Handler = new Handler();
            saxParser.parse(my_file,my_Handler);
            //next 2 lines are for query
            HandlerForQuery my_QueryHandler = new HandlerForQuery();
            saxParser.parse(my_file,my_QueryHandler);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

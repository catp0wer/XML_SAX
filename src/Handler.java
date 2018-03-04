import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

    boolean title = false;
    boolean artist = false;
    boolean country = false;
    boolean company = false;
    boolean price = false;
    boolean year = false;

    public void startElement(String uri, String localName,String tagName, Attributes att)throws SAXException{
        if(tagName.equalsIgnoreCase("cd")){
            String id = att.getValue("id");
            System.out.println("CD id : "+id);
        } else if(tagName.equalsIgnoreCase("title")){
            title= true;
        } else if(tagName.equalsIgnoreCase("artist")){
            artist = true;
        } else if(tagName.equalsIgnoreCase("country")){
            country = true;
        } else if(tagName.equalsIgnoreCase("company")){
            company = true;
        } else if(tagName.equalsIgnoreCase("price")){
            price = true;
        } else if(tagName.equalsIgnoreCase("year")){
            year = true;
        }
    }

    public void endElement(String uri, String localName,String tagName) throws SAXException{
        if(tagName.equalsIgnoreCase("cd")){
            System.out.println("End Element :" +tagName);
        }
    }


    public void characters(char ch[], int start, int lenght) throws SAXException{
        if(title){
            System.out.println("Title: " + new String(ch, start, lenght));
            title = false;
        }else if(artist){
            System.out.println("Artist: " + new String(ch, start, lenght));
            artist = false;
        } else if(country){
            System.out.println("Country: " + new String(ch, start, lenght));
            country = false;
        } else if(company){
            System.out.println("Company: "+ new String(ch,start,lenght));
            company = false;
        } else if(price){
            System.out.println("Price: "+new String(ch, start, lenght));
            price = false;
        }else if(year){
            System.out.println("Price: "+ new String(ch, start,lenght));
            year = false;
        }
    }

}

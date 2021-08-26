package codingPractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import com.google.*;

class RestTemplate{
    public void getDetails() throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        String readLine="";
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept","application/json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer s = new StringBuffer();
        while((readLine=bufferedReader.readLine())!=null){
            s.append(readLine);
        }
        bufferedReader.close();
        System.out.println(s);


    }
}

public class RestService {
    public static void main(String[] args) throws IOException {
        RestTemplate rs = new RestTemplate();
        rs.getDetails();
    }
}

class Book{
    public String userId;
    public int id;
    public String title;
    public String body;

    public Book(String userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Book() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

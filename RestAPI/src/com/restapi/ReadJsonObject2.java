package com.restapi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.testng.annotations.Test;

import gvjava.org.json.JSONArray;
import gvjava.org.json.JSONObject;

public class ReadJsonObject2{
@Test
public void aptTesting() throws Exception {
try {
URL url = new URL("http://www.google.com");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
conn.setRequestProperty("Accept", "application/json");

if (conn.getResponseCode() != 200) {
throw new RuntimeException(" HTTP error code :" + conn.getResponseCode());
}

Scanner scan = new Scanner(url.openStream());
String entireResponse = new String();
while (scan.hasNext())
entireResponse += scan.nextLine();

System.out.println("Response :" +entireResponse);

scan.close();

JSONObject obj = new JSONObject(entireResponse );
/*
String responseCode = obj.getString("u_email");
System.out.println("u_email : " + responseCode);
*/
JSONArray arr = obj.getJSONArray("data");
for (int i = 0; i < arr.length(); i++) {
String u_email = arr.getJSONObject(i).getString("u_email");
System.out.println("u_email : " + u_email);
String u_name = arr.getJSONObject(i).getString("u_name");
System.out.println("u_name : " + u_name);
String u_phone_no = arr.getJSONObject(i).getString("u_phone_no");
System.out.println("u_phone_no : " + u_phone_no);


}

conn.disconnect();
} catch (MalformedURLException e) {
e.printStackTrace();

} catch (IOException e) {

e.printStackTrace();

}

}
}
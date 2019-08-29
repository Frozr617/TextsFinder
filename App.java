import java.util.Scanner;
import java.util.Random;
import java.awt.Desktop;
import java.net.URI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class App{

  public static String theme;

  public static void main(String[] args) {
    welcome();
  }
  public static void welcome() {
    System.out.println("Вітаю! Напишіть тему твору і я найду твір: ");
    takingTheme();
  }
  public static void takingTheme() {
    Scanner themeTaker = new Scanner(System.in);
    theme = themeTaker.nextLine();
    System.out.println("Шукаю твори по темі " + theme);
    googling();
  }
  public static void googling() {
    try{
      URI searchURI = new URI("https://www.google.com/search?q=твір+на+тему+" + theme + "&oq=твір+на+тему+" + theme + "&aqs=chrome..69i57j33l5.17195j0j7&sourceid=chrome&ie=UTF-8");
      try{
      Desktop searching = Desktop.getDesktop();
      searching.browse(searchURI);
      }
      catch(IOException e){
        System.out.println("Error");
      }
    }
    catch(URISyntaxException e){
      System.out.println("Error");
    }
    takingData();
  }
  public static void takingData() {
    System.out.println("Беру данні із сайтів...");
  }
}

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
  public static String themeWord1;
  public static String themeWord2;
  public static String themeWord3;

  public static void main(String[] args) {
    welcome();
  }
  public static void welcome() {
    System.out.println("Вітаю! Напишіть тему твору і я найду твір: ");
    takingTheme();
  }
  public static void takingTheme() {


    System.out.println("1 слово: ");
    Scanner themeTaker1 = new Scanner(System.in);
    themeWord1 = themeTaker1.nextLine();
    System.out.println("2 слово: ");
    Scanner themeTaker2 = new Scanner(System.in);
    themeWord2 = themeTaker2.nextLine();
    System.out.println("3 слово: ");
    Scanner themeTaker3 = new Scanner(System.in);
    themeWord3 = themeTaker3.nextLine();

    System.out.println("Шукаю твори по темі " + themeWord1 + " " + themeWord2 + " " + themeWord3);
    googling();
  }
  public static void googling() {
    try{
      try{
        if (themeWord2.equals("") && themeWord3.equals("")) {
          URI searchURI1 = new URI("https://www.google.com/search?q=твір+на+тему+" + themeWord1 + "&oq=твір+на+тему+" + themeWord1 + "&aqs=chrome..69i57j33l5.17195j0j7&sourceid=chrome&ie=UTF-8");
          try{
          Desktop searching = Desktop.getDesktop();
          searching.browse(searchURI1);
          }
          catch(IOException e){
            System.out.println("Error");
          }
        }
        else if (themeWord3.equals("")) {
          URI searchURI2 = new URI("https://www.google.com/search?q=твір+на+тему+" + themeWord1 + "+" + themeWord2 + "&oq=твір+на+тему+" + themeWord1 + "+" + themeWord2 + "&aqs=chrome..69i57j33l5.17195j0j7&sourceid=chrome&ie=UTF-8");
          try{
          Desktop searching = Desktop.getDesktop();
          searching.browse(searchURI2);
          }
          catch(IOException e){
            System.out.println("Error");
          }
        }
        else {
          URI searchURI3 = new URI("https://www.google.com/search?q=твір+на+тему+" + themeWord1 + "+" + themeWord2 + "+" + themeWord3 + "&oq=твір+на+тему+" + themeWord1 + "+" + themeWord2 + "+" + themeWord3 + "&aqs=chrome..69i57j33l5.17195j0j7&sourceid=chrome&ie=UTF-8");
          try{
          Desktop searching = Desktop.getDesktop();
          searching.browse(searchURI3);
          }
          catch(IOException e){
            System.out.println("Error");
          }
        }
      }
      catch(URISyntaxException e){
        System.out.println("Error");
      }
    }
    catch(NullPointerException e){
      System.out.println("Error");
    }
    takingData();
  }
  public static void takingData() {
    System.out.println("Беру данні із сайтів...");
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */

import java.util.*;

public class Reader {
    private Scanner reader = new Scanner(System.in);
     public String readString(){
         String input = reader.nextLine();
         return input;
     }
     
     public int readInteger(){
         int num = Integer.parseInt(reader.nextLine());
         return num;
     }
}

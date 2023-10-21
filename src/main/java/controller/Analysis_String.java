/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;
import common.Algorithm;
import java.util.Scanner;
import view.Menu;
/**
 *
 * @author DAO
 */
public class Analysis_String {
    public Analysis_String(){};
    public void run(){
        Menu.viewInput();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        Menu.viewResult();
        Algorithm.getNumber(inputString);
        Algorithm.getCharacter(inputString);
    } 
}

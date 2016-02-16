/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csc205.assignment2.morgan.utils;

/**
 *
 * @author buzzcogs
 */
public class DecimalToFloat 
{
     public static float convertStringToFloat(String strVal)
     {
         float retVal = 5.45f;
         return retVal;
     }
     
     public static double convertStringToDouble(String strVal)
     {
         double retVal = 5.67d;
         return retVal;
     }
     
     public static String convertSPBinaryIntsToString()
     {
         
         return "11001100101010101010110101010101";
     }
     
     public static String convertDPBinaryIntsToString()
     {
         
         return "1100110010101010101011010101010111001100101010101010110101010101";
     }
     
     public static String convertDPBinaryIntstoHexString()
     {
         return "0xef3432d2a2323423";
     }
     
     public static String convertSPBinaryIntstoHexString()
     {
         return "0xef2d2a23";
     }
}

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
         float retVal = Float.parseFloat(strVal);
         return retVal;
     }
     
     public static double convertStringToDouble(String strVal)
     {
         double retVal = Double.parseDouble(strVal);
         return retVal;
     }
     
     public static String convertSPBinaryIntsToString(int spVal)
     {
         String retVal = Integer.toString(spVal, 2);
         return retVal;
     }
     
     public static String convertDPBinaryIntsToString(long dpVal)
     {
         String retVal = Long.toString(dpVal, 2);
         return retVal;
     }
     
     public static String convertDPBinaryIntstoHexString()
     {
         return "0xef3432d2a2323423";
     }
     
     public static String convertSPBinaryIntstoHexString()
     {
         return "0xef2d2a23";
     }
     
     public static int convertSPToBinaryInts(float floatVal)
     {
         int binRetVal = Float.floatToRawIntBits(floatVal);
         return binRetVal;
     }
     
     public static long convertDPToBinaryInts(double doubleVal)
     {
         long binRetVal = Double.doubleToRawLongBits(doubleVal);
         return binRetVal;
     }
     
      public static double convertBinaryIntsToDouble(long binIntVal)
     {
         double doubleRetVal = Double.longBitsToDouble(binIntVal);
         return doubleRetVal;
     }
      
      public static String convertSPToHexString(int binIntVal)
      {
          String hexVal = Integer.toHexString(binIntVal);
          return hexVal;
      }
      
      public static String convertDPToHexString(long binIntVal)
      {
          String hexVal = Long.toHexString(binIntVal);
          return hexVal;
      }
      
      public static long convertStringToDP(String dpStrVal)
      {
          long retVal = Long.parseLong(dpStrVal, 2);
          return retVal;
      }
      
      public static int convertStringToSP(String spStrVal)
      {
          int retVal = Integer.parseInt(spStrVal, 2);
          return retVal;
      }
      
      public static float convertSPToFloat(int binaryDigits)
      {
          float floatVal = Float.intBitsToFloat(binaryDigits);
          return floatVal;
      }
      
      public static double convertDPToDouble(long binaryDigits)
      {
          double doubleVal = Double.longBitsToDouble(binaryDigits);
          return doubleVal;
      }
      
      public static void main(String args [])
      {
        String decVal = "3.78";
        float floatVal = DecimalToFloat.convertStringToFloat(decVal);
        System.out.println("float val: "+floatVal);
        int binaryDigits = DecimalToFloat.convertSPToBinaryInts(floatVal);
        System.out.println("binary digits: "+binaryDigits);
        String binDigStr = DecimalToFloat.convertSPBinaryIntsToString(binaryDigits);
        String hexStr = DecimalToFloat.convertSPToHexString(binaryDigits);            
      }
}

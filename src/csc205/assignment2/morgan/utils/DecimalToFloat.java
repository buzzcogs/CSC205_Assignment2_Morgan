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
         
         return "11001100101010101010110101010101";
     }
     
     public static String convertDPBinaryIntsToString(long dpVal)
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
     
     public static int convertSPToBinaryInts(float floatVal)
     {
         int binRetVal = Float.floatToRawIntBits(floatVal);
         return binRetVal;
     }
     
     public static long convertDPToBinaryInts(double doubleVal)
     {
         doubleVal = -4062.0029d;
         long binRetVal = Double.doubleToRawLongBits(doubleVal);
         return binRetVal;
     }
     
      public static double convertBinaryIntsToDouble(long binIntVal)
     {
         binIntVal = 0b1010000101000101101000010100010110100001010001011010000101000101L;
         double doubleRetVal = Double.longBitsToDouble(binIntVal);
         return doubleRetVal;
     }
      
      public static String convertSPToHexString(int binIntVal)
      {
         // binIntVal = 0b01000010100010110100001010001011;
          String hexVal = Integer.toHexString(binIntVal);
          return hexVal;
      }
      
      public static String convertDPToHexString(long binIntVal)
      {
          binIntVal = 0b1010000101000101101000010100010110100001010001011010000101000101L;
          String hexVal = Long.toHexString(binIntVal);
          return hexVal;
      }
      
      public static long convertStringToDP(String dpStrVal)
      {
          dpStrVal = "1010000101000101101000010100010110100001010001011010000101000101";
          long retVal = Long.parseLong(dpStrVal, 2);
          return retVal;
      }
      
      public static long convertStringToSP(String spStrVal)
      {
          spStrVal = "1010000101000101101000010100010110100001010001011010000101000101";
          int retVal = Integer.parseInt(spStrVal, 2);
          return retVal;
      }
}

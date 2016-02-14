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
public class Converter 
{
    // when converting from decimal to float/double
    // read in string and convert to double
    // read in double and convert to integral and fractional part
    // test for positive or negative value
    // then convert both fractional and integral to binary
    // if negative convert to 2's complement
    // Append 2^0 to the end of the binary number
    // test value of integral for value greater than 1
    // move the binary point so that it is one bit from the left
    // "normalize" the number adjust the exponent of 2 so that the 
    // value does not change.  
    // copy significand into significand part of array fill with 
    // zeros to the right
    // add the bias to the exponent and place it in the exponent field
    // the bias of 2^(k-1) -1 where k is the number of exponent fields
    // for 32 bits the k=8 so the bias is 127
    // set the sign bit
    // format for 32 bit is 
    // sign bit(1) exponent bits (8) significand bits (23)
    // format for 64 bit is 
    // sign bit (1) exponent bits (11) significand bits (52)
    
    // when converting from float to decimal
    // if the number is in hex convert it to binary
    // seperate sign exponent and significand fields
     // format for 32 bit is 
    // sign bit(1) exponent bits (8) significand bits (23)
    //  bias of 127
    // format for 64 bit is 
    // sign bit (1) exponent bits (11) significand bits (52)
    // bias of 1023
    // extract the significand and add 1 back to the significand 
    // and omit trailing zeroes
    // extract the exponent from the exponent field and subtract the bias
    // to obain the actual exponent 
    // de-normalize the number move the binary point so the exponent becomes 0
    // convert the binary to decimal 
    // set the sign from the sign bit
    public static double stringToDouble(String strVal)
    {
        double value = Double.parseDouble(strVal);
        return value;
    }
    
    public static double[] doubleToParts(double dblVal)
    {
        double fractionalPart = dblVal % 1;
        double integralPart = dblVal - fractionalPart;
        double [] retVals = { integralPart, fractionalPart};
        System.out.println("dblVal: "+dblVal+" integralpart:"+
                integralPart+" fractionalpart:"+fractionalPart);
        return retVals;
    }
    
    public static  int [] convertDoubleArrayToBinaryArray(double [] dblArray)
    {
        int num = 255; 
        boolean isNegVal = ( dblArray[0] < 0);
        double absValIntegral = (dblArray[0] <= 0.0D) ? 0.0D - dblArray[0] : dblArray[0];
        double absValFractional = (dblArray[1] <= 0.0D) ? 0.0D - dblArray[1] : dblArray[1];
    
        int binary[] = new int[40];
        int index = 0;
        while(num > 0)
        {
           binary[index++] = num%2;
           num = num/2;
        }        
        return binary;
    }
    
    public static int [] convertToIEEE754SinglePrecisionArray(int [] binaryArray)
    {
     // convert to a binary array representation of the 
     // The IEEE-754 single precision floating point standard 
    // The IEEE-754 single precision floating point standard uses 
    // an 8-bit exponent (with a bias of 127) and a 23-bit significand.
        int [] retVal = new int [32] ;
        return retVal;
    }
    
    public static int [] convertToIEEE754DoublePrecisionArray(int [] binaryArray)
    {
     // convert to a binary array representation of the 
     // The IEEE-754 double precision floating point standard 
     // The IEEE-754 double precision standard uses an 11-bit exponent
    // (with a bias of 1023) and a 52-bit significand.
        int [] signBit = new int [1];
        int [] significand = new int [52];
        int [] exponent = new int [11];
        int [] retVal = new int [64] ;
        return retVal;
    }
    
    public static char [] IEEE754SinglePrecisionToHexArray ( int [] sglPrecision)
    {
        char [] retVal = new char [8];
        if (sglPrecision.length != 32)
        {
           // retVal = {'I', 'N', 'V', 'A', 'L', 'I', 'D'};
        }
        else
        {
           //retVal = {'F', 'F', 'F'}; 
        }
        
        return retVal;
    }
      
    
    public static char [] IEEE754DoublePrecisionToHexArray ( int [] dblPrecision)
    {
        //char [] retVal = {'F', 'F', 'F'};
        char [] retVal = new char [16];
        if (dblPrecision.length != 64)
        {
           // retVal = {'I', 'N', 'V', 'A', 'L', 'I', 'D'};
        }
        else
        {
           //retVal = {'F', 'F', 'F'}; 
        }
        return retVal;
    }
    
       
    
    public static int [] HexToIEE754DoublePrecisionArray ( char [] hexArray)
    {
        //char [] retVal = {'F', 'F', 'F'};
        int [] retVal = new int [64];
        if (hexArray.length != 16)
        {
           // retVal = {'I', 'N', 'V', 'A', 'L', 'I', 'D'};
        }
        else
        {
           //retVal = {'F', 'F', 'F'}; 
        }
        return retVal;
    }
    
    public static int [] HexToIEE754SinglePrecisionArray ( char [] hexArray)
    {
        //char [] retVal = {'F', 'F', 'F'};
        int [] retVal = new int [32];
        if (hexArray.length != 8)
        {
           // retVal = {'I', 'N', 'V', 'A', 'L', 'I', 'D'};
        }
        else
        {
           //retVal = {'F', 'F', 'F'}; 
        }
        return retVal;
    }
        
    public static void main (String args[])
    {
        String inputVal ="-354.200001234";
        double value = Double.parseDouble(inputVal);
        double fractionalPart = value % 1;
        double integralPart = value - fractionalPart;
        boolean is_negative = integralPart >= 0;
        
        System.out.println("value: "+value+" integralpart:"+
                integralPart+" fractionalpart:"+fractionalPart);
        
        Converter.doubleToParts(3.25);   
        Converter.doubleToParts(-3.25);
    }    
    
}

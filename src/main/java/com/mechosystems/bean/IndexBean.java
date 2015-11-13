package com.mechosystems.bean;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.inject.Model;

/**
 *
 * @author romanm
 */
@Model
public class IndexBean {
   private String inFormula  = "";
   private String outFormula = "";
   
    private static String str  = "";
    private static String str1 = "";
    private static String str2 = "";
    private static String str3 = "";
    private static String str4 = "";
    private static String str5 = "";
    private static String strRow1 = "";
    private static String strRow2 = "";
    private static String strRow3 = "";
    private static String strRow4 = "";
    private static String strRow5 = "";
    private static boolean isException;
   
    
    public void doClear(){
        inFormula="";
        outFormula="";
    }

   public void doFormat(){
       outFormula = inFormula + "\n" +"ssssssss";
       
        //str = inputTA.getText();
        str = inFormula;
        str = str.replace(" ", "").replace(" ", "").replace(" ", "").replace(" ", "");

        //outputTA.setText("Lenght= " + str.length() + "\n");
        outFormula=("Length=" + str.length() + "   Max=245"  + "\n\n");

        str1 = "";
        str2 = "";
        str3 = "";
        str4 = "";
        str5 = "";
        strRow1 = "";
        strRow2 = "";
        strRow3 = "";
        strRow4 = "";
        strRow5 = "";
        isException = false;
        
        if (str.length() > 0 & str.length() > 49) {
            System.out.println("start1-------------------------------------------");
            NavigableMap nm1 = updArray(str);
            System.out.println(str);
            System.out.println(nm1.toString());
            try {
                int l1 = (Integer) nm1.floorKey(48);
                System.out.println("l1=" + l1);
                strRow1 = str.subSequence(0, l1 + 1).toString();
                str1 = str.substring(l1 + 1);
            } catch (Exception e) {
                isException = true;
            }
            System.out.println("strRow1" + strRow1);
            System.out.println("str1= " + str1);
            System.out.println("end1---------------------------------------------");
        } else {
            strRow1 = str;
        }



        if (str1.length() > 0 & str1.length() > 49) {
            System.out.println("start2-------------------------------------------");
            NavigableMap nm2 = updArray(str1);
            System.out.println(str1);
            System.out.println(nm2.toString());
            try {
                int l2 = (Integer) nm2.floorKey(48);
                System.out.println("l2=" + l2);
                strRow2 = str1.subSequence(0, l2 + 1).toString();
                str2 = str1.substring(l2 + 1);
            } catch (Exception e) {
                isException = true;
            }
            System.out.println(strRow2);
            System.out.println(str2);
            System.out.println("end2---------------------------------------------");
        } else {
            strRow2 = str1;
        }


        if (str2.length() > 0 & str2.length() > 49) {
            System.out.println("start3-------------------------------------------");
            NavigableMap nm3 = updArray(str2);
            System.out.println(str2);
            System.out.println(nm3.toString());
            try {
                int l3 = (Integer) nm3.floorKey(48);
                System.out.println("l3=" + l3);
                strRow3 = str2.subSequence(0, l3 + 1).toString();
                str3 = str2.substring(l3 + 1);
            } catch (Exception e) {
                isException = true;
            }
            System.out.println(strRow3);
            System.out.println(str3);
            System.out.println("end3---------------------------------------------");
        } else {
            strRow3 = str2;
        }


        if (str3.length() > 0 & str3.length() > 49) {
            System.out.println("start4-------------------------------------------");
            NavigableMap nm4 = updArray(str3);
            System.out.println(str3);
            System.out.println(nm4.toString());
            try {
                int l4 = (Integer) nm4.floorKey(48);
                System.out.println("l4=" + l4);
                strRow4 = str3.subSequence(0, l4 + 1).toString();
                str4 = str3.substring(l4 + 1);
            } catch (Exception e) {
                isException = true;
            }
            System.out.println(strRow4);
            System.out.println(str4);
            System.out.println("end4---------------------------------------------");
        } else {
            strRow4 = str3;
        }


        if (str4.length() > 0 & str4.length() > 49) {
            System.out.println("start5-------------------------------------------");
            NavigableMap nm5 = updArray(str4);
            System.out.println(str4);
            System.out.println(nm5.toString());
            try {
                int l5 = (Integer) nm5.floorKey(48);
                System.out.println("l5=" + l5);
                strRow5 = str4.subSequence(0, l5 + 1).toString();
                str5 = str4.substring(l5 + 1);
            } catch (Exception e) {
                isException = true;
            }
            System.out.println(strRow5);
            System.out.println(str5);
            System.out.println("end5---------------------------------------------");
        } else {
            strRow5 = str4;
        }
        

        if (str.length() < 246) {
            //outputTA.append(strRow1 + "\n");
            //outputTA.append(strRow2 + "\n");
            //outputTA.append(strRow3 + "\n");
            //outputTA.append(strRow4 + "\n");
            //outputTA.append(strRow5 + "\n");
            outFormula = outFormula + strRow1 + "\n\n";
            outFormula = outFormula + strRow2 + "\n\n";
            outFormula = outFormula + strRow3 + "\n\n";
            outFormula = outFormula + strRow4 + "\n\n";
            outFormula = outFormula + strRow5 + "\n\n";
        } else {
            //outputTA.setText("Too many Charaters in the formula (max 245)");
            //outputTA.setText("Lenght= " + str.length() + "        MAX(245)" + "\n");
            outFormula=("Too many Charaters in the formula (max 245)");
            outFormula=("Lenght= " + str.length() + "        MAX(245)" + "\n");
        }

        if(isException==true){
            outFormula=("Can not Format the Formaula !!!");
        }


        //System.out.println("Row1= " + strRow1);
        //System.out.println("Row2= " + strRow2);
        //System.out.println("Row3= " + strRow3);
        //System.out.println("Row4= " + strRow4);
        //System.out.println("Row5= " + strRow5);
       
       
   }
   
   
    public String getInFormula() {
        return inFormula;
    }
   
    public static NavigableMap updArray(String str) {
        NavigableMap<Integer, String> arrayFind = new TreeMap<Integer, String>();
        str = str.replace(" ", "").replace(" ", "").replace(" ", "");
        Pattern p = Pattern.compile("[+*)<>-]");
        Matcher m = p.matcher(str);
        boolean b = false;

        while (b = m.find()) {
            //System.out.println(m.start() + " " + m.group());
            arrayFind.put(m.start(), m.group());
        }
        return arrayFind;
    }
    
    
    
    
    public void setInFormula(String inFormula) {
        this.inFormula = inFormula;
    }

    public String getOutFormula() {
        return outFormula;
    }

    public void setOutFormula(String outFormula) {
        this.outFormula = outFormula;
    }
   
   
}

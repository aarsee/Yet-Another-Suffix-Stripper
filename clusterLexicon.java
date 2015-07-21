package org.terrier.terms;
import java.io.*;
import org.terrier.terms.*;
import org.terrier.utility.ApplicationSetup;
import java.util.*;

public class clusterLexicon extends StemmerTermPipeline
{
	public clusterLexicon(TermPipeline next)
	{
		super(next);
	}

    public static void main(String[] args)
	{
	}

    public String stem_fun(String inputWord) throws IOException
    {
    	String return_word=null;
		try
        {
            FileInputStream input;
            String strLine;
            char letter = inputWord.charAt(0);
            int max=0;
    		String w=null;
            switch(letter)
            {
                case 'અ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/1.txt");
                       break;
                case 'આ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/2.txt");
                       break;
                case 'ઇ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/3.txt");
                       break;
                case 'ઈ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/4.txt");
                       break;
                case 'ઉ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/5.txt");
                       break;
                case 'ઊ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/6.txt");
                       break;
                case 'ઋ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/7.txt");
                       break;
                case 'એ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/8.txt");
                       break;
                case 'ઍ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/9.txt");
                       break;
                case 'ઐ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/10.txt");
                       break;
                case 'ઑ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/11.txt");
                       break;
                case 'ઓ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/12.txt");
                       break;
                case 'ઔ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/13.txt");
                       break;
                case 'ક' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/14.txt");
                       break;
                case 'ખ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/15.txt");
                       break;
                case 'ગ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/16.txt");
                       break;
                case 'ઘ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/17.txt");
                       break;
                case 'ઙ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/18.txt");
                       break;
                case 'ચ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/19.txt");
                       break;
                case 'છ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/20.txt");
                       break;
                case 'જ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/21.txt");
                       break;
                case 'ઝ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/22.txt");
                       break;
                case 'ઞ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/23.txt");
                       break;
                case 'ટ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/24.txt");
                       break;
                case 'ઠ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/25.txt");
                       break;
                case 'ડ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/26.txt");
                       break;
                case 'ઢ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/27.txt");
                       break;
                case 'ણ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/28.txt");
                       break;
                case 'ત' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/29.txt");
                       break;
                case 'થ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/30.txt");
                       break;
                case 'દ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/31.txt");
                       break;
                case 'ધ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/32.txt");
                       break;
                case 'ન' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/33.txt");
                       break;
                case 'પ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/34.txt");
                       break;
                case 'ફ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/35.txt");
                       break;
                case 'બ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/36.txt");
                       break;
                case 'ભ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/37.txt");
                       break;
                case 'મ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/38.txt");
                       break;
                case 'ય' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/39.txt");
                       break;
                case 'ર' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/40.txt");
                       break;
                case 'લ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/41.txt");
                       break;
                case 'ળ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/42.txt");
                       break;
                case 'વ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/43.txt");
                       break;
                case 'શ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/44.txt");
                       break;
                case 'ષ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/45.txt");
                       break;
                case 'સ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/46.txt");
                       break;
                case 'હ' : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/47.txt");
                       break;
                default : input = new FileInputStream("/home/irlab/Desktop/terrier-3.6/src/core/Gujarati_Model_Files_Fire11/48.txt");
                          break;
            }

            BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
            while ((strLine = buffer.readLine()) != null)   
            {
                    String[] delims = strLine.split(" ");
                    for(int j=0;j<delims.length;j++)
                    {
                        if(delims[j].equals(inputWord)==true)
                        {
                            int first = delims[0].length();
                            max=first;
                            for(int i=1;i<delims.length;i++)
                            {
                                int second = delims[i].length();
                                if(second<first)
                                {
                                    max=second;
                                }
                            }
                           	return_word = call(max,strLine);
                        }
                    }
            }
            buffer.close();
    		return return_word;
		}
        catch(IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String call(int l, String s)
    {
    	    String alpha=null;
    		String[] d = s.split(" ");
            for(int i=0;i<d.length;i++)
           	{
                if(d[i].length()==l) 
                {
                    alpha= d[i];
                }
            }
            return alpha;
    }

    public String stem(String word)
    {	
    	String st_wd=null;
    	try
        {
    		st_wd = stem_fun(word);	
    	}
    	catch(IOException e)
        {
    		e.printStackTrace();
    	}
    return st_wd;
    }
}

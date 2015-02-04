package cse.manoj.one;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
		
		

		/**
		 * Created by Venkata Karthik on 8/17/2014.
		 */
		public class BingHack {


		        public static void main(String args[])
		        {
		            String line;
		            //line = "";
		            int k=0;
		            int numberOfRuns = Integer.parseInt(args[0]);
		            for (int i=0; i<numberOfRuns; i++)
		            {
		            	System.out.println("Doing "+(i+1)+" of "+numberOfRuns);
		                //line = new String();
		                try {
		                    Random random = new Random();
		                    int randomInt = random.nextInt(1289300);
		                    FileReader fr = new FileReader("C:\\Users\\SaiManoj\\Desktop\\english.txt");
		                    BufferedReader reader = new BufferedReader(fr);
		                    line = reader.readLine();
		                    Scanner scan = null;
		                    for (int j = 0; j < randomInt + 1; j++)
		                    {
		                        scan = new Scanner(line);
		                        line = reader.readLine();
		                    /*if(line.contains(" "))
		                    {
		                        k = line.indexOf(" ");
		                        line = line.substring(0,k);

		                    }*/
		                    }

		                  //  Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe www.bing.com/search?q=" + line);

		                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://www.m.bing.com/search?q=" + line);

		                    Thread.sleep(4000);
		                    //JOptionPane.showMessageDialog(null, line);
		                }
		                catch (IOException e)
		                {
		                    JOptionPane.showMessageDialog(null, e.getMessage() + " for lol.txt", "File Error", JOptionPane.ERROR_MESSAGE);
		                }

		                catch(Exception e)
		                {

		                }

		            }
		        
	}

}
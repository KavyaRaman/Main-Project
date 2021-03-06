import java.awt.*;
//import javax.swing.*;
//import javax.imageio.*;
import java.io.*;
//import java.awt.Image;
//import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.*;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class Typing
{  
  //Need to import files into an arrayList of lessons
  //Setup function to display and run typing lessons
  //Include keyListeners
  
  String line;
  boolean shiftPressed=false;
  private Main ba;
  int charNumb=0;
  boolean typed=false;
  boolean lessonCounted=false;
  String typedChar="kjsfdhsg";
  int x=25;
  ArrayList<String>lessons=new ArrayList<String>(); 
  ArrayList<ColourChar> colourChars = new ArrayList<ColourChar>();
  double correctChars=0;
  double incorrectChars=0;
  double acc=0;
  
  public Typing(Main ba)
  {
    this.ba=ba;
    try
    {
      //Create a new instance of the FileReader and pass it the
      //file that needs to be read
      FileReader fr = new FileReader("Word List.txt");
      //Create a new instance of the BufferedReader and
      //add the FileReader to it
      BufferedReader br = new BufferedReader(fr);
      //A string variable that will temporarily what youâ€™re reading
      
      //A dual purpose line! First it reads the next line and then
      //it checks to see if that line was null. If itâ€™s null, then
      //that means youâ€™re at the end of the file.
      while ((line=br.readLine()) != null)
      {
        lessons.add(line);
      }
      //close the file when youâ€™re done
      br.close();
    }
    catch(IOException e)
    {
      //Error message
    }
  }
  
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode()==KeyEvent.VK_SHIFT)
    {shiftPressed=false;}
    if(e.getKeyCode()==KeyEvent.VK_SPACE)
    {typedChar=" ";typed=true;}
// LOWER CASE LETTERS
    if (e.getKeyCode()==KeyEvent.VK_A && shiftPressed==false)
    {typedChar="a";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_B && shiftPressed==false)
    {typedChar="b";typed=true;}  
    if (e.getKeyCode()==KeyEvent.VK_C && shiftPressed==false)
    {typedChar="c";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_D && shiftPressed==false)
    {typedChar="d";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_E && shiftPressed==false)
    {typedChar="e";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_F && shiftPressed==false)
    {typedChar="f";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_G && shiftPressed==false)
    {typedChar="g";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_H && shiftPressed==false)
    {typedChar="h";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_I && shiftPressed==false)
    {typedChar="i";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_J && shiftPressed==false)
    {typedChar="j";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_K && shiftPressed==false)
    {typedChar="k";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_L && shiftPressed==false)
    {typedChar="l";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_M && shiftPressed==false)
    {typedChar="m";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_N && shiftPressed==false)
    {typedChar="n";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_O && shiftPressed==false)
    {typedChar="o";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_P && shiftPressed==false)
    {typedChar="p";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_Q && shiftPressed==false)
    {typedChar="q";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_R && shiftPressed==false)
    {typedChar="r";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_S && shiftPressed==false)
    {typedChar="s";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_T && shiftPressed==false)
    {typedChar="t";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_U && shiftPressed==false)
    {typedChar="u";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_V && shiftPressed==false)
    {typedChar="v";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_W && shiftPressed==false)
    {typedChar="w";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_X && shiftPressed==false)
    {typedChar="x";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_Y && shiftPressed==false)
    {typedChar="y";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_Z && shiftPressed==false)
    {typedChar="z";typed=true;}
    
// UPPER CASE LETTERS
    if (e.getKeyCode()==KeyEvent.VK_A && shiftPressed==true)
    {typedChar="A";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_B && shiftPressed==true)
    {typedChar="B";typed=true;}  
    if (e.getKeyCode()==KeyEvent.VK_C && shiftPressed==true)
    {typedChar="C";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_D && shiftPressed==true)
    {typedChar="D";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_E && shiftPressed==true)
    {typedChar="E";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_F && shiftPressed==true)
    {typedChar="F";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_G && shiftPressed==true)
    {typedChar="G";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_H && shiftPressed==true)
    {typedChar="H";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_I && shiftPressed==true)
    {typedChar="I";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_J && shiftPressed==true)
    {typedChar="J";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_K && shiftPressed==true)
    {typedChar="K";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_L && shiftPressed==true)
    {typedChar="L";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_M && shiftPressed==true)
    {typedChar="M";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_N && shiftPressed==true)
    {typedChar="N";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_O && shiftPressed==true)
    {typedChar="O";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_P && shiftPressed==true)
    {typedChar="P";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_Q && shiftPressed==true)
    {typedChar="Q";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_R && shiftPressed==true)
    {typedChar="R";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_S && shiftPressed==true)
    {typedChar="S";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_T && shiftPressed==true)
    {typedChar="T";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_U && shiftPressed==true)
    {typedChar="U";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_V && shiftPressed==true)
    {typedChar="V";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_W && shiftPressed==true)
    {typedChar="W";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_X && shiftPressed==true)
    {typedChar="X";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_Y && shiftPressed==true)
    {typedChar="Y";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_Z && shiftPressed==true)
    {typedChar="Z";typed=true;}
    
// NUMBERS
    if (e.getKeyCode()==KeyEvent.VK_0 && shiftPressed==false)
    {typedChar="0";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_1 && shiftPressed==false)
    {typedChar="1";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_2 && shiftPressed==false)
    {typedChar="2";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_3 && shiftPressed==false)
    {typedChar="3";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_4 && shiftPressed==false)
    {typedChar="4";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_5 && shiftPressed==false)
    {typedChar="5";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_6 && shiftPressed==false)
    {typedChar="6";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_7 && shiftPressed==false)
    {typedChar="7";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_8 && shiftPressed==false)
    {typedChar="8";typed=true;}
    if (e.getKeyCode()==KeyEvent.VK_9 && shiftPressed==false)
    {typedChar="9";typed=true;}
// PUNCTUATION AND OTHER CHARARATERS
    if (e.getKeyCode()==KeyEvent.VK_BACK_QUOTE && shiftPressed==false)
    {typedChar="`";typed=true;}//`
    if (e.getKeyCode()==KeyEvent.VK_MINUS && shiftPressed==false)
    {typedChar="-";typed=true;}//-
    if (e.getKeyCode()==KeyEvent.VK_EQUALS && shiftPressed==false)
    {typedChar="=";typed=true;}//=
    if (e.getKeyCode()==KeyEvent.VK_BACK_QUOTE && shiftPressed==true)
    {typedChar="~";typed=true;}//~
    if (e.getKeyCode()==KeyEvent.VK_1 && shiftPressed==true)
    {typedChar="!";typed=true;}//!
    if (e.getKeyCode()==KeyEvent.VK_2 && shiftPressed==true)
    {typedChar="@";typed=true;}//@
    if (e.getKeyCode()==KeyEvent.VK_3 && shiftPressed==true)
    {typedChar="#";typed=true;}//#
    if (e.getKeyCode()==KeyEvent.VK_4 && shiftPressed==true)
    {typedChar="$";typed=true;}//$
    if (e.getKeyCode()==KeyEvent.VK_5 && shiftPressed==true)
    {typedChar="%";typed=true;}//%
    if (e.getKeyCode()==KeyEvent.VK_6 && shiftPressed==true)
    {typedChar="^";typed=true;}//^
    if (e.getKeyCode()==KeyEvent.VK_7 && shiftPressed==true)
    {typedChar="&";typed=true;}//&
    if (e.getKeyCode()==KeyEvent.VK_8 && shiftPressed==true)
    {typedChar="*";typed=true;}//*
    if (e.getKeyCode()==KeyEvent.VK_9 && shiftPressed==true)
    {typedChar="(";typed=true;}//(
    if (e.getKeyCode()==KeyEvent.VK_0 && shiftPressed==true)
    {typedChar=")";typed=true;}//)
    if (e.getKeyCode()==KeyEvent.VK_MINUS && shiftPressed==true)
    {typedChar="_";typed=true;}//_
    if (e.getKeyCode()==KeyEvent.VK_EQUALS && shiftPressed==true)
    {typedChar="+";typed=true;}//+
    if (e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET && shiftPressed==false)
    {typedChar="[";typed=true;}//[
    if (e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET && shiftPressed==false)
    {typedChar="]";typed=true;}//]
    if (e.getKeyCode()==KeyEvent.VK_BACK_SLASH && shiftPressed==false)
    {typedChar="\\";typed=true;}//\
    if (e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET && shiftPressed==true)
    {typedChar="{";typed=true;}//{
    if (e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET && shiftPressed==true)
    {typedChar="}";typed=true;}//}
    if (e.getKeyCode()==KeyEvent.VK_BACK_SLASH && shiftPressed==true)
    {typedChar="|";typed=true;}//|
    if (e.getKeyCode()==KeyEvent.VK_SEMICOLON && shiftPressed==false)
    {typedChar=";";typed=true;}//;
    if (e.getKeyCode()==KeyEvent.VK_SEMICOLON && shiftPressed==true)
    {typedChar=":";typed=true;}//:
    if (e.getKeyCode()==KeyEvent.VK_QUOTE && shiftPressed==false)
    {typedChar="'";typed=true;}//'
    if (e.getKeyCode()==KeyEvent.VK_QUOTE && shiftPressed==true)
    {typedChar="\"";typed=true;}//"
    if (e.getKeyCode()==KeyEvent.VK_COMMA && shiftPressed==false)
    {typedChar=",";typed=true;}//,
    if (e.getKeyCode()==KeyEvent.VK_COMMA && shiftPressed==true)
    {typedChar="<";typed=true;}//<
    if (e.getKeyCode()==KeyEvent.VK_PERIOD && shiftPressed==false)
    {typedChar=".";typed=true;}//.
    if (e.getKeyCode()==KeyEvent.VK_PERIOD && shiftPressed==true)
    {typedChar=">";typed=true;}//>
    if (e.getKeyCode()==KeyEvent.VK_SLASH && shiftPressed==false)
    {typedChar="/";typed=true;}///
    if (e.getKeyCode()==KeyEvent.VK_SLASH && shiftPressed==true)
    {typedChar="?";typed=true;}//?
  }
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode()==KeyEvent.VK_SHIFT)
    {
      shiftPressed=true;
    }
  }
  public void keyTyped(KeyEvent e) {
  }
  
  public void resetTyping(){
  shiftPressed=false;
  charNumb=0;
  typed=false;
  lessonCounted=false;
  typedChar="kjsfdhsg";
  x=25;
  colourChars = new ArrayList<ColourChar>();
  correctChars=0;
  incorrectChars=0;
  acc=0;
  }
  
  public void paint(Graphics2D g, int t) {
    int i=25;
    int fontSize = 11;
    g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
    if (t==0)
    {
      g.drawString("",0,0);
    }
    else
    {
      g.drawString(lessons.get(t*2-2), 3, i);i+=14;g.drawString(lessons.get(t*2-1), 3, i); 
      
      if (charNumb<lessons.get(t*2-1).length())
      {
        if (typedChar.equals(lessons.get(t*2-1).substring(charNumb,charNumb+1))==true && typed==true)
        {
//          g.setColor(Color.GREEN);
//          g.drawString(lessons.get(1).substring(charNumb,charNumb+1), x, 500);
//          x+=8;
          charNumb++;
          typed=false;
          correctChars++;
          if (lessons.get(t*2-1).substring(charNumb-1,charNumb).equals(" "))
          {
            colourChars.add(new ColourChar('_', Color.BLUE));
          }
          else
          { 
            colourChars.add(new ColourChar(lessons.get(t*2-1).charAt(charNumb-1), Color.BLUE));
          }
        }
        if (typedChar.equals(lessons.get(t*2-1).substring(charNumb,charNumb+1))==false && typed==true)
        {
//          g.setColor(Color.RED);
//          g.drawString(lessons.get(1).substring(charNumb,charNumb+1), x, 500);
//          x+=8;
          charNumb++;
          typed=false;
          incorrectChars++;
          if (lessons.get(t*2-1).substring(charNumb-1,charNumb).equals(" "))
          {
            colourChars.add(new ColourChar('_', Color.RED));
          }
          else
          {
            colourChars.add(new ColourChar(lessons.get(t*2-1).charAt(charNumb-1), Color.RED));
          }
        }
      }
      else if (lessonCounted==false)
      {
        ba.lessonsDone++;
        lessonCounted=true;
        Main.typingDone = true;
        
      }
      else if (lessonCounted==true) //DELETE FOR FINAL COPY
      {
        
      } 
      x=2;
      for (int i1 = 0; i1 < colourChars.size(); i1++)
      {
        fontSize = 11;
        g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
        g.setColor(colourChars.get(i1).theColour);
        g.drawString(""+colourChars.get(i1).theChar, x, 500);
        x+=7;
      }
      g.setColor(Color.BLACK);
      if (incorrectChars+correctChars==0)
      {
        acc=0;
      }
    else
      {
        acc = Math.floor(correctChars/(correctChars+incorrectChars)*100);
      }
      fontSize = 20;
      g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
      g.drawString(""+(int)acc+"%",1000, 450); 
    } 
  }
}

import java.awt.*;  
import java.awt.event.*;  //coded by Sravan Yeruva
class AEvent2 extends Frame{  
TextField tf;  
AEvent2(){   
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
Outer o = new Outer(this);  
b.addActionListener(o);
 //coded by Sravan Yeruva
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
 //coded by Sravan Yeruva
}  
public static void main(String args[]){  
new AEvent2();  
}  
}  

import java.awt.event.*;  
class Outer implements ActionListener{  
AEvent2 obj;  
Outer(AEvent2 obj){  
//coded by sravan yeruva
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
//coded by sravan yeruva
obj.tf.setText("welcome");  
}  
} 

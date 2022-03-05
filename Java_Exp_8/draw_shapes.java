import java.awt.*;
import javax.swing.*;
class draw_shapes extends Canvas {
        int a;
        draw_shapes() {
         a=1;
        }
        public void paint(Graphics g) {
        	if(a==1) {
        		g.setColor(Color.GREEN);
        		g.drawRect(20,30,100,150);
        		g.fillRect(20,30,100,150);
        		g.setColor(Color.WHITE);
        		g.drawRect(30,40,80,130);
        		g.fillRect(30,40,80,130);
        		g.setColor(Color.BLUE);
        		g.drawOval(45,75,50,50);
        		g.fillOval(45,75,50,50);
        		g.setColor(Color.RED);
        		g.drawLine(140,30,140,100);
        		g.drawLine(180,30,180,100);
        		g.drawLine(140,30,180,100);
        		g.drawLine(180,30,140,100);
        	    	g.drawLine(140,100,180,100);
        		g.drawLine(140,30,180,30);
        	}
        }
	public static void main (String args[]){
		draw_shapes d=new draw_shapes();
		JFrame f=new JFrame();
        	f.add(d);
        	f.setSize(300, 300);
        	f.setVisible(true);
	}
}

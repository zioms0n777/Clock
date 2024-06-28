package Main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	
	String time;
	String day;
	String date;
MyFrame() {
this.setTitle("Ziomson's Clock");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(350,200);
this.setLayout(new FlowLayout());
this.setResizable(false);

	timeFormat = new SimpleDateFormat("hh:mm:ss a");
	dayFormat = new SimpleDateFormat("EEEE");
	dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");
	
	timeLabel = new JLabel();
	dayLabel = new JLabel();
	dateLabel = new JLabel();
	
	timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
	dayLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
	dateLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
	time = timeFormat.format(Calendar.getInstance().getTime());
	timeLabel.setText(time);
	this.add(timeLabel);
	this.add(dayLabel);
	this.add(dateLabel);
	
	this.setVisible(true);
    timeLabel.setForeground(Color.RED);
    timeLabel.setBackground(Color.BLACK);
    timeLabel.setOpaque(true);
	setTime();
	
}
public void setTime() {
	while (true)
	{
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	



}

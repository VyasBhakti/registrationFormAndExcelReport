

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

//import org.jdesktop.swingx.JXDatePicker;

//import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
//import java.time.MonthDay;
//import java.time.Period;
import java.util.*;
import java.awt.GridLayout;


@SuppressWarnings("serial")
public class RegistrationForm extends JFrame implements ActionListener{
               
	
	private JLabel label1;
	private JButton button3;
	private JButton button4;
	private JLabel label2;
	private JComboBox comboBox1;
	private JTextField projectName;
	private JLabel label3;
	private JComboBox comboBox2;
	private JLabel label4;
	private JLabel label5;
	private JTextField textField1;
	private JLabel label6;
	private JTextField textField2;
	private JButton button1;
	private JLabel Month1;
	private JLabel Month2;
	private JLabel Month3;
	private JLabel FPrice1;
	private JLabel FPrice2;
	private JLabel FPrice3;
	private JLabel label7;
	private JLabel label11;
	private JLabel label12;
	private JLabel label8;
	private JTextField textField3;
	private JLabel label10;
	private JTextField textField5;
	private JLabel label9;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField4;
	private JButton button2;
	private JLabel TMonth1;
	private JLabel TMonth2;
	private JLabel TMonth3;
	private JLabel TPrice1;
	private JLabel TPrice2;
	private JLabel TPrice3;
	private Report action1;
	private ReportTP action2;
	private ReportTotalAmount action3;
	public JPanel panel;
	//private JXDatePicker picker;
	//private JXDatePicker pickerEnd;
// Defining Constructor
RegistrationForm() {
	
	setSize(900, 500);
	label1 = new JLabel();
	button3 = new JButton();
	button4 = new JButton();
	label2 = new JLabel();
	comboBox1 = new JComboBox();
	projectName = new JTextField();
	label3 = new JLabel();
	comboBox2 = new JComboBox();
	label4 = new JLabel();
	label5 = new JLabel();
	textField1 = new JTextField();
	label6 = new JLabel();
	label11 = new JLabel();
	label12 = new JLabel();
	textField2 = new JTextField();
	button1 = new JButton();
	Month1 = new JLabel();
	Month2 = new JLabel();
	Month3 = new JLabel();
	FPrice1 = new JLabel();
	FPrice2 = new JLabel();
	FPrice3 = new JLabel();
	label7 = new JLabel();
	label8 = new JLabel();
	textField3 = new JTextField();
	label10 = new JLabel();
	textField5 = new JTextField();
	label9 = new JLabel();
	textField6 = new JTextField();
	textField7 = new JTextField();
	textField4 = new JTextField();
	button2 = new JButton();
	TMonth1 = new JLabel();
	TMonth2 = new JLabel();
	TMonth3 = new JLabel();
	TPrice1 = new JLabel();
	TPrice2 = new JLabel();
	TPrice3 = new JLabel();
	action1 = new Report();
	action2 = new ReportTP();
	action3 = new ReportTotalAmount();

	System.out.println("Inside1");
	//======== this ========

	
	/*setLayout(new MigLayout(
		"hidemode 3",
		"[fill][fill][fill][fill][fill][fill][fill][fill]",
		"[][][][][][][][][][][][][][][][]"));
*/
	//---- label1 ----
	label1.setText("Reporting Tool");
	add(label1, "cell 3 1");

	//---- button3 ----
	button3.setText("Update");
	add(button3, "cell 4 2");

	//---- button4 ----
	button4.setText("Clear");
	add(button4, "cell 6 2");

	//---- label2 ----
	label2.setText("Project :");
	add(label2, "cell 0 3");

	//---- comboBox1 ----
	comboBox1.setModel(new DefaultComboBoxModel(new String[] {
		"MYOMSSTP",
		"MYIPASTP"
	}));
	add(projectName, "cell 1 3");

	//---- label3 ----
	label3.setText("Quater: ");
	add(label3, "cell 3 3");

	//---- comboBox2 ----
	comboBox2.setModel(new DefaultComboBoxModel(new String[] {
		"Quater1",
		"Quater2",
		"Quater3",
		"Quater4"
	}));
	add(comboBox2, "cell 4 3");

	//---- label4 ----
	label4.setText("Fixed Price");
	add(label4, "cell 0 4");
	System.out.println("Inside333");
	
	/*picker = new JXDatePicker();
    picker.setDate(Calendar.getInstance().getTime());
    picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));*/

    
  //---- label11 ----
  	label11.setText("Start Date");
  	add(label11, "cell 0 5");
    //add(picker, "cell 1 5");
    
    /*pickerEnd = new JXDatePicker();
    pickerEnd.setDate(Calendar.getInstance().getTime());
    pickerEnd.setFormats(new SimpleDateFormat("dd.MM.yyyy"));*/

    
  //---- label11 ----
  	label12.setText("End Date");
  	add(label12, "cell 2 5");
    //add(pickerEnd, "cell 3 5");
	
	//---- label5 ----
	//label5.setText("Price");
	//add(label5, "cell 0 5");
	//add(textField1, "cell 1 5");

	//---- label6 ----
	label6.setText("Amount :");
	add(label6, "cell 5 5");
	add(textField2, "cell 6 5");

	
	//---- button1 ----
	button1.setAction(action1);
	button2.setAction(action2);
	button3.setAction(action3);
	add(button1, "cell 0 6");
	add(Month1, "cell 1 6");
	add(Month2, "cell 2 6");
	add(Month3, "cell 3 6");

	//---- FPrice1 ----
	FPrice1.setText("");
	add(FPrice1, "cell 1 8");

	//---- FPrice2 ----
	FPrice2.setText("");
	add(FPrice2, "cell 2 8");

	//---- FPrice3 ----
	FPrice3.setText("");
	add(FPrice3, "cell 3 8");
	
	add(label5, "cell 3 9");

	//---- label7 ----
	label7.setText("Time Based Project");
	add(label7, "cell 0 10");

	//---- label8 ----
	//label8.setText("Price : ");
	//add(label8, "cell 0 11");
	//add(textField3, "cell 1 11");

	//---- label10 ----
	label10.setText("Effort Of Quater :");
	add(label10, "cell 0 12");
	add(textField5, "cell 1 11");

	//---- label9 --amount --
	label9.setText("Amount :");
	add(label9, "cell 0 11");
	add(textField6, "cell 1 12");
	add(textField7, "cell 2 12");
	add(textField4, "cell 3 12");

	//---- button2 ----
	button2.setText("Done");
	add(button2, "cell 0 14");

	//---- TMonth1 ----
	TMonth1.setText("");
	add(TMonth1, "cell 1 14");

	//---- TMonth2 ----
	TMonth2.setText("");
	add(TMonth2, "cell 2 14");

	//---- TMonth3 ----
	TMonth3.setText("");
	add(TMonth3, "cell 3 14");

	//---- TPrice1 ----
	TPrice1.setText("");
	add(TPrice1, "cell 1 15");

	//---- TPrice2 ----
	TPrice2.setText("");
	add(TPrice2, "cell 2 15");

	//---- TPrice3 ----
	TPrice3.setText("");
	add(TPrice3, "cell 3 15");
	
	add(label8, "cell 3 16");
	
	//panel.add(picker);
	                      
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	setResizable(true);
	setVisible(true);


}


private class Report extends AbstractAction {
	private Report() {
		// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Anjali Kissan
		putValue(NAME, "Done");
		// JFormDesigner - End of action initialization  //GEN-END:initComponents
	}

	public void actionPerformed(ActionEvent e) {
		// TODO add your code here
		String combo = comboBox2.getSelectedItem().toString();
		//if(e.getSource())
		if(combo == "Quater1")
		{
			Month1.setText("Apr");
			Month2.setText("May");
			Month3.setText("June");
		}
		else if(combo == "Quater2")
		{
			Month1.setText("Jul");
			Month2.setText("Aug");
			Month3.setText("Sep");
		}
		else if(combo == "Quater3")
		{
			Month1.setText("Oct");
			Month2.setText("Nov");
			Month3.setText("Dev");
		}
		else if(combo == "Quater4")
		{
			Month1.setText("Jan");
			Month2.setText("Feb");
			Month3.setText("Mar");
		}
		else
		{
			JOptionPane.showInputDialog(this,"Please select Quater");
		}
		
		//Date startDate= picker.getDate();
		Date startDate= new Date();
		String strDate = DateFormat.getDateInstance().format(startDate);
		//JOptionPane.showInputDialog(this,strDate);
		
		Calendar cStart=Calendar.getInstance();
		cStart.setTime(startDate);
       
        
        int startDateMonthDays=cStart.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("startDateMonthDays : "+ startDateMonthDays);
        
        int startDay = cStart.get(Calendar.DAY_OF_MONTH);
        //System.out.println("startDay : "+ startDay);
        
        int startCountDays  = startDateMonthDays - startDay  + 1;
        
        if(startCountDays == 1)
        {
        	startCountDays = startDateMonthDays;
        }
        
        System.out.println("startCountDays : "+ startCountDays);
        
        //Date endDate= pickerEnd.getDate();
        Date endDate= new Date("2016-09-30");
		String endDates = DateFormat.getDateInstance().format(endDate);
		//JOptionPane.showInputDialog(this,endDates);
		
		Calendar cEnd=Calendar.getInstance();
		cEnd.setTime(endDate);
		
		int endDateMonthDays=cEnd.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("endDateMonthDays : "+endDateMonthDays);
		
		int endDay = cEnd.get(Calendar.DAY_OF_MONTH);
        System.out.println("endDay : "+ endDay);
		
        int endCountDays  = endDateMonthDays - endDay + 1;
        if(endCountDays == 1)
        {
        	endCountDays = endDateMonthDays;
        }
        
        System.out.println("endCountDays : "+ endCountDays);
        
        int increment = 0;
		  
		//int month = (cEnd.get(Calendar.MONTH) + 12) - cStart.get(Calendar.MONTH); 
		int month;
		if ((cStart.get(Calendar.MONTH) + increment) > cEnd.get(Calendar.MONTH)) {
            month = (cEnd.get(Calendar.MONTH) + 12) - (cStart.get(Calendar.MONTH) + increment);
            increment = 1;
        } else {
            month = (cEnd.get(Calendar.MONTH)) - (cStart.get(Calendar.MONTH) + increment);
            increment = 0;
        }
		System.out.println("Months Difference:"+ month);
		
		if (month >3)
		{
			JOptionPane.showMessageDialog(null, "Quater contains only 3 months!");
			
		}
		else
		{
			//int months = monthsBetween(startDate, endDate).getMonths();
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(endDate);
			cal.add(Calendar.MONTH, -1);
			Date result = cal.getTime();
			//System.out.println("Date" + result);
			int day = cal.get(Calendar.DAY_OF_MONTH);
			//System.out.println("day of month" + day);
			int middleMonthDays= cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
			System.out.println("days of month.." + middleMonthDays);
			
			long totalDaysofQuater = middleMonthDays +  startCountDays + endCountDays;
			
			System.out.println(".totalDaysofQuater." + totalDaysofQuater);
			
			DecimalFormat dfStart = new DecimalFormat();
			dfStart.setMaximumFractionDigits(2);
			
			
			
			float FPMonth1 = (Float.parseFloat(textField2.getText()) * startCountDays) / totalDaysofQuater ;
			float FPMonth2 = (Float.parseFloat(textField2.getText()) * middleMonthDays) / totalDaysofQuater ;
			float FPMonth3 = (Float.parseFloat(textField2.getText()) * endCountDays) / totalDaysofQuater ;
			
			System.out.println("FPMonth1 : "+FPMonth1);
			
			FPrice1.setText(dfStart.format(FPMonth1));
			FPrice2.setText(dfStart.format(FPMonth2));
			FPrice3.setText(dfStart.format(FPMonth3));
			
			label5.setText("Total Effort of Full Tenure : " + totalDaysofQuater);
			
		}
	}
	
	
	
	
}

private class ReportTotalAmount extends AbstractAction {
	private ReportTotalAmount() {
		// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Anjali Kissan
		putValue(NAME, "Update");
		// JFormDesigner - End of action initialization  //GEN-END:initComponents
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		Float FPPrice1 = Float.parseFloat(FPrice1.getText().replaceAll("[,]","")); 
		Float FPPrice2 = Float.parseFloat(FPrice2.getText().replaceAll("[,]","")); 
		Float FPPrice3 = Float.parseFloat(FPrice3.getText().replaceAll("[,]","")); 
		Float TPPrice1 = Float.parseFloat(TPrice1.getText().replaceAll("[,]","")); 
		Float TPPrice2 = Float.parseFloat(TPrice2.getText().replaceAll("[,]",""));
		Float TPPrice3 = Float.parseFloat(TPrice3.getText().replaceAll("[,]","")); 
		
		//float sumOfQuater = Float.parseFloat(FPrice1.getText().trim()) + Float.parseFloat(FPrice2.getText().trim()) + Float.parseFloat(FPrice3.getText().trim()) + Float.parseFloat(TPrice1.getText().trim()) +Float.parseFloat(TPrice2.getText().trim()) + Float.parseFloat(TPrice3.getText().trim());
		float sumOfQuater = FPPrice1 + FPPrice2 + FPPrice3 + TPPrice1 + TPPrice2 +TPPrice3;
		JOptionPane.showMessageDialog(null, "Total of Quater :" + sumOfQuater);
	
	}
}

private class ReportTP extends AbstractAction {
	private ReportTP() {
		// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Anjali Kissan
		putValue(NAME, "Done");
		// JFormDesigner - End of action initialization  //GEN-END:initComponents
	}

	public void actionPerformed(ActionEvent e) {
		// TODO add your code here
		String combo = comboBox2.getSelectedItem().toString();
		//if(e.getSource())
		if(combo == "Quater1")
		{
			TMonth1.setText("Apr");
			TMonth2.setText("May");
			TMonth3.setText("June");
		}
		else if(combo == "Quater2")
		{
			TMonth1.setText("Jul");
			TMonth2.setText("Aug");
			TMonth3.setText("Sep");
		}
		else if(combo == "Quater3")
		{
			TMonth1.setText("Oct");
			TMonth2.setText("Nov");
			TMonth3.setText("Dev");
		}
		else if(combo == "Quater4")
		{
			TMonth1.setText("Jan");
			TMonth2.setText("Feb");
			TMonth3.setText("Mar");
		}
		else
		{
			JOptionPane.showInputDialog(this,"Please select Quater");
		}
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
		
		float TPTotalEfforts = (Float.parseFloat(textField6.getText()) + Float.parseFloat(textField7.getText()) + Float.parseFloat(textField4.getText()));
		
		float TPMonth1 = (Float.parseFloat(textField5.getText()) * Float.parseFloat(textField6.getText())) / TPTotalEfforts ;
		float TPMonth2 = (Float.parseFloat(textField5.getText()) * Float.parseFloat(textField7.getText())) / TPTotalEfforts ;
		float TPMonth3 = (Float.parseFloat(textField5.getText()) * Float.parseFloat(textField4.getText())) / TPTotalEfforts ;
		
		TPrice1.setText(df.format(TPMonth1));
		TPrice2.setText(df.format(TPMonth2));
		TPrice3.setText(df.format(TPMonth3));
		
		//JOptionPane.showInputDialog(this,comboBox2.getSelectedItem());
		
		label8.setText("Total Effort of Full Tenure : " + TPTotalEfforts);
		
		
	}
}

	
public static void main(String[] args) { 
new RegistrationForm(); 
//new ReportForm1();
}


public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}

}
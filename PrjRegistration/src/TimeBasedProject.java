import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.sql.Date; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TimeBasedProject {




    public static void main(String[] args){

        

        // create JFrame and JTable

        JFrame frame = new JFrame();

        final JTable table = new JTable(); 

        

        // create a table model and set a Column Identifiers to this model 

        Object[] columns = {"Role","NoOfDays","Efforts","Onsite/Offshore","Amount","Billing"};

        final DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        

        // set the model to the table

        table.setModel(model);

        

        // Change A JTable Background Color, Font Size, Font Color, Row Height

        table.setBackground(Color.LIGHT_GRAY);

        table.setForeground(Color.black);

        Font font = new Font("",1,22);

        table.setFont(font);

        table.setRowHeight(30);

        

        // create JTextFields

         final JTextField txtRole = new JTextField();

         final JTextField txtNoOfDays = new JTextField();

         final JTextField txtEfforts = new JTextField();

         final JTextField txtAmount = new JTextField();
         
         final JLabel lblRole = new JLabel("Role : ");
         final JLabel OnSitOff = new JLabel();
         
         
    
         
         final JLabel lblNoOfDays = new JLabel("No Of Days : ");
         
         final JLabel lblEffort = new JLabel("Efforts : ");
         
         
         
         final JLabel lblAmount = new JLabel("Amount : ");
         
         final JRadioButton offshore;
         
		final JRadioButton onsite;
         
         offshore = new JRadioButton("Offshore");
         offshore.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			OnSitOff.setText("Offshore");
     		}
     	});
         
         
         
         onsite = new JRadioButton("Onsite");
         onsite.addActionListener(new ActionListener() {
      		public void actionPerformed(ActionEvent e) {
      			OnSitOff.setText("onsite");
      		}
      	});
        
         
         ButtonGroup bg = new ButtonGroup();

         bg.add(offshore);
         bg.add(onsite);
        

        // create JButtons

        JButton btnAdd = new JButton("Add");

        JButton btnDelete = new JButton("Delete");

        JButton btnUpdate = new JButton("Update");   
        
        JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));

        
        lblRole.setBounds(10, 20, 100, 25);
        txtRole.setBounds(50, 20, 100, 25);
        
        lblNoOfDays.setBounds(200, 20, 200, 25);
        txtNoOfDays.setBounds(280, 20, 100, 25);

        lblEffort.setBounds(400, 20, 100, 25);
        txtEfforts.setBounds(450, 20, 100, 25);
        
        offshore.setBounds(580, 20, 100, 25);
        onsite.setBounds(580, 40, 100, 25);
        
        lblAmount.setBounds(680, 20, 250, 25);
        txtAmount.setBounds(750, 20, 100, 25);

        

        btnAdd.setBounds(50, 100, 100, 25);

        btnUpdate.setBounds(200, 100, 100, 25);

        btnDelete.setBounds(350, 100, 100, 25);
        
        picker.setBounds(500, 100, 100, 25);

        

        // create JScrollPane

        JScrollPane pane = new JScrollPane(table);

        pane.setBounds(10, 150, 800, 200); 

        

        frame.setLayout(null);

        

        

        

        // add JTextFields to the jframe
        
        frame.add(lblRole);

        frame.add(txtRole);
        
        frame.add(lblNoOfDays);

        frame.add(txtNoOfDays);
        
        frame.add(lblEffort);
        frame.add(txtEfforts);
        
        frame.add(lblAmount);
        frame.add(txtAmount);
        frame.add(offshore);
        
        frame.add(onsite);
        
       frame.add(picker);

    

        // add JButtons to the jframe

        frame.add(btnAdd);

        frame.add(btnDelete);

        frame.add(btnUpdate);
        
        frame.add(pane);

        

        // create an array of objects to set the row data

        final Object[] row = new Object[6];

        

        // button add row

        btnAdd.addActionListener(new ActionListener(){




            public void actionPerformed(ActionEvent e) {

             

                row[0] = txtRole.getText();
                row[1] = txtNoOfDays.getText();
                row[2] = txtEfforts.getText();
                row[3] = OnSitOff.getText();
               
                
                Float fbilling = Float.parseFloat(txtNoOfDays.getText()) * Float.parseFloat(txtEfforts.getText()) *  Float.parseFloat(txtAmount.getText());

                row[4] = txtAmount.getText();
                
                row[5] = fbilling;

                // add row to the model
                model.addRow(row);
                
                // append data to excel sheet
                try{
	                File excel = new File("C:\\Users\\1229632\\workspace\\PrjRegistration\\Book1.xlsx"); 
	                FileInputStream fis = new FileInputStream(excel); 
	                XSSFWorkbook book = new XSSFWorkbook(fis); 
	                XSSFSheet sheet = book.getSheetAt(0); 
	                // writing data into XLSX file 
	                Map<String, Object[]> newData = new HashMap<String, Object[]>(); 
	                newData.put("0" , new Object[] { 0, txtRole.getText(), txtNoOfDays.getText(), txtEfforts.getText(), 
	                		OnSitOff.getText(), txtAmount.getText(), fbilling }); 			
	                
	                int rownum = sheet.getLastRowNum(); 
	                Row row = sheet.createRow(rownum++); 
	                Object[] objArr = newData.get(0); 
	                int cellnum = 0; 
	                for (Object obj : objArr) { 
	                	Cell cell = row.createCell(cellnum++); 
	                	if (obj instanceof String) { 
	                		cell.setCellValue((String) obj); } 
	                	else if (obj instanceof Boolean) { 
	                		cell.setCellValue((Boolean) obj); } 
	                	else if (obj instanceof Date) { 
	                		cell.setCellValue((Date) obj); } 
	                	else if (obj instanceof Double) { 
	                		cell.setCellValue((Double) obj); } 
	                } 
	                // open an OutputStream to save written data into Excel file 
	                FileOutputStream os = new FileOutputStream(excel); 
	                book.write(os); 
	                System.out.println("Writing on Excel file Finished ..."); 
	                // Close workbook, OutputStream and Excel file to prevent leak 
	                os.close(); 
	                book.close(); 
	                fis.close();
                }
                catch (FileNotFoundException fe) { fe.printStackTrace(); } 
        		catch (IOException ie) { ie.printStackTrace(); } 
            }

        });

        

        // button remove row

        btnDelete.addActionListener(new ActionListener(){




            public void actionPerformed(ActionEvent e) {

            

                // i = the index of the selected row

                int i = table.getSelectedRow();

                if(i >= 0){

                    // remove a row from jtable

                    model.removeRow(i);

                }

                else{

                    System.out.println("Delete Error");

                }

            }

        });

        

        // get selected row data From table to textfields 

        table.addMouseListener(new MouseAdapter(){

        

        @Override

        public void mouseClicked(MouseEvent e){

            

            // i = the index of the selected row

            int i = table.getSelectedRow();

            

            txtRole.setText(model.getValueAt(i, 0).toString());

            txtNoOfDays.setText(model.getValueAt(i, 1).toString());

            txtEfforts.setText(model.getValueAt(i, 2).toString());

            txtAmount.setText(model.getValueAt(i, 4).toString());

        }

        });

        

        // button update row

        btnUpdate.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		// i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0) 
                {
                   model.setValueAt(txtRole.getText(), i, 0);
                   model.setValueAt(txtNoOfDays.getText(), i, 1);
                   model.setValueAt(txtEfforts.getText(), i, 2);                 
             
                   Float fbilling = Float.parseFloat(txtNoOfDays.getText()) * Float.parseFloat(txtEfforts.getText()) *  Float.parseFloat(txtAmount.getText());
                   
                   model.setValueAt(OnSitOff.getText(), i, 3);
                   model.setValueAt(txtAmount.getText(), i, 4);
                   model.setValueAt(fbilling, i, 5);
                  
                }

                else{

                    System.out.println("Update Error");

                }

            }

        });

        

        frame.setSize(900,400);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        

    }

}
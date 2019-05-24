package practicepackage;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

public class ImagePdf {      
   public static void main(String args[]) throws Exception {              
      
	  File f=new File("testpdf.pdf");
	  FileOutputStream fo=new FileOutputStream(f);
	  Document doc=new Document();
	  String fname= "D:\\PDF Jars\\home_nav.png";
	  Image img=Image.getInstance(fname);
	  doc.add(img);
	     
   } 
}

package PdfDemo;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;  
  
public class Main {   
  
    public static void main(String[] args)throws IOException {  
        //Creating PDF document object  
//    	 PDDocument doc = new PDDocument();      
//         
//    	    for (int i=0; i<5; i++) {  
//    	    //Creating a blank page   
//    	              PDPage blankPage = new PDPage();  
//    	  
//    	    //Adding the blank page to the document  
//    	    doc.addPage( blankPage );  
//    	           }   
//    	
    	File file =new File("E:\\java/sample.pdf");
          PDDocument doc = PDDocument.load(file); 
//          
//          PDPage page = doc.getPage(0);  
//          PDPageContentStream contentStream = new PDPageContentStream(doc, page);
//          
//          contentStream.beginText();   
//         
        //Setting the font to the Content stream    
//          contentStream.setFont(PDType1Font.TIMES_BOLD_ITALIC, 14); 
//          contentStream.setLeading(14.5f);  
//          
//        //Setting the position for the line   
////          contentStream.newLineAtOffset(25, 700); 
//          contentStream.newLineAtOffset(20, 450);  
//          
//          String text = "Hi!!! This is the first sample PDF document."; 
//          String text1 = "Hi!!! This is the multiple text content example.";  
//          String Line1 = "Here, we discussed about how to add text content in the pages of the PDF document.";  
//          String Line2 = "We do this by using the ShowText() method of the ContentStream class";  
//
//   //Adding text in the form of string   
//   contentStream.showText(text1);
//    contentStream.newLine();  
//    contentStream.showText(Line1);  
//    contentStream.newLine();  
//    contentStream.showText(Line2);
//  
//    //Ending the content stream  
//    contentStream.endText();  
    
    
  
//          System.out.println("multiple Text Content is added in the PDF Document.");
          
          
          
//  
//    //Closing the content stream  
//          contentStream.close();
          
          
//        
//          int noOfPages= doc.getNumberOfPages();  
////          
//          System.out.print(noOfPages);  
//      
          
          
//    //Removing the pages  
//    doc.removePage(4);  
////      
//          System.out.println("Page removed successfully."); 
          
          
          
          //Instantiate PDFTextStripper class  
//          PDFTextStripper pdfStripper = new PDFTextStripper();  
  
    //Retrieving text from PDF document  
//          String text = pdfStripper.getText(doc);  
//          System.out.println("Text in PDF\n---------------------------------");  
//          System.out.println(text);  
          
          
       // Create a Splitter object  
          Splitter splitter = new Splitter();  
  
    //splitting the pages of a PDF document  
          List<PDDocument>Pages = splitter.split(doc);  
  
    //Creating an iterator object  
          Iterator<PDDocument>iterator = Pages.listIterator();  
  
    //saving splits as individual PDF document  
    int i = 1;  
    while(iterator.hasNext()) {  
             PDDocument pd = iterator.next();  
    pd.save("/E:\\java/sample"+ i++ +".pdf");  
          }  
          System.out.println("Multiple PDF files are created successfully.");  
          
//    //Saving the document  
//    doc.save(new File("E:\\java/sample.pdf"));        
//          System.out.println("PDF created");    
//      
          
          
    //Closing the document    
    doc.close();  
    }  
}  
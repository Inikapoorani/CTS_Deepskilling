package FactoryMethodPatternExample;

interface Document{
    void open();
}
class WordDocument implements Document{
    public void open(){
        System.out.println("The word document is opened");
    }
}
class PdfDocument implements Document{
    public void open(){
        System.out.println("The pdf document is opened");
    }
}
class ExcelDocument implements Document{
    public void open(){
        System.out.println("The text document is opened");
    }
}
abstract class DocumentFactory{
    abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory{
    Document createDocument(){
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory{
    Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    Document createDocument(){
        return new ExcelDocument();
    }
}
public class FactoryTest {
    public static void main(String args[]) {

        DocumentFactory dfobj = new WordDocumentFactory();
        Document docobj = dfobj.createDocument();
        docobj.open();
        dfobj = new PdfDocumentFactory();
        docobj = dfobj.createDocument();
        docobj.open();
        dfobj = new ExcelDocumentFactory();
        docobj = dfobj.createDocument();
        docobj.open();
    }
}
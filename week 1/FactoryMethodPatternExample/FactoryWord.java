public class FactoryWord extends DocumentFactory implements WordDocument {

    @Override
    public void createDocument() {
        System.out.println("Creating Word Document....");
    }

    @Override
    public void createWordDocument() {
        System.out.println("Word Document created.");
    }
}

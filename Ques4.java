public class Ques4 {
    public static void main(String[] args) {
        child C=new child("Ganesh","Sayoni","Shiva","Lakshmi");
    }
}
class GrandParent{
    String grandFatherName;
    String grandMotherName;
    GrandParent(){}

    public GrandParent(String grandFatherName,String grandMotherName){
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;

        System.out.println("Name of Grand Father is "+grandFatherName+" ,Name of Grand mother is "+grandMotherName);
    }
}
class parent extends GrandParent{
    String fatherName;
    String motherName;
    parent(){}
    public  parent (String fatherName, String motherName, String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);

        System.out.println("Name of Father is " + fatherName + " ,Name of mother is " + motherName);
    }
}
class child extends parent{
    public child (String grandFatherName,String grandMotherName,String fatherName,String motherName){
        super (grandFatherName,grandMotherName,fatherName,motherName);
    }

}
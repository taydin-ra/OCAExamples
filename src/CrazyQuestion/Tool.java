package CrazyQuestion;

interface Exportable{
   void export();
}
public class Tool  implements Exportable{
    @Override
    public  void export() {
        System.out.println("Tool: export");

    }

}
class ReportTool extends Tool implements Exportable{

    public void export() {
        System.out.println("RTool: export");

    }
}



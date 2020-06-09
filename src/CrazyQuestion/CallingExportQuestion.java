package CrazyQuestion;

public class CallingExportQuestion {
    public static void main(String[] args) {
        Tool atool= new ReportTool();
        Tool btool= new Tool();
        callExport(atool);
        callExport(btool);
    }

    public static void callExport(Exportable ex){
        ex.export();
    }
}

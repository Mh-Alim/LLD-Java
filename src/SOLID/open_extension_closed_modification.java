package SOLID;


interface invoiceDao {
    void save();
}

class SqlDbInvoiceDao implements invoiceDao  {
    @Override
    public void save() {
        System.out.println("Save invoice into MySQL DB");
    }
}

class NoSQLDbInvoiceDao implements  invoiceDao {
    @Override
    public void save() {
        System.out.println("Save invoice into NoSQL DB");
    }
}

class FileInvoiceDao implements  invoiceDao {
    @Override
    public void save() {
        System.out.println("Save invoice into File");
    }
}
public class open_extension_closed_modification {
    String name = "alim";
    public static void main(String[] args) {
        SqlDbInvoiceDao sqlObj = new SqlDbInvoiceDao();
        NoSQLDbInvoiceDao noSqlObj = new NoSQLDbInvoiceDao();
        FileInvoiceDao fileObj = new FileInvoiceDao();
        sqlObj.save();
        noSqlObj.save();
        fileObj.save();
    }
}

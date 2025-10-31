package Singleton;

public class DBConn {

    private static DBConn instance;

    private DBConn (){};

    public static DBConn getInstance() {

        if (instance == null) {
            instance = new DBConn();
        }
        return instance;
    }

    public void connecta(){
        System.out.println("Conecta com o banco de dados!");
    }

    public static void main(String[] args) {
        DBConn db1 = DBConn.getInstance();
        DBConn db2 = DBConn.getInstance();

        db1.connecta();
        db2.connecta();
    }
}
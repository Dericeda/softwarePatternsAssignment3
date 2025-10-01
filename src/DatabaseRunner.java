public class DatabaseRunner {
    public static void main(String[] args){
        IDatabase database = new JavaAplicationAdapter();

        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}

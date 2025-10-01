public class JavaAplicationAdapter extends JavaApplication implements IDatabase{
    public void  insert(){
        saveObject();
    }
    public void  update(){
        updateObject();
    }
    public void  select(){
        loadObject();
    }
    public void  remove(){
        deleteObject();
    }
}

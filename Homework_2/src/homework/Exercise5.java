package homework;

public class Exercise5 {
    public static void main(String[] args) {
        CocheCRUD prueba = new CocheCRUDImpl();
        prueba.delete();
        prueba.findAll();
        prueba.save();
    }

    public static class CocheCRUDImpl implements CocheCRUD{
         public void save(){
            System.out.println("save");
        }
         public void findAll(){
            System.out.println("findAll");
        }
         public void delete(){
            System.out.println("delete");
        }
    }

    public interface CocheCRUD{
        void save();
        void findAll();
        void delete();
    }
}

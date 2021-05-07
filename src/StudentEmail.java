public class StudentEmail {
    public static final String EMAIL = "@iaau.edu.kg";
    private String ID;
    private String name;

    public StudentEmail(){}

    public StudentEmail(String ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return  ID + '\t'  + name + '\t' + name + EMAIL;
    }
}

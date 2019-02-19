package ca.pledgetovote.model;

//import java.time.LocalDate;
import java.util.Date;

public class Pledge {
    private long id;
    private  String name;
    private  String statement;
    //private Date now;


    public Pledge(){

    }

    public Pledge(long id, String name, String statement) {
        this.id = id;
        this.name = name;
        this.statement = statement;
        //this.now = now;
    }

    public Pledge(long id, String name, String statement, Date now) {
        this.id = id;
        this.name = name;
        this.statement = statement;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   // public void setNow(Date now) {
     //   LocalDate now = LocalDate.now();
    //}

    //public Date getNow() {
      //  return now;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}

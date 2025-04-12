public class Class{
private int id;
private int roll;
private String name;

public void setId(int Id){
id=Id;
}

public void setRoll(int Roll){
roll=Roll;
}

public void setName(String Name)
{
name=Name;
}

public int getId(){
return id;
}

public int getRoll(){
return roll;
}

public String getName(){
return name;
}

public static Class getDetails(int id, int roll, String name){
Class c=new Class();
c.setId(id);
c.setRoll(roll);
c.setName(name);

return c;
}
}
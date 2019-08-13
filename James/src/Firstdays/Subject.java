package Firstdays;

public class Subject {
 private String code;
private String name;
private String grade;
private float unit;

public void setgrade(String grade){
	this.grade=grade;
}
public String getgrade(){
	return grade;
}

public void setnaem(String name){
	this.name=name;
}
public String getname(){
	return name;
}

public void setcode(String code){
	this.code=code;
}
public String getcode(){
	return code;
}

public void setunit(float unit){
	this.unit=unit;
}
public float getunit(){
	return unit;
}

public String toString(){
	return "Code:" + code + ","+ "Name: " + name +  "," + "Unit: " 
            + unit + ","+"Grade: "+grade;
}


}

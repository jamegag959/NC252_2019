package Firstdays;

public class RegistrationRecord {
 private Student student;
 private Subject[] subjects;
 private int count;
  
 public RegistrationRecord(){
	 count = 0; 
	 student = new Student();
	  subjects= new Subject[10];
	  for(int i=0;i<10; i++){
		  subjects[i]=new Subject();
	  }
  }

  public RegistrationRecord(int n){
	  count = 0 ;
	  student = new Student();
	  subjects= new Subject[n];
	  for(int i=0;i<10; i++){
		  subjects[i]=new Subject();
	  }
  }

  public void addSubject(Subject s ){
	  if(count < subjects.length - 1){
		  subjects[count] = s ;
		  count++;
	  }
  }
 public void  display(){
  for (int i =0; i<count ; i++)
 System.out.println(subjects[i]);
 }




}

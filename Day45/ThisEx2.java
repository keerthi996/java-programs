    class Student{  
        int rollno=16;
        void name(){
            System.out.println("Keerthi");
        }  
        void rollno(){  
            System.out.println(rollno);  
            
        } 
        void details() {
            this.name();
            this.rollno();
        }
    }  
    class ThisEx2{  
        public static void main(String args[]){  
            Student s=new Student();  
            s.details();  
        }
    }  
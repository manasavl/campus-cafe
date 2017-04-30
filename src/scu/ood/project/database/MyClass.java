package scu.ood.project.database;

public class MyClass {

			        int x = 5;
			        int getX(){ return x; }

			        public static void main(String args[]) throws Exception{
			            MyClass tc = new MyClass();
			            tc.looper();
			            System.out.println("hello" +tc.x);
			        }
			        
			        public void looper(){
			            int x = 0;
			            while( (x = getX()) != 0 ){
			                for(int m = 10; m >= 0; m--){
			                    x = m;
			                }
			            }
			            
			       }     
			
}


public class forloop {
    public static void main(String args[]){
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Days " + i);
            for (int j = 1; j <= 9; j++){
                System.out.println("    " + (j + 8) + " - " + (j + 9));
            }
            
        }
    }
}
/*
 * for loop in java:
 * initialization and condition -> is executed first
 * after that block is executed
 * then step part is executed
 * this is done repeatedly 
 * 
 * 
 * 
 */
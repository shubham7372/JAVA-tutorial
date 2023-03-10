// print all ascii value ?
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char x= 65 ;
        int i,j,key ;
        for(j=2; j<16; j++) {
            System.out.println(j * 16 + ":");
            for (i = 0; i<16; j++) {
                key = j*16 + i;
                System.out.println((char) key + " ");
            }
            System.out.println();
        }
    }
}
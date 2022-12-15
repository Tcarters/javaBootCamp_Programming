public class Break {
    
    public static void main ( String args[]) {

        System.out.println("----- Break Demo---------------");
        for ( int i =0; i< 4; i++) {
            for  ( int j = 0; j<10; j++) {
                if ( j == 2) {
                    break;
                }

                System.out.println("i:" + i + " j:" + j );
            }
        }

        System.out.println("----- Continue Demo---------------");
        for ( int i =0; i< 4; i++) {
            // for  ( int j = 0; j<10; j++) {
                if ( i == 2) {
                    continue;
                }

                System.out.println("i:" + i ) ; // + " j:" + j );
            }
 //   }

    }
}

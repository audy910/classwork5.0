public class aliasPractice
{
        public static void main(String args[]) {

            num n1 = new num(56);
            num n2 = new num(57);
            Integer i1 = new Integer(23);
            Integer i2 = new Integer(24);
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            System.out.println("i1: " + i1);
            System.out.println("i2: " + i2);
            System.out.println();
            n1 = n2;
            i1 = i2;
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            System.out.println("i1: " + i1);
            System.out.println("i2: " + i2);
            System.out.println();
            n2.setValue(n1.getValue()+1);
            i1++;
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            System.out.println("i1: " + i1);
            System.out.println("i2: " + i2);
            System.out.println();

        }

}//end class alias Practice

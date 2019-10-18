public class num
    {

        private int value;

        public num (int value)
        {
            this.value = value;
        }//end constructor

        public int getValue ()
        {
            return value;
        }
        public void setValue(int value)
        {
            this.value = value;
        }
        public String toString()
        {
            return "value is " + value;
        }

    }//end class num


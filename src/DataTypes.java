public class DataTypes {
    public static void main(String []args){
        long a=3232432432443L;//Must add 'L' for long
        float b =4.5f;//Must add 'f' or 'F' for float
        double d=2.4;
        System.out.println(a+"\n"+b+"\n"+d);
    }
}

//no of datatypes : 8
//byte :1 byte (8 bits) range : -128 - 127
//short : 2 byte        range : -2^15 - 2^15-1 (-32768 - 32767)
//int :4 byte           range : -2^31 - 2^31-1  (-2147483648 - 147483647)
// long :8 byte         range : -2^63 - 2^63-1
//above all data-type default value =0

//float : 4 byte
//double : 8 byte
//above two data-types default value =0.0

//char : 2 byte or (0 - 65535) (because of java support unicode ,but old languages (c,c++) only support ASCII value(<=256 charecters)
       // so 8 bits are enough
//but in java is support unicode values that is 256 (ASCII) + support many other characters (languages)
      // which is more than 1 byte so compulsory go to 16 bits
//char data-type default value =[]

//boolean : no size (depend on vartual machine )
//default value false


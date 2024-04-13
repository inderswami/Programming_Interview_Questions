public class Nan {
    public static void main(String[] args) {

        System.out.println(0.0/0.0);
        System.out.println(Math.sqrt(-1));
        System.out.println(Float.NaN==Float.NaN);
        //System.out.println(Float.NaN !==Float.NaN);
        System.out.println(9.0/0);
        System.out.println(12.33/0);
        //System.out.println(9/0);

        long longwithoutl=1000*60*60*24*365;
        long longwithl= 1000*60*60*24*365L;
        System.out.println(longwithoutl); //output: 1471228928 (32 bit)
        System.out.println(longwithl);// output:31536000000 (36 bit)

        // what is the value of double Min_value?:: 4.9E-324 positive value while intger or long will have negative value
        //which one is bigger -> Double Min_Value or 0.0d?
        //Which one is bigger ->Double Min_value or Negative_infinity?

        // Will static block execute with final varlable answer is no
        // Static block will execute before main method
        // Static block will be called automaticall first when class loads  and no need to call static block in main method wher as for static metod we need to call in main method
//system.out.println works: out ispart of printstream and native api will be used to initlize
// limit for no of parameter in static method is 255 and 254 for nonstatic method
       // To format the string use \
//  create Translator in java
        // filed value=String.class.getdeclaredfield("value")
        //value.setAccessible(true)
        //value.set("hello", value.get("holla"));
        // how to execute comments "u00d" to execute comments
        // compare url with ip address
        //System.out.println(new URL("https://abc.com").equls(new URL"https://192.168.2.1")); output: true
        //String joiner to format string in 1.8  Stringjoiner sj=new Stringjioner (",", "[", "]")
        // Why password stored in char array : writen in java documentattion , for ecurity reasons, string will keep the password and will not destroy after use but for char it will be replaced immediately
// why string is famous in hashmap ..because non string will create a new hashcode when values is updated, but string will not create new hashmap
 // Convert jpeg to png   URL url= new URL"imagereader.com"; bufferedImage read=Imageio.read(url);
//ImageIo.write(image,"jpeg",new file"path");
        // Find max, min from three positive numbers


        int i=(byte)+(char)-(int)+(long)-1;
        System.out.println(i);





    }

}
